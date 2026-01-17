/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026
 * J_pc and/or his studios
 * All rights reserved
 */

package com.lervar.main.system_print;

import com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintLanguages;

import java.util.Scanner;

import static com.lervar.main.Main.language;

/**
 * Encoding:GB18030
 */
public class OptionPrint implements OptionPrintLanguages {
    public static int lervarOptionCount = 10;
    public static String[] languageArray = new String[255];
    public static String[][] options = new String[lervarOptionCount][LANGUAGE_COUNT];
    public static void optionPrint() {
        languageArray = new String[]{"English(UK)", "简体中文(Simplified Chinese)", "繁體中文(Traditional Chinese)"};
        int i;
        i = 1;
        for (String j : languageArray) {
            System.out.print(i + ".");
            System.out.println(j);
            i++;
        }
        setLanguage();
        
        for (i = 1; i <= PARTS.length; i++) {
            System.out.print(i + ".");
            System.out.println(PARTS[language][i - 1]);
        }
        chooseOption();
    }
    
    protected static void setLanguage() {
        short languageKey = new Scanner(System.in).nextByte();
        if (languageKey == 1)/////////////////////
            language = 0;
        else if (languageKey == 2)
            language = 1;
        else if (languageKey == 3)
            language = 2;
        else {
            System.err.println("Enter number code AGAIN");
            setLanguage();
        }
    }
    protected static void chooseOption() {
        int optionChoice = new Scanner(System.in).nextInt();
    }
}
