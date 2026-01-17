/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 *
 * @since 2025
 * Copyright (c) 2026
 * J_pc and/or his studios
 * All rights reserved
 */

package com.lervar.main.system_print;

import com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintLanguages;

import java.util.Scanner;

/**
 * Encoding:GBK
 */
public class OptionPrint implements OptionPrintLanguages {
    public static void optionPrint() {
        System.out.println
                ("\nLanguage(Enter the number):" +
                        "\n1.English(UK)\n" + "2.简体中文(Simplified Chinese)\n" + "3.繁體中文(Traditional Chinese)\n"
                );
        setLanguage();
        
    }
    
    private static void setLanguage() {
        short languageKey = new Scanner(System.in).nextByte();
        if (languageKey == 1)
            com.lervar.main.Main.language = 0;
        else if (languageKey == 2)
            com.lervar.main.Main.language = 1;
        else if (languageKey == 3)
            com.lervar.main.Main.language = 2;
        else
            System.err.println("Enter number code AGAIN");setLanguage();
    }
}
