/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main.execute;

import com.lervar.interfaces.of_lervar_execute.ExecuteInterface;
import com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface;
import com.lervar.main.Type;
import com.lervar.main.system_print.OptionPrint;

import java.util.Scanner;

public class FileExecute extends LerVarExecute implements ExecuteInterface, OptionPrintInterface {
    public static String filePath;
    //Is '0' in com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface;
    //Match '1' in input
    public static void fileExecuteOnCONVERT() throws Exception {
        OptionPrint.choosePattern();
        getFilePath();
    }
    //Is '1' in com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface;
    //Match '2' in input
    public static void fileExecuteOnPARSE() throws Exception {
        getFilePath();
        LerVarExecute._LerVarExecute(filePath);
    }
    //Is '2' in com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface;
    //Match '3' in input
    public static void fileExecuteOnENCRYPT() throws Exception {
        getFilePath();
        LerVarExecute._LerVarExecute(filePath);
    }
    
    public static void getFilePath() {
        System.out.println(CHOOSE_FILE[0][0]);
        filePath = new Scanner(System.in).nextLine();
    }
    
    @Override
    public void execute() {}
    
    @Override
    public String[][] optionPrintLanguages(Type t) {
        return new String[0][];
    }
}
