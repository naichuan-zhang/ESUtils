package com.naichuan;

import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * 测试使用ES查询salary_payroll索引
 * @author 张乃川
 * @date 2021/7/20 15:08
 */
public class TestSalaryPayrollSearch {

    private RestHighLevelClient client;

    @Before
    public void init() {
        client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200))
        );
    }

    @Test
    public void testQueryAll() throws IOException {
        SearchRequest request = new SearchRequest();
        request.indices("salary_payroll");
        request.source(new SearchSourceBuilder().query(
                QueryBuilders.matchAllQuery()));

        SearchResponse response = client.search(request, RequestOptions.DEFAULT);

        SearchHits hits = response.getHits();
        System.out.println("Total hits: " + hits.getTotalHits());
        System.out.println("Time taken: " + response.getTook());

        for (SearchHit hit : hits) {
            System.out.println(hit.getId());
        }
    }

    @Test
    public void testQueryWithFilter() throws IOException {
        SearchRequest request = new SearchRequest();
        request.indices("salary_payroll");
        request.source(new SearchSourceBuilder().query(
                QueryBuilders.matchQuery("branchid", "12")));

        SearchResponse response = client.search(request, RequestOptions.DEFAULT);

        SearchHits hits = response.getHits();
        System.out.println("Total hits: " + hits.getTotalHits());
        System.out.println("Time taken: " + response.getTook());

        // Only show first 10 by default.
        for (SearchHit hit : hits) {
            System.out.println(hit.getId());
        }
    }

    @Test
    public void testQueryWithFilter2() throws IOException {
        SearchRequest request = new SearchRequest();
        request.indices("salary_payroll");
        request.source(new SearchSourceBuilder().query(
                QueryBuilders.matchQuery("field2", "张乃*")));
        request.types("_doc");

        SearchResponse response = client.search(request, RequestOptions.DEFAULT);

        SearchHits hits = response.getHits();
        System.out.println("Total hits: " + hits.getTotalHits());
        System.out.println("Time taken: " + response.getTook());

        // Only show first 10 by default.
        for (SearchHit hit : hits) {
            System.out.println(hit.getId());
        }
    }

    @After
    public void close() throws IOException {
        // 关闭ES客户端
        client.close();
    }
}
