/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026
 * J_pc and/or his studios
 * All rights reserved
 */

package com.lervar.main.system_print;

import com.lervar.interfaces.of_lervar_output.of_system_print.SystemPrintText;

public class SystemPrint implements SystemPrintText {
    public static void systemPrint() {
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            System.out.print(LERVAR_ICON_WINDOWS);
            System.out.println("[LerVar " + LERVAR_VERSION + ']');
        } else {
            System.out.print(LERVAR_ICON_LINUX);
            System.out.println("\u001B[33mLerVar\u001B[0m " + LERVAR_VERSION);
        }
        System.out.print("Run in " + OS + " with ");
        System.out.println(OS_ARCH);
    }
}
