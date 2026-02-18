/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 *
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main;

import com.lervar.main.system_print.OptionPrint;

public class LerVarException extends Exception {
    public LerVarException(Object exc) {}
    
    public static void _LervarExceptionInspect() throws Exception {
        tools$interfacesCannotMatchTypeExceptionInspect();
    }
    public static void tools$interfacesCannotMatchTypeExceptionInspect() throws Exception {
        if (OptionPrint.tools[0].length != OptionPrint.tools[1].length) {
            throw new LerVarException("Interfaces cannot match types.n\n\tat com.lervar.main.system_print.OptionPrint.java:24");
        }
    }
}
