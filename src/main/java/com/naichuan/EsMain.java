package com.naichuan;

import com.naichuan.utils.EsUtils;
import com.naichuan.utils.EsExcelExporter;
import org.elasticsearch.index.query.QueryBuilders;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The entry point for testing the performance of ElasticSearch when dealing with 500,000 data. The
 * results will be exported to Excel.
 *
 * @author 张乃川
 * @date 2021/7/20 17:15
 */
public class EsMain {

    private static final String FILE_PATH = "D:/upload/";

    public static void main(String[] args) throws IOException {
        String filepath = FILE_PATH + generateFilename() + ".xlsx";
        Map<String, String> map = new HashMap<>();
        map.put("jobno", "工号");
        map.put("serial_number", "导入序列号");
        map.put("field2", "姓名");
        map.put("field3", "手机号");

        EsExcelExporter utils = new EsExcelExporter(filepath, map);

        // 查询所有salary_payroll中所有jobno为“A028511”的document
        if (EsUtils.searchAndExportToExcel(utils, QueryBuilders.matchQuery("jobno", "A028511"),
                100, "salary_payroll")) {
            System.out.println("DONE!!!");
        } else {
            System.out.println("FAILED!!!");
        }
    }

    private static String generateFilename() {
        DateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        return formatter.format(new Date());
    }
}
