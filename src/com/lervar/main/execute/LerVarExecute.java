/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 *
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main.execute;

import com.lervar.main.system_print.OptionPrint;

public class LerVarExecute {
    public static void _LerVarExecuteOnPATTERN() {
        switch (OptionPrint.getPatternChoice()) {
        case 1:
            StaticByteLerVarExecute.staticByteLerVarExecute();
            break;
        case 2:
            DataStreamLerVarExecute.dataStreamLerVarExecute();
            break;
        default:
            break;
        }
    }
    public static void _LerVarExecuteOnOPTION() {
        switch (OptionPrint.getOptionChoice()) {
        case 1:
            FileExecute.fileExecuteOnCONVERT();
            break;
        case 2:
            FileExecute.fileExecuteOnPARSE();
            break;
        case 3:
            FileExecute.fileExecuteOnENCRYPT();
            break;
        default:
            break;
        }
    }
}
