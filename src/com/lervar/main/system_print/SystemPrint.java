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

import com.lervar.interfaces.of_lervar_output.of_system_print.SystemPrintText;

public class SystemPrint implements SystemPrintText {
    public static void systemPrint() {
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            System.out.print(lervarIcon_Windows);
            System.out.println("[LerVar " + lervarVersion + ']');
        } else {
            System.out.print(lervarIcon_Linux);
            System.out.println("\u001B[33mLerVar\u001B[0m " + lervarVersion);
        }
        System.out.print("Run in " + os + " with ");
        System.out.println(osArch);
    }
}
