/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main;

import com.lervar.main.system_print.OptionPrint;
import com.lervar.main.system_print.SystemPrint;

import java.util.Scanner;

public class RunClasses {
    public static volatile boolean runnable = true;
    public static void runClasses() throws Exception {
        LerVarInitialize.initialize();
        
        SystemPrint.systemPrint();
        OptionPrint.optionPrint();
        
        runAgain();
    }
    public static void runAgain() throws Exception {
        short r = (short) (1000 *  Math.random());
        System.out.print("\nEnter \"" + r + "\" to run LerVar again, or enter other things to exit\n->");
        short i = new Scanner(System.in).nextShort();
        if (i == r) {
            LerVarInitialize.initialize();
            runClasses();
        } else {
            System.exit(0);
        }
    }
}
