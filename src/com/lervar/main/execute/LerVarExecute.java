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

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;

public class LerVarExecute {
    public static void _LerVarExecute(String filePath) {
        Path lerverFilePath = Path.of(filePath);
        String s = lerverFilePath.getFileName().toString().toLowerCase();
        String extension = s.substring((s.lastIndexOf('.')) + 1);
        if (extension.equals("lervar")) {
            try (RandomAccessFile raf = new RandomAccessFile(filePath, "r");) {
                raf.seek(0);
                int signatureLength = raf.read();
                byte b = 0;
                if (signatureLength < 8 || signatureLength > 127) {
                    System.err.println("illegal file");
                    LerVarExecute.interrupt();
                    return;
                }
                while (b <= signatureLength - 1) {
                    /////////
                    b++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.err.println("illegal file");
            LerVarExecute.interrupt();
        }
    }
    public static void _LerVarExecuteOnPATTERN() {
        switch (OptionPrint.getPatternChoice()) {
        case 0:
            LerVarExecute.interrupt();
            break;
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
        case 0:
            LerVarExecute.interrupt();
            break;
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
    public static void interrupt() {
        //MUST be cited in selection statement
        System.out.println("Was interrupted");
    }
}
