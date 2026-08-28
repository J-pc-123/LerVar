/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 *
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main.execute.file_execute;

import com.lervar.interfaces.of_lervar_execute.of_java_file_execute.JavaFileExecuteInterface;
import com.lervar.main.execute.FileExecute;

import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;

import static com.lervar.main.RunClasses.runnable;
import static com.lervar.main.Type.*;
import static com.lervar.main.execute.FileExecute.*;
import static com.lervar.main.execute.verify.file_verify.VerifyCodeCalculate.verifyCalculator;

public class JavaFileExecute implements JavaFileExecuteInterface {
    public static String mainMethodArrayIdentifier = "arg";
    public static int mapPointer = 479;
    public static long fileBytePointer = 0;
    public static volatile boolean isSingleLineNote = true;
    public static volatile boolean isText = false;
    public static volatile boolean isGeneric = false;
    public static volatile StringBuilder statement = new StringBuilder();
    public static volatile boolean contentEnd = false;
    public static int curlyBracketsCount = 0;
    public static int squareBracketsCount = 0;
    public static int parenthesesCount = 0;
    public static int angleBracketsCount = 0;
    public static void javaFileExecuteOfConvert() throws Exception {
        if (!runnable) {
            return;
        }
        FileExecute._LerVarFileHeadWriter();
        if (verifyCode != 0xFF) {
            try (RandomAccessFile fileOutputStream = new RandomAccessFile(_LerVarfile, "rw")) {
                switch (verifyCode) {
                case 0x01:
                    fileOutputStream.writeLong(verifyCalculator(0, String.valueOf(_LerVarfile)));
                    break;
                case 0x02:
                    fileOutputStream.writeLong(verifyCalculator(1, String.valueOf(_LerVarfile)));
                    break;
                case 0x03:
                    fileOutputStream.writeLong(verifyCalculator(2, String.valueOf(_LerVarfile)));
                    break;
                }
            }
        }
        javaContentWriter();
    }
    public static void noteIgnore() {
        try (RandomAccessFile raf = new RandomAccessFile(filePath ,"r")) {
            if (isSingleLineNote) {
                while (fileBytePointer <= Files.size(Path.of(filePath)) & !(raf.readChar() == '\n' || raf.readChar() == '\r')) {
                    raf.seek(++fileBytePointer);
                }
            } else {
                char cache1, cache2;
                raf.seek(fileBytePointer);
                while (fileBytePointer <= Files.size(Path.of(filePath))) {
                    cache1 = raf.readChar();
                    ++fileBytePointer;
                    cache2 = raf.readChar();
                    if (cache1 == '*' && cache2 == '/') {
                        return;
                    }
                }
            }
        } catch (Exception ignore) {}
    }
    
    public static void javaStatementReader() {
        try (RandomAccessFile raf = new RandomAccessFile(filePath ,"r")) {
            raf.seek(fileBytePointer);
            while (fileBytePointer <= Files.size(Path.of(filePath)) && (!contentEnd || statement.length() <= 32767)) {
                while (!contentEnd) {
                    statement.append(raf.readChar());
                    if (!isText) {
                        switch (raf.readChar()) {
                            case '{': ++curlyBracketsCount;break;
                            case '}': --curlyBracketsCount;break;
                            case '[': ++squareBracketsCount;break;
                            case ']': --squareBracketsCount;break;
                            case '(': ++parenthesesCount;break;
                            case ')': --parenthesesCount;break;
                            case '<':
                                if (isGeneric) {
                                    ++angleBracketsCount;
                                }
                                break;
                            case '>':
                                if (isGeneric) {
                                    --angleBracketsCount;
                                }
                                break;
                            default: break;
                        }
                    }
                    if (curlyBracketsCount == 0) {
                        contentEnd = true;
                    }
                }
            }
            unnecessaryContentIgnore();
        } catch (Exception ignore) {}
    }
    public static void javaContentWriter() {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i <= statement.length()) {
            if (statement.charAt(i) != ' ' || statement.charAt(i) != '\n' || statement.charAt(i) != '\r' || statement.charAt(i) != '\t') {
                if (statement.charAt(i) == '/' && statement.charAt(i + 1) == '/') {
                    while (statement.charAt(i) != '\n') {
                        i++;
                    }
                } else if (statement.charAt(i) == '/' && statement.charAt(i + 1) == '*') {
                    while (statement.charAt(i) != '*' && statement.charAt(i + 1) == '/') {
                        i++;
                    }
                }
                stringBuilder.append(statement.charAt(i));
            } else {
                try (RandomAccessFile raf = new RandomAccessFile(_LerVarfile, "rw")) {
                    for (int j = 0; j <= javaFileContentMap.length - 1; j++) {
                        if (String.valueOf(stringBuilder).equals(javaFileContentMap[j][0])) {
                            raf.writeLong((long) javaFileContentMap[j][1]);
                            break;
                        }
                        if (javaFileContentMap[0xF0][0] == EMPTY){
                            for (int k = 479; k >= 0xEF; k--) {
                                if (javaFileContentMap[k][0] == EMPTY) {
                                    javaFileContentMap[mapPointer][0] = String.valueOf(stringBuilder);
                                    --mapPointer;
                                }
                            }
                            break;
                        } else if (javaFileContentMapExtend[0x00][0] == EMPTY) {
                            mapPointer = 3599;
                            for (int k = 3599; k >= 0; k--) {
                                if (javaFileContentMapExtend[k][0] == EMPTY) {
                                    javaFileContentMapExtend[mapPointer][0] = String.valueOf(stringBuilder);
                                    --mapPointer;
                                }
                            }
                            break;
                        } else {
                            mapPointer = 61439;
                            for (int k = 61439; k >= 0; k--) {
                                if (javaFileContentMap3ByteExtend[k][0] == EMPTY) {
                                    javaFileContentMap3ByteExtend[mapPointer][0] = String.valueOf(stringBuilder);
                                    --mapPointer;
                                }
                            }
                        }
                        raf.write(String.valueOf(stringBuilder).getBytes());
                    }
                } catch (Exception ignore) {}
            }
            i++;
        }
    }
    
    public static void unnecessaryContentIgnore() {
        long l = 0;
        int spaceCount;
        short cache;
        Matcher matcher;
        while (l <= statement.length()) {
            
        }
    }
    public static void javaJarFileExecuteOfConvert() throws Exception {
        FileExecute._LerVarFileHeadWriter();
    }
    public static void initialize() {
    
    }
}
