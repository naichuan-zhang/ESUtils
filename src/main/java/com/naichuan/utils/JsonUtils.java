package com.naichuan.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Deprecated
public final class JsonUtils {

    /**
     * Append the given string content to the end of the current file.
     *
     * @param filepath
     * @param content
     * @author 张乃川
     * @date 2021/7/20 17:10
     */
    public static void writeFile(String filepath, String content) {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(filepath);
            out.write(content.getBytes(StandardCharsets.UTF_8));
            out.write("\r\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.flush();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
