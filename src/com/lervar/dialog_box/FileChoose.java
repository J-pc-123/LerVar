/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 *
 * @since 2025
 * Copyright (c) 2026
 * J_pc and/or his studios
 * All rights reserved
 */

package com.lervar.dialog_box;

import com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintLanguages;

import java.io.File;
import java.util.Scanner;

import static com.lervar.main.Main.language;

public class FileChoose implements OptionPrintLanguages {
    public static String filePath;
    public static void fileChoose() {
        System.out.println(ENTER_PULLING_PATH[language]);
        parseFilePath();
    }
    
    protected static void parseFilePath() {
        String extension = ".jar";
        filePath = new Scanner(System.in).next();
        File directory = new File(filePath);
        if (directory.exists() && directory.isDirectory()) {
            // 列出所有文件和目录
            File[] files = directory.listFiles();
            
            if (files != null) {
                int i = 1;
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(extension)) {
                        System.out.println(i + "." + file.getName());
                    }
                }
            }
        } else {
            System.out.println(LIST_PULLING_FILE[language]);
            parseFilePath();
        }
    }
}
