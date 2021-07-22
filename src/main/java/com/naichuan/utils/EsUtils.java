package com.naichuan.utils;

import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.*;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetIndexResponse;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.Scroll;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * A utility class to manage ElasticSearch client, some common methods performing CRUD ops are also provided.
 *
 * @author 张乃川
 * @date 2021/7/20 17:20
 */
public final class EsUtils {

    // Default host name for ES client.
    private static final String HOST = "localhost";
    // Default port number for ES client.
    private static final int PORT = 9200;

    private static RestHighLevelClient client;
    private static RestClientBuilder clientBuilder;

    static {
        try {
            client = new RestHighLevelClient(getEsClientBuilder());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private EsUtils() {
    }

    /**
     * Get the {@link RestHighLevelClient} instance.
     *
     * @author 张乃川
     * @date 2021/7/22 10:34
     */
    public static RestHighLevelClient getEsClient() {
        return client;
    }

    /**
     * Get the {@link RestClientBuilder} instance.
     *
     * @author 张乃川
     * @date 2021/7/22 10:48
     */
    public static RestClientBuilder getEsClientBuilder() {
        if (clientBuilder == null) {
            return RestClient.builder(new HttpHost(HOST, PORT));
        }
        return clientBuilder;
    }

    /**
     * 使用该方法来重新配置client
     *
     * @param builder
     * @author 张乃川
     * @date 2021/7/22 14:00
     */
    public static RestHighLevelClient setEsClientBuilder(RestClientBuilder builder) {
        clientBuilder = builder;
        client = new RestHighLevelClient(clientBuilder);
        return client;
    }

    /**
     * 获取一个或多个index的信息
     * See <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-index.html">
     * Indices Get Index API on elastic.co</a>
     *
     * @param indices
     * @author 张乃川
     * @date 2021/7/22 11:45
     */
    public static GetIndexResponse getIndices(String... indices) throws IOException {
        GetIndexRequest getIndexRequest = new GetIndexRequest(indices);
        return client.indices().get(getIndexRequest, RequestOptions.DEFAULT);
    }

    /**
     * 创建一个index
     * See <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-create-index.html">
     * Create Index API on elastic.co</a>
     *
     * @param index The index to be created.
     * @return The response.
     * @author 张乃川
     * @date 2021/7/22 11:11
     */
    public static CreateIndexResponse createIndex(String index) throws IOException {
        CreateIndexRequest createIndexRequest = new CreateIndexRequest(index);
        return client.indices().create(createIndexRequest, RequestOptions.DEFAULT);
    }

    /**
     * 删除某个index
     * See <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-delete-index.html">
     * Delete Index API on elastic.co</a>
     *
     * @param index The index to be deleted.
     * @return The response.
     * @author 张乃川
     * @date 2021/7/22 11:11
     */
    public static AcknowledgedResponse deleteIndex(String index) throws IOException {
        DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest(index);
        return client.indices().delete(deleteIndexRequest, RequestOptions.DEFAULT);
    }

    /**
     * 从某个index中根据id获取一个document
     * See <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-get.html">Get API on elastic.co</a>
     *
     * @param id    The id of the document.
     * @param index The index to get the document from.
     * @return The response.
     * @author 张乃川
     * @date 2021/7/22 11:00
     */
    public static GetResponse getDocument(String id, String index) throws IOException {
        GetRequest getRequest = new GetRequest(index, id);
        return client.get(getRequest, RequestOptions.DEFAULT);
    }

    /**
     * 从某个index中根据id删除一个document
     * See <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-delete.html">Delete API on elastic.co</a>
     *
     * @param id    The id of the document.
     * @param index The index to get the document from.
     * @return The response.
     * @author 张乃川
     * @date 2021/7/22 11:00
     */
    public static DeleteResponse deleteDocument(String id, String index) throws IOException {
        DeleteRequest deleteRequest = new DeleteRequest(index, id);
        return client.delete(deleteRequest, RequestOptions.DEFAULT);
    }

    /**
     * 向某个index中插入一条document，数据格式为JSON
     * See <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-index_.html">Index API on elastic.co</a>
     *
     * @param index The index to insert the document to.
     * @return The response.
     * @author 张乃川
     * @date 2021/7/22 11:16
     */
    public static IndexResponse createDocumentInJson(String index, String jsonContent) throws IOException {
        IndexRequest indexRequest = new IndexRequest(index);
        indexRequest.source(jsonContent, XContentType.JSON);
        return client.index(indexRequest, RequestOptions.DEFAULT);
    }

    /**
     * 向某个index中批量插入document，数据格式为JSON
     * See <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-bulk.html">Bulk API on elastic.co</a>
     *
     * @param index The index to insert the document to.
     * @author 张乃川
     * @date 2021/7/22 11:24
     */
    public static BulkResponse createDocumentsInJson(String index, List<String> jsonContentList) throws IOException {
        BulkRequest bulkRequest = new BulkRequest();
        IndexRequest indexRequest;
        for (String jsonContent : jsonContentList) {
            indexRequest = new IndexRequest(index);
            indexRequest.source(jsonContent, XContentType.JSON);
            bulkRequest.add(indexRequest);
        }
        return client.bulk(bulkRequest, RequestOptions.DEFAULT);
    }

    /**
     * 根据提供的查询条件来从提供的indices中查询document记录，如果indices没有提供，则默认从所有已存在的index中查询数据
     * See <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/search-search.html">Search API on elastic.co</a>
     *
     * @param queryBuilder
     * @param indices      No indices provided here means that search will run against all indices.
     * @return The response.
     * @author 张乃川
     * @date 2021/7/22 11:31
     */
    public static SearchResponse searchDocuments(QueryBuilder queryBuilder, String... indices) throws IOException {
        SearchRequest searchRequest = new SearchRequest(indices);
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(queryBuilder);
        searchRequest.source(searchSourceBuilder);
        return client.search(searchRequest, RequestOptions.DEFAULT);
    }

    /**
     * 判断当前的索引名是否存在
     *
     * @param index The index name.
     * @return Whether the given index exists.
     * @author 张乃川
     * @date 2021/7/22 14:03
     */
    public static boolean ifExists(String index) throws IOException {
        GetIndexRequest getIndexRequest = new GetIndexRequest(index);
        return client.indices().exists(getIndexRequest, RequestOptions.DEFAULT);
    }

    /**
     * 获取当前index中满足条件的document的个数
     *
     * @param index The index name.
     * @return The total number of documents.
     * @author 张乃川
     * @date 2021/7/22 14:06
     */
    public static long countDocuments(String index, QueryBuilder queryBuilder) throws IOException {
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices(index);
        searchRequest.scroll(TimeValue.timeValueMinutes(1L));
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(queryBuilder);
        return client.search(searchRequest, RequestOptions.DEFAULT).getHits().getTotalHits().value;
    }

    /**
     * 查询并返回所有记录，不建议在数据量过大时使用
     *
     * @param index         The index name to search.
     * @param sourceBuilder
     * @return A list of {@link SearchHit}s.
     * @author 张乃川
     * @date 2021/7/22 14:16
     */
    public static SearchHit[] searchAll(String index, SearchSourceBuilder sourceBuilder) {
        final Scroll scroll = new Scroll(TimeValue.timeValueMinutes(1));
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices(index);
        searchRequest.source(sourceBuilder);
        searchRequest.scroll(scroll);
        try {
            SearchResponse result = client.search(searchRequest, RequestOptions.DEFAULT);
            String scrollId = result.getScrollId();
            SearchHit[] searchHits2 = result.getHits().getHits();
            List<SearchHit> searchHitList = new ArrayList<>();
            for (int i = 0; i < searchHits2.length; i++) {
                searchHitList.add(searchHits2[i]);
            }
            if (result.getHits().getTotalHits().value > 100000) {
                long count = searchHits2.length;
                while (count < 100000) {
                    SearchScrollRequest scrollRequest = new SearchScrollRequest(scrollId);
                    scrollRequest.scroll(scroll);
                    try {
                        result = client.scroll(scrollRequest, RequestOptions.DEFAULT);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    scrollId = result.getScrollId();
                    searchHits2 = result.getHits().getHits();
                    searchHitList.addAll(Arrays.asList(searchHits2));
                    long size = searchHits2.length;
                    count = count + size;

                }
                SearchHit[] searchHits = new SearchHit[searchHitList.size()];
                searchHitList.toArray(searchHits);
                return searchHits;
            } else {
                while (searchHits2.length > 0) {
                    SearchScrollRequest scrollRequest = new SearchScrollRequest(scrollId);
                    scrollRequest.scroll(scroll);
                    try {
                        result = client.scroll(scrollRequest, RequestOptions.DEFAULT);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    scrollId = result.getScrollId();
                    searchHits2 = result.getHits().getHits();
                    searchHitList.addAll(Arrays.asList(searchHits2));
                }
                SearchHit[] searchHits = new SearchHit[searchHitList.size()];
                searchHitList.toArray(searchHits);
                return searchHits;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new SearchHit[0];
    }

    /**
     * 查询并将数据导出到excel文件，数据查询条件可以自行配置
     *
     * @param excelUtils   Helper class for exporting data to Excel. See {@link EsExcelExporter}.
     * @param queryBuilder Customize the search query for this request.
     * @param size         The number of search hits to return.
     * @param indices      No indices provided here means that search will run against all indices.
     * @return Whether the attempt to export all queried data was successful.
     * @author 张乃川
     * @date 2021/7/21 8:34
     */
    public static boolean searchAndExportToExcel(EsExcelExporter excelUtils, QueryBuilder queryBuilder,
                                                 int size, String... indices) throws IOException {

        RestHighLevelClient client = EsUtils.getEsClient();
        SearchRequest request = new SearchRequest(indices);
        request.source(new SearchSourceBuilder().query(queryBuilder).size(size));
        request.types("_doc");
        request.scroll(TimeValue.timeValueMinutes(1L));

        SearchResponse response = client.search(request, RequestOptions.DEFAULT);
        String scrollId = response.getScrollId();
        SearchHit[] searchHits = response.getHits().getHits();
        long totalHits = response.getHits().getTotalHits().value;
        System.out.println("Total hits: " + totalHits);

        int count = 1;
        while (searchHits != null && searchHits.length > 0) {
            System.out.println("第" + count + "次打印数据...");
            for (SearchHit hit : searchHits) {
                Map<String, Object> esData = hit.getSourceAsMap();
                // Write content to Excel...
                try {
                    excelUtils.appendToExcel(esData);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            count++;
            SearchScrollRequest scrollRequest = new SearchScrollRequest(scrollId);
            scrollRequest.scroll(TimeValue.timeValueMinutes(1L));
            response = client.scroll(scrollRequest, RequestOptions.DEFAULT);
            scrollId = response.getScrollId();
            searchHits = response.getHits().getHits();
        }

        ClearScrollRequest clearScrollRequest = new ClearScrollRequest();
        clearScrollRequest.addScrollId(scrollId);
        ClearScrollResponse clearScrollResponse = client.clearScroll(clearScrollRequest, RequestOptions.DEFAULT);
        return clearScrollResponse.isSucceeded();
    }

    /**
     * 关闭ES Client
     *
     * @author 张乃川
     * @date 2021/7/22 10:50
     */
    public static void close() throws IOException {
        if (client != null) {
            client.close();
        }
    }
}
