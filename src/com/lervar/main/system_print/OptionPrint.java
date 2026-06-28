/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main.system_print;

import com.lervar.dialog_box.FileChoose;
import com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface;
import com.lervar.main.LerVarException;
import com.lervar.main.Type;

import java.io.File;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import static com.lervar.main.Main.language;

public class OptionPrint implements OptionPrintInterface {
//    public static String[] languageArray = new String[255];
    public static String[][]
//        []
        tools = {
//            {
        {"Text"},{"text"}
//                    "文本", "文本"}
    };
    public static void optionPrint() throws Exception {
        LerVarException.tools$interfacesCannotMatchTypeExceptionInspect();
//        languageArray = new String[]{"English(UK)", "简体中文(Simplified Chinese)", "繁體中文(Traditional Chinese)"};
        int i;
//        for (String j : languageArray) {
//            System.out.print(i + ".");
//            System.out.println(j);
//            i++;
//        }
//        setLanguage();
        System.out.println("Installed plugins (" + getJarDirectory(OptionPrint.class) + PLUGIN_TEXT + "): (Beta)");
        for (i = 0; i <= getJarNames().size() - 1; i++) {
            System.out.println((i + 1) + ". " + getJarNames().get(i));
        }
        System.out.println("\nChoose patterns by entering numbers:");
        for (i = 1; i <= PATTERN[0].length; i++) {
            System.out.print(i + ".");
//            System.out.println(tools[i - 1]);
            System.out.println(PATTERN[0][i - 1]);
        }
//        System.out.println('\n' + "C." + CHOOSE_PLUGINS$_PATH[i - 1]);
//        System.out.println('\n' + "0." + CHOOSE_PLUGINS$_PATH[0][0]);
        chooseOption();
    }
    
    public static String getJarPath(Class<?> clazz) throws URISyntaxException {
        ProtectionDomain protectionDomain = clazz.getProtectionDomain();
        CodeSource codeSource = protectionDomain.getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI());
        return jarFile.getPath();
    }
    public static String getJarDirectory(Class<?> clazz) throws URISyntaxException {
        File jarFile = new File(getJarPath(clazz));
        return jarFile.getParent();
    }
//    public static int getJarCount(Class<?> clazz) throws URISyntaxException {
//        File dir = new File(getJarDirectory(clazz));
//        File[] jarCount = dir.listFiles();
//        if (jarCount != null) {
//            return jarCount.length;
//        }
//        return 0;
//    }
    public static List<String> getJarNames() throws URISyntaxException {
        File dir = new File(getJarDirectory(OptionPrint.class) + PLUGIN_TEXT);
        File[] files =dir.listFiles();
        List<String> jarNames = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().toLowerCase().endsWith(".jar")) {
                    jarNames.add(file.getName());
                }
            }
        }
        if (jarNames.isEmpty()) {
            jarNames.add("\b\b\b<No plugin>");
        }
        return jarNames;
    }
    
//    protected static void setLanguage() {
//        short languageKey = new Scanner(System.in).nextByte();
//        if (languageKey == 1)/////////////////////
//            language = 0;
//        else if (languageKey == 2)
//            language = 1;
//        else if (languageKey == 3)
//            language = 2;
//        else {
//            System.err.println("Enter number code AGAIN");
//            setLanguage();
//        }
//    }
    public static void chooseOption() {
        int optionChoice = new Scanner(System.in).nextInt();
//        if (optionChoice == 0) {
//            FileChoose.fileChoose();
//        } else
            if (optionChoice <= tools.length && optionChoice >= 1) {
            for (int i = 0; i <= OPTIONS.length; i++) {
                System.out.println((i + 1) + ". " + OPTIONS[0][i]);
            }
        } else {
            System.err.println("Choose pattern again");
            chooseOption();
        }
    }
    
    @Override
    public String[][] optionPrintLanguages(Type t) {
        return new String[][]{{}};
    }
    
    public static void initialize() {
        tools = new String[][]{{"Text"}, {"text"}};
    }
}
