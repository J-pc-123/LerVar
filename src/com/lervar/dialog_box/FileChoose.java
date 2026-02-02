/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026
 * J_pc and/or his studios
 * All rights reserved
 */

package com.lervar.dialog_box;

import com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintLanguages;
import com.lervar.main.Type;

import java.io.File;
import java.util.Scanner;

//import static com.lervar.main.Main.language;

public class FileChoose implements OptionPrintLanguages {
    public static String filePath;
    public static void fileChoose() {
        System.out.println(ENTER_PULLING_PATH
                [0
//                 language
                ]
        );
        parseFilePath();
    }
    
    protected static void parseFilePath() {
        String extension = ".jar";
        filePath = new Scanner(System.in).next();
        File directory = new File(filePath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            
            if (files != null && hasJarFiles(filePath)) {
                int i = 1;
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(extension)) {
                        System.out.println(i + ". " + file.getName());
                    }
                }
            }
        } else {
//            System.out.println(LIST_PULLING_FILE[language]);
            parseFilePath();
        }
    }
    
    public static boolean hasJarFiles(String t_FilePath) {
        File t_Path = new File(t_FilePath);
        
        if (!t_Path.exists() || !t_Path.isDirectory()) {
            return false;
        }
        
        File[] jarFiles = t_Path.listFiles((dir, name) -> name.toLowerCase().endsWith(".jar"));
        
        return jarFiles != null && jarFiles.length > 0;
    }
    
    @Override
    public String[] optionPrintLanguages(Type t) {
        return new String[]{""};
    }
}
