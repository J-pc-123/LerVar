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
import com.lervar.main.execute.verify.hash_calculate.FileHashCalculate;
import com.lervar.main.system_print.OptionPrint;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.lervar.main.Main._LerVarSignature;
import static com.lervar.main.execute.verify.hash_calculate.FileHashCalculate.*;

public class LerVarExecute implements SystemPrintText {
    public static void _LerVarExecute(String filePath) {
        Path lerverFilePath = Path.of(filePath);
        File file = lerverFilePath.toFile();
        String s = lerverFilePath.getFileName().toString().toLowerCase();
        String extension = s.substring((s.lastIndexOf('.')) + 1);
        if (extension.equals("lervar")) {
            try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) {
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
                raf.seek(signatureLength + 2);
                int getHashPattern = raf.read();
                String hashString;
                if (getHashPattern >= 17 && getHashPattern <= 20) {
                    hashString = FileHashCalculate.SHACalculate("0", hashPattern[1][getHashPattern - 17]);//////////////////////
                } else if (getHashPattern >= 33 && getHashPattern <= 36) {
                    hashString = FileHashCalculate.SHACalculate("0", hashPattern[2][getHashPattern - 33]);
                } else {
                    hashString = FileHashCalculate.SHACalculate("0", hashPattern[1][2]);
                }
                int getHashLength = hashString.length();
                long hashLoc = file.length() - getHashLength;
                
                System.out.println(getHashLength);
                System.out.println(hashLoc);
                System.out.println(hashString);
                
                raf.seek(hashLoc);
                StringBuilder sb = new StringBuilder();
                sb.append(raf.read(new byte[getHashLength]));/////////////////
            } catch (IOException | NoSuchAlgorithmException e) {
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
