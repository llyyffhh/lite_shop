package com.ohayou.liteshop.utils;


import java.util.UUID;

/**
 * @author liyan
 * @date 2020/8/6 下午3:05
 */
public class FileUtils {

    public static String generateUploadFileName(String file) {
        String fileName = "";
        if (file.lastIndexOf(".") < 0) {
            fileName = (UUID.randomUUID().toString());
        } else {
            fileName = (UUID.randomUUID().toString()) + file.substring(file.lastIndexOf("."),file.length());
        }
        return fileName;
    }

}
