/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main.system_print;

import com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface;
import com.lervar.main.Type;
import com.lervar.main.execute.LerVarExecute;

import java.io.File;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import static com.lervar.main.Main.language;

public class OptionPrint implements OptionPrintInterface {
    private static int patternChoice;
    private static int optionChoice;
    public static String fileCreatePath;
//    public static String[] languageArray = new String[255];
    public static String[][]
//        []
        tools = {
//            {
        {"Text"},{"text"}
//                    "文本", "文本"}
    };
    public static void optionPrint() throws Exception {
//        LerVarException.tools$interfacesCannotMatchTypeExceptionInspect();

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
    public static void chooseOption() throws Exception {
//        if (optionChoice == 0) {
//            FileChoose.fileChoose();
//        } else
        System.out.println("\nChoose option by entering numbers:");
        System.out.println("0. <Interrupt>");
        for (int i = 0; i <= OPTIONS.length; i++) {
            System.out.println((i + 1) + ". " + OPTIONS[0][i]);
        }
        optionChoice = new Scanner(System.in).nextInt();
        if (optionChoice > OPTIONS[0].length || optionChoice < 0) {
            System.err.println("Choose option again");
            chooseOption();
        }
        LerVarExecute._LerVarExecuteOnOPTION();
//        if (patternChoice >= 1 && patternChoice <= PATTERN.length) {
//            System.out.println("0. <Interrupt>");
//            for (int i = 0; i <= OPTIONS.length; i++) {
//                System.out.println((i + 1) + ". " + OPTIONS[0][i]);
//            }
//            LerVarExecute._LerVarExecuteOnPATTERN();
//            optionChoice = new Scanner(System.in).nextInt();
//            LerVarExecute._LerVarExecuteOnOPTION();
//        } else if (patternChoice == 0) {
//            LerVarExecute.interrupt();
//        } else {
//            System.err.println("Choose pattern again");
//            choosePattern();
//        }
    }
    public static void choosePattern() {
        System.out.println("Choose pattern by entering numbers:");
        System.out.println("0. <Interrupt>");
        for (int i = 1; i <= PATTERN[0].length; i++) {
            System.out.println(i + ". " + PATTERN[0][i - 1]);
        }
        patternChoice = new Scanner(System.in).nextInt();
        if (patternChoice == 0) {
            LerVarExecute.interrupt();
            return;
        }
        System.out.print("Create LerVar file to(Enter \"0\" to create file in original location, or enter a path to create the file into):\n->");
        fileCreatePath = new Scanner(System.in).nextLine();
        LerVarExecute._LerVarExecuteOnPATTERN();
    }
    
    public static int getOptionChoice() {
        return optionChoice;
    }
    public static void setOptionChoice(int oC) {
        optionChoice = oC;
    }
    public static int getPatternChoice() {
        return patternChoice;
    }
    
    @Override
    public String[][] optionPrintLanguages(Type t) {
        return new String[][]{{}};
    }
    
    public static void initialize() {
//        tools = new String[][]{{"Text"}, {"text"}};
    }
}
