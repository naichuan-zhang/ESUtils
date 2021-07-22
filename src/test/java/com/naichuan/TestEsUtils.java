package com.naichuan;

import com.naichuan.utils.EsUtils;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.indices.GetIndexResponse;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;

import java.io.IOException;

/**
 * @author 张乃川
 * @date 2021/7/22 11:39
 */
public class TestEsUtils {

    @Test
    public void test() throws IOException {
        GetResponse response = EsUtils.getDocument("2239", "salary_payroll");
        System.out.println(response);
    }

    @Test
    public void test2() throws IOException {
        GetIndexResponse indices = EsUtils.getIndices("salary_payroll", "user");
        System.out.println(indices.getIndices().length);
    }

    @Test
    public void test3() throws IOException {
        long count = EsUtils.countDocuments("salary_payroll", QueryBuilders.matchAllQuery());
        System.out.println(count);
    }
}
