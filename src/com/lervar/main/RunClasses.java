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

public class RunClasses {
    public static void runClasses() throws Exception {
        LerVarInitialize.initialize();
        JarFileParse.jarFileParse();
        
        SystemPrint.systemPrint();
        OptionPrint.optionPrint();
    }
}
