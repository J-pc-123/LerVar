/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026
 * J_pc and/or his studios
 * All rights reserved
 */

package com.lervar.main.system_print;

import com.lervar.dialog_box.FileChoose;
import com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintLanguages;
import com.lervar.main.Type;

import java.util.Objects;
import java.util.Scanner;

//import static com.lervar.main.Main.language;

public class OptionPrint implements OptionPrintLanguages {
//    public static String[] languageArray = new String[255];
    public static String[]
//        []
        tools = {
//            {
              "Text"
//                    "文本", "文本"}
    };
    public static void optionPrint() {
//        languageArray = new String[]{"English(UK)", "简体中文(Simplified Chinese)", "繁體中文(Traditional Chinese)"};
        int i;
        i = 1;
//        for (String j : languageArray) {
//            System.out.print(i + ".");
//            System.out.println(j);
//            i++;
//        }
//        setLanguage();
        
        for (i = 1; i <= tools.length; i++) {
            System.out.print(i + ".");
//            System.out.println(tools[i - 1]);
            System.out.println(tools[0]);
        }
//        System.out.println('\n' + "C." + CHOOSE_PULLING_PATH[i - 1]);
        System.out.println('\n' + "0." + CHOOSE_PULLING_PATH[0]);
        chooseOption();
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
        if (optionChoice == 0) {
            FileChoose.fileChoose();
        } else if (optionChoice <= tools.length) {
            System.out.println(1);
        } else {
            System.err.println("Choose option again");
            chooseOption();
        }
    }
    
    @Override
    public String[] optionPrintLanguages(Type t) {
        return new String[]{""};
    }
}
