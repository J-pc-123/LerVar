/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.interfaces;

import com.lervar.main.LerVarException;

import static com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface.*;

public class LerVarInterfacesException extends LerVarException {
    public LerVarInterfacesException(Object exc) {super(exc);}
    public static void _LerVarInterfacesExceptionInspect() throws LerVarException {
        options$TypeUnidentifiedInspect();
    }
    
    public static void options$TypeUnidentifiedInspect() throws LerVarException {
        boolean b =
                PATTERN[0][0].isEmpty() &&
                OPTIONS[0][0].isEmpty();
        if (b) {
            throw new LerVarException("Options' Type haven't identified in: com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface");
        }
    }
}
