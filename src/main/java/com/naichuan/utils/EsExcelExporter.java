package com.naichuan.utils;

import org.apache.poi.hssf.usermodel.*;
import org.elasticsearch.common.Strings;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A class to export data from ElasticSearch to an Excel.
 *
 * @author 张乃川
 * @date 2021/7/20 17:08
 */
public final class EsExcelExporter {

    private static final int FONT_SIZE = 14;
    private static final int ROW_HEIGHT = 30;
    private static final int COLUMN_WIDTH = 20;
    private static final String SHEET_NAME = "sheet1";

    /**
     * 包含文件名的全路径
     */
    private final String filepath;

    /**
     * 各个列的表头
     */
    private final String[] headList;

    /**
     * 各个列的元素key值
     */
    private final String[] headKey;

    /**
     * @param map key为数据库字段名，value为excel表表头名
     * @author 张乃川
     * @date 2021/7/21 14:40
     */
    public EsExcelExporter(String filepath, Map<String, String> map) {
        this.filepath = filepath;

        List<String> dbAttrs = new ArrayList<>();
        List<String> excelAttrs = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            // 数据库字段
            dbAttrs.add(entry.getKey());
            // Excel表对应字段
            excelAttrs.add(entry.getValue());
        }
        this.headKey = dbAttrs.toArray(new String[0]);
        this.headList = excelAttrs.toArray(new String[0]);
    }

    /**
     * 将ElasticSearch查询到的数据追加到当前的Excel文件中
     *
     * @param esRecord ElasticSearch查询到的一条记录（需要填充的一条数据记录）
     * @author 张乃川
     * @date 2021/7/21 9:53
     */
    public void appendToExcel(Map<?, ?> esRecord) throws IOException {
        if (this.headKey.length != this.headList.length) {
            return;
        }
        // Check if the excel exists
        File file = new File(filepath);
        boolean isNew = false;
        if (file.createNewFile()) {
            // New file is created.
            isNew = true;
        }
        FileInputStream in = new FileInputStream(file);
        try {
            HSSFWorkbook workbook;
            if (isNew) {
                workbook = new HSSFWorkbook();
            } else {
                workbook = new HSSFWorkbook(in);
            }
            if (workbook.getSheet(SHEET_NAME) == null) {
                workbook.createSheet(SHEET_NAME);
            }
            HSSFSheet sheet = workbook.getSheet(SHEET_NAME);

            HSSFRow firstRow;
            if (isNew) {
                // Init configurations
                sheet.setDefaultColumnWidth(COLUMN_WIDTH);
                //设置列表头样式，列表头居中
                HSSFCellStyle style = workbook.createCellStyle();
                //设置单元格样式
                style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
                style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
                //设置字体
                HSSFFont font = workbook.createFont();
                font.setFontName("宋体");
                font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
                font.setFontHeightInPoints((short) FONT_SIZE);
                style.setFont(font);
                // 给首行添加表头
                firstRow = sheet.createRow(0);
                // 加载列表头
                HSSFCell cellHead;
                for (int i = 0; i < headList.length; i++) {
                    cellHead = firstRow.createCell(i);
                    cellHead.setCellValue(headList[i]);
                    cellHead.setCellStyle(style);
                }
            }
            HSSFCellStyle rowStyle;
            //设置表头样式，表头居中
            rowStyle = workbook.createCellStyle();
            //设置单元格样式
            rowStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            rowStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
            //设置字体
            HSSFFont rowFont = workbook.createFont();
            rowFont.setFontName("宋体");
            rowFont.setFontHeightInPoints((short) FONT_SIZE);
            rowStyle.setFont(rowFont);

            firstRow = sheet.getRow(0);

            // 最后一行行号
            int lastRowNum = sheet.getLastRowNum();
            // 列数
            short lastCellNum = firstRow.getLastCellNum();

            // 创建一行新数据
            HSSFRow row = sheet.createRow(lastRowNum + 1);
            HSSFCell cell;
            // 将es数据追加到该行
            for (int i = 0; i < headKey.length; i++) {
                cell = row.createCell(i);
                cell.setCellStyle(rowStyle);
                Object valueObject = esRecord.get(headKey[i]);
                String value;
                if (valueObject == null) {
                    valueObject = "";
                }
                if (valueObject instanceof String) {
                    //取出的数据是字符串直接赋值
                    value = (String) esRecord.get(headKey[i]);
                } else if (valueObject instanceof Integer) {
                    //取出的数据是Integer
                    value = String.valueOf(((Integer) (valueObject)).floatValue());
                } else if (valueObject instanceof BigDecimal) {
                    //取出的数据是BigDecimal
                    value = String.valueOf(((BigDecimal) (valueObject)).floatValue());
                } else {
                    value = valueObject.toString();
                }
                cell.setCellValue(Strings.isNullOrEmpty(value) ? "" : value);
            }
            // 导出数据
            try {
                FileOutputStream out = new FileOutputStream(file);
                workbook.write(out);
                out.flush();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            in.close();
        }
    }
}
