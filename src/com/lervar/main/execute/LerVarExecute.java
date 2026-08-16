/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main.execute;

import com.lervar.interfaces.of_lervar_output.of_system_print.SystemPrintText;
import com.lervar.main.system_print.OptionPrint;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import static com.lervar.main.Main._LerVarSignature;
import static com.lervar.main.Main.compatibleWith;
import static com.lervar.main.RunClasses.runnable;
import static com.lervar.main.execute.verify.file_verify.hash_calculate.FileHashCalculate.*;

public class LerVarExecute implements SystemPrintText {
    public static void _LerVarExecute(String filePath) throws Exception {
        Path lerverFilePath = Path.of(filePath);
        File file = lerverFilePath.toFile();
        if (!file.exists()) {
            System.err.println("Cannot find file: " + filePath);
            interrupt();
            return;
        }
        String s = lerverFilePath.getFileName().toString().toLowerCase();
        String extension = s.substring((s.lastIndexOf('.')) + 1);
        if (extension.equals("lervar") || extension.equals("lvr")) {
            try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) {
                raf.seek(0);
                int signatureLength = raf.read();
                if (signatureLength >= 8 && signatureLength <= 127) {
                    StringBuilder stringBuilder = new StringBuilder();
                    byte b = 1;
                    while (b <= signatureLength) {
                        raf.seek(b);
                        stringBuilder.append((char) raf.read());
                        b++;
                    }
                    if (!stringBuilder.toString().equals(String.valueOf(_LerVarSignature))) {
                        int i = 1;
                        while (i <= compatibleWith.length) {
                            if (stringBuilder.toString().equals(String.valueOf(compatibleWith[i - 1]))) {
                                break;
                            } else if (i <= compatibleWith.length - 1) {
                                i++;
                            } else {
                                unsuitableLerVarExecute();
                            }
                        }
                    }
                } else {
                    unsuitableLerVarExecute();
                }
                raf.seek(signatureLength + 3);
                int getHashPattern = raf.read();
                StringBuilder filePart = new StringBuilder();
                long pos = 0;
                
                int i = 0;
                if (getHashPattern >= 0x21 && getHashPattern <= 0x24) {
                    i = 1;
                } else if (getHashPattern <= 0x10 || getHashPattern >= 0x25) {
                    unsuitableLerVarExecute();
                }
                int i1 =
                switch (getHashPattern) {
                    case 0x11, 0x21 -> 0;
                    case 0x13, 0x23 -> 2;
                    case 0x14, 0x24 -> 3;
                    default -> 1;
                };
                while (pos <= (file.length() - hashLengthOnByte[i][i1] - 1)) {
                    raf.seek(pos);
                    filePart.append((char) raf.read());
                    pos++;
                }
                
                int fi = 0;
                int se = 1;
                String hashString;
                if (getHashPattern >= 0x11 && getHashPattern <= 0x14) {
                    se = getHashPattern - 0x11;
                } else if (getHashPattern >= 0x21 && getHashPattern <= 0x24) {
                    fi = 1;
                    se = getHashPattern - 0x21;
                }
                hashString = SHACalculateOnHex(String.valueOf(filePart), hashPattern[fi][se]);
                int getHashLength = hashString.length() / 2;
                long hashLoc = file.length() - getHashLength;
                
                raf.seek(hashLoc);
                StringBuilder sb = new StringBuilder();
                pos = 1;
                while (pos <= hashLengthOnByte[i][i1]) {
                    sb.append(String.format("%02X", raf.read()));
                    pos++;
                }
                if (!sb.toString().toLowerCase().equals(hashString)) {
                    System.out.println("File hash(" + hashPattern[fi][se] + ")is: " + sb.toString().toLowerCase());
                    System.out.println("True hash(" + hashPattern[fi][se] + ")is: " + hashString);
                    untrustworthyFileExecute();
                }
            } catch (IOException | NoSuchAlgorithmException ignore) {}
        } else {
            illegalFileExecute();
        }
    }
    
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
    public static void _LerVarExecuteOnOPTION() throws Exception {
        switch (OptionPrint.getOptionChoice()) {
        case 0:
            interrupt();
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
        runnable = false;
    }
    public static void illegalFileExecute() {
        System.err.println("illegal file");
        interrupt();
    }
    public static void unsuitableLerVarExecute() {
        //return:
        //1 is "interrupt"; 0 is run correctly
        System.out.println(">> Unsuitable LerVar Nucleus <<\nThis file's structure is unsuitable for this LerVar version(" + LERVAR_VERSION + ") OR it's an ILLEGAL file. Whether to continue execute?");
        System.out.println("Continue or not(Enter the number):\n0. Interrupt\n1. Continue");
        byte b = new Scanner(System.in).nextByte();
        if (b != 1) {
            interrupt();
        }
    }
    public static void untrustworthyFileExecute() throws Exception {
        //return:
        //1 is "interrupt"; 0 is run correctly
        int r = (int) (Math.random() * 1000 + 1);
        System.out.println(">> Untrustworthy file <<\nWhether to continue execute?");
        System.out.println("Continue or not(Enter the number):\n0. Interrupt\n" + r + ". Continue");
        int i = new Scanner(System.in).nextInt();
        if (i != (r)) {
            interrupt();
        }
    }
}
