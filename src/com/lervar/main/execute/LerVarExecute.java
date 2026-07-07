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

import com.lervar.interfaces.of_lervar_output.of_system_print.SystemPrintText;
import com.lervar.main.system_print.OptionPrint;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.util.Scanner;

import static com.lervar.main.Main._LerVarSignature;

public class LerVarExecute implements SystemPrintText {
    public static void _LerVarExecute(String filePath) {
        Path lerverFilePath = Path.of(filePath);
        String s = lerverFilePath.getFileName().toString().toLowerCase();
        String extension = s.substring((s.lastIndexOf('.')) + 1);
        if (extension.equals("lervar")) {
            try (RandomAccessFile raf = new RandomAccessFile(filePath, "r");) {
                raf.seek(0);
                int signatureLength = raf.read();
                boolean bl = false;
                if (signatureLength < 8 || signatureLength > 127 || signatureLength != _LerVarSignature.length) {
                    bl = (unsuitableLerVarExecute() == 0);
                }
                if (bl) {
                    byte b = 1;
                    char c;
                    while (b <= signatureLength) {
                        raf.seek(b);
                        c = (char) raf.read();
                        if (c != _LerVarSignature[b - 1]) {
                            unsuitableLerVarExecute();
                        } else {
                            b++;
                        }
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            illegalFileExecute();
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
    public static void illegalFileExecute() {
        System.err.println("illegal file");
        LerVarExecute.interrupt();
    }
    public static int unsuitableLerVarExecute() {
        //return:
        //1 is "interrupt"; 0 is run correctly
        System.out.println(">> Unsuitable LerVar Nucleus <<\nThis file's structure is unsuitable for this LerVar version(" + LERVAR_VERSION + ") OR it's an ILLEGAL file. Whether to continue execute?");
        System.out.println("Continue or not(Enter the number):\n0. Interrupt\n1. Continue");
        byte b = new Scanner(System.in).nextByte();
        if (b != 1) {
            interrupt();
            return 1;
        }
        return 0;
    }
    public static int untrustworthyFileExecute() {
        //return:
        //1 is "interrupt"; 0 is run correctly
        System.out.println(">> Untrustworthy file <<\nWhether to continue execute?");
        System.out.println("Continue or not(Enter the number):\n0. Interrupt\n1. Continue");
        byte b = new Scanner(System.in).nextByte();
        if (b != 1) {
            interrupt();
            return 1;
        }
        return 0;
    }
}
