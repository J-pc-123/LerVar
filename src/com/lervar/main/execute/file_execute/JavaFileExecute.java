/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main.execute.file_execute;

import com.lervar.interfaces.of_lervar_execute.of_java_file_execute.JavaFileExecuteInterface;
import com.lervar.interfaces.of_lervar_execute.of_java_file_execute.of_lervar_file_structure.LerVarFileStructure;
import com.lervar.main.LerVarException;
import com.lervar.main.execute.FileExecute;

import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.lervar.main.RunClasses.runnable;
import static com.lervar.main.Type.*;
import static com.lervar.main.execute.FileExecute.*;
import static com.lervar.main.execute.verify.file_verify.VerifyCodeCalculate.verifyCalculator;
import static com.lervar.main.execute.verify.file_verify.hash_calculate.FileHashCalculate.hashLengthOnByte;
import static com.lervar.main.system_print.OptionPrint.fileCreatePath;

public class JavaFileExecute implements JavaFileExecuteInterface, LerVarFileStructure {
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
    public static boolean isFullyQualifiedName = false;
    
    public static void javaFileExecuteOfConvert() throws Exception {
        if (!runnable) {
            return;
        }
        _LerVarFileHeadWriter();
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
                if (Pattern.compile("[.].").matcher(String.valueOf(statement)).matches()) {
                    isFullyQualifiedName = true;
                }
                try (RandomAccessFile raf = new RandomAccessFile(_LerVarfile, "rw")) {
                    for (int j = 0; j <= javaFileContentMap.length - 1; j++) {
                        if (String.valueOf(stringBuilder)
                                .equals(String.valueOf(javaFileContentMap[j][0])
                                .substring(String.valueOf(javaFileContentMap[j][0]).lastIndexOf('.') + 1))) {
                            raf.writeLong((long) javaFileContentMap[j][1]);
                            break;
                        } else if (javaFileContentMap[0xF0][0] == EMPTY){
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
                            for (; mapPointer >= 0; mapPointer--) {
                                if (javaFileContentMap3ByteExtend[mapPointer][0] == EMPTY) {
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
        _LerVarFileHeadWriter();
    }
    
    public static void javaFileExecuteOfParse() {
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) {
            raf.seek(0);
            int i = raf.read();
            raf.seek(i + (int) FILE_HEAD_STRUCTURE[2][1] + (int) FILE_HEAD_STRUCTURE[3][1]);
            int h =
                switch (raf.read()) {
                case 0x11, 0x12, 0x13, 0x14 -> 0;
                case 0x21, 0x22, 0x23, 0x24 -> 1;
                default -> throw new LerVarException("Illegal hash value, it may be supported in OTHER LerVar Nucleus: 0x" + Integer.toHexString(raf.read()).toUpperCase());
                };
            System.out.print("Create Java file to(Enter \"0\" to create file in original location, or enter a path to create the file into):\n->");
            fileCreatePath = new Scanner(System.in).nextLine();
            int i1 = i + (int) FILE_HEAD_STRUCTURE[2][1] + (int) FILE_HEAD_STRUCTURE[3][1] + (int) FILE_HEAD_STRUCTURE[4][1] +
                    (int) FILE_HEAD_STRUCTURE[5][1] + (int) FILE_HEAD_STRUCTURE[6][1] + (int) FILE_HEAD_STRUCTURE[7][1];
            raf.seek(i1);
            fileCreate("java");
            int i2 = hashLengthOnByte[h][
                    switch (hashPattern) {
                    case 0x11, 0x21 -> 0;
                    case 0x13, 0x23 -> 2;
                    case 0x14, 0x24 -> 3;
                    default -> 1;
                }
            ];
            int reader;
            while (raf.getFilePointer() <= Files.size(Path.of(filePath)) - i2 - 1 && runnable) {
                reader = raf.read();
                if (reader <= 0xEF && !(reader >= 0xD0 && reader <= 0xD9 || reader == 0x29)) {
                    Files.write(Path.of(fileCreatePath), String.valueOf(javaFileContentMap[reader][0]).getBytes(), StandardOpenOption.APPEND);
                    if (!(reader == 0x68 | (reader >= 0x6C && reader <= 0x75)) &&
                            !((reader >= 0xA0 && reader <= 0xB4) || (reader >= 0xC0 && reader <= 0xCD) || (reader >= 0xE0 && reader <= 0xE9))) {
                        Files.write(Path.of(fileCreatePath), " ".getBytes(), StandardOpenOption.APPEND);
                    } else if (reader == 0x68 | (reader >= 0x6C && reader <= 0x75 && reader != 0x6F)) {
                        Files.write(Path.of(fileCreatePath), ".".getBytes(), StandardOpenOption.APPEND);
                    }
                } else if (reader == 0xD0) {
                    int r;
                    StringBuilder sb = new StringBuilder();
                    if (javaFileContentMap[0xF0][0] == EMPTY) {
                        for (int j = 479; j >= 0xF0; j--) {
                            if (javaFileContentMap[j][0] == EMPTY) {
                                r = raf.read();
                                while (r != 0x00) {
                                    sb.append((char) r);
                                    r = raf.read();
                                }
                                javaFileContentMap[j][0] = sb.toString();
                                Files.write(Path.of(fileCreatePath), (sb.append(" ").toString()).getBytes(), StandardOpenOption.APPEND);
                                break;
                            }
                        }
                    } else if (javaFileContentMapExtend[0][0] != EMPTY | javaFileContentMapExtend[0][0] != null) {
                        for (int j = 3599; j >= 0; j--) {
                            if (javaFileContentMapExtend[j][0] == EMPTY) {
                                r = raf.read();
                                while (r != 0x00) {
                                    sb.append((char) r);
                                    r = raf.read();
                                }
                                javaFileContentMapExtend[j][0] = sb.toString();
                                Files.write(Path.of(fileCreatePath), (sb.append(" ").toString()).getBytes(), StandardOpenOption.APPEND);
                                break;
                            }
                        }
                    } else if (javaFileContentMap3ByteExtend[0][0] != EMPTY | javaFileContentMap3ByteExtend[0][0] != null) {
                        for (int j = 61439; j >= 0; j--) {
                            if (javaFileContentMap3ByteExtend[j][0] == EMPTY) {
                                r = raf.read();
                                while (r != 0x00) {
                                    sb.append((char) r);
                                    r = raf.read();
                                }
                                javaFileContentMap3ByteExtend[j][0] = sb.toString();
                                Files.write(Path.of(fileCreatePath), (sb.append(" ").toString()).getBytes(), StandardOpenOption.APPEND);
                                break;
                            }
                        }
                    }
                } else if (reader == 0xD1) {
                    int r1;
                    StringBuilder sb = new StringBuilder("\"");
                    if (javaFileContentMap[0xF0][0] == EMPTY) {
                        for (int j = 479; j >= 234; j--) {
                            if (javaFileContentMap[j][0] == EMPTY) {
                                r1 = raf.read();
                                while (r1 != 0x00) {
                                    sb.append((char) r1);
                                    r1 = raf.read();
                                }
                                sb.append("\"");
                                javaFileContentMap[j][0] = sb.toString();
                                Files.write(Path.of(fileCreatePath), (sb.append(" ").toString()).getBytes(), StandardOpenOption.APPEND);
                                break;
                            }
                        }
                    } else if (javaFileContentMapExtend[0][0] != EMPTY | javaFileContentMapExtend[0][0] != null) {
                        for (int j = 3599; j >= 0; j--) {
                            if (javaFileContentMapExtend[j][0] == EMPTY) {
                                r1 = raf.read();
                                while (r1 != 0x00) {
                                    sb.append(raf.readChar());
                                    r1 = raf.read();
                                }
                                sb.append("\"");
                                javaFileContentMapExtend[j][0] = sb.toString();
                                Files.write(Path.of(fileCreatePath), (sb.append(" ").toString()).getBytes(), StandardOpenOption.APPEND);
                                break;
                            }
                        }
                    } else if (javaFileContentMap3ByteExtend[0][0] != EMPTY | javaFileContentMap3ByteExtend[0][0] != null) {
                        for (int j = 61439; j >= 0; j--) {
                            if (javaFileContentMap3ByteExtend[j][0] == EMPTY) {
                                r1 = raf.read();
                                while (r1 != 0x00) {
                                    sb.append(raf.readChar());
                                    r1 = raf.read();
                                }
                                sb.append("\"");
                                javaFileContentMap3ByteExtend[j][0] = sb.toString();
                                Files.write(Path.of(fileCreatePath), (sb.append(" ").toString()).getBytes(), StandardOpenOption.APPEND);
                                break;
                            }
                        }
                    }
                }
//                else if (reader == 0xD4) {
//                    int rd = raf.read();
//                    if (rd == 0xFF) {
//                        Files.write(Path.of(fileCreatePath), "0x".getBytes(), StandardOpenOption.APPEND);
//                        while (raf.read() != 0xD4 && raf.read() != 0x00) {
//                            raf.seek(raf.getFilePointer() - 1);
//                        }
//                    } else if (rd == 0xFE) {
//
//                    }
//                }
                else if (reader == 0xF0) {
                    int mapPointer = 0xF0 + raf.read();
                    Files.write(Path.of(fileCreatePath), (javaFileContentMap[mapPointer][0] + " ").getBytes(), StandardOpenOption.APPEND);
                } else if (reader >= 0xF1 && !(raf.read() >= 0xF0)) {
                    raf.seek(raf.getFilePointer() - 1);
                    int mapPointer = (reader - 0xF1) * 0xF0 - 1 + raf.read();
                    Files.write(Path.of(fileCreatePath), (javaFileContentMap[mapPointer][0] + " ").getBytes(), StandardOpenOption.APPEND);
                } else if (reader >= 0xF1 && raf.read() >= 0xF0) {
                    raf.seek(raf.getFilePointer() - 1);
                    int j = raf.read();
                    int mapPointer = (reader - 0xF0) * 0xF0 + (j - 0xF0) * 0xF0 + raf.read();
                    Files.write(Path.of(fileCreatePath), (javaFileContentMap[mapPointer][0] + " ").getBytes(), StandardOpenOption.APPEND);
                } else if (reader >= 0xD5
//                        && reader <= 0xD9
                ) {
                    StringBuilder sb = new StringBuilder();
                    int rd1 = raf.read();
                    while (rd1 != 0x00) {
                        if (rd1 <= 0xEF) {
                            sb.append(javaFileContentMap[rd1][0]).append(" ");
                            rd1 = raf.read();
                        } else if (rd1 == 0xF0) {
                            int mapPointer = 0xF0 + raf.read();
                            sb.append(javaFileContentMap[mapPointer][0]);
                        } else if (rd1 >= 0xF1) {
                            int mapPointer = (reader - 0xF1) * 0xF0 - 1 + raf.read();
                            sb.append(javaFileContentMapExtend[mapPointer][0]);
                        } else if (reader >= 0xF1 && raf.read() >= 0xF0) {
                            raf.seek(raf.getFilePointer() - 1);
                            int j = raf.read();
                            int mapPointer = (reader - 0xF0) * 0xF0 + (j - 0xF0) * 0xF0 + j;
                            sb.append(javaFileContentMap3ByteExtend[mapPointer][0]);
                        }
                    }
                    int i3 = switch (reader) {
                        case 0xD5 -> 2;
                        case 0xD6 -> 3;
                        case 0xD7 -> 4;
                        case 0xD8 -> 5;
                        case 0xD9 -> 10;
                        default -> 0;
                    };
                    for (; i3 >= 1; i3--) {
                        Files.write(Path.of(fileCreatePath), sb.toString().getBytes(), StandardOpenOption.APPEND);
                    }
                } else if (reader == 0x29) {
                    int rd2 = raf.read();
                    StringBuilder sb = new StringBuilder();
                    while (rd2 != 0x00) {
                        sb.append((char) rd2);
                        rd2 = raf.read();
                    }
                    javaFileContentMap[0x01][0] = mainMethodArrayIdentifier = sb.toString();
                    javaFileContentMap[0x29][0] = "public static void main(String[] " + mainMethodArrayIdentifier + ")";
                    Files.write(Path.of(fileCreatePath), javaFileContentMap[0x29][0].toString().getBytes(), StandardOpenOption.APPEND);
                }
            }
        } catch (Exception ignore) {ignore.printStackTrace();}
    }
    public static void jarFileExecuteOfParse() {
    
    }
    
    public static void initialize() {
        mainMethodArrayIdentifier = "arg";
        mapPointer = 479;
        fileBytePointer = 0;
        isSingleLineNote = true;
        isText = false;
        isGeneric = false;
        statement = new StringBuilder();
        contentEnd = false;
        curlyBracketsCount = 0;
        squareBracketsCount = 0;
        parenthesesCount = 0;
        angleBracketsCount = 0;
        isFullyQualifiedName = false;
        
        for (int i = 2; i <= 0x1F; i++) {
            javaFileContentMap[i][0] = EMPTY;}
        javaFileContentMap[0x01][0] = mainMethodArrayIdentifier;
        javaFileContentMap[0x0F][0] = END;
        javaFileContentMap[0x8F][0] = EMPTY;
        for (int i = 0x93; i <= 0x9F; i++) {
            javaFileContentMap[i][0] = EMPTY;}
        for (int i = 0xB6; i <= 0xBF; i++) {
            javaFileContentMap[i][0] = EMPTY;}
        javaFileContentMap[0xCE][0] = EMPTY;
        javaFileContentMap[0xCF][0] = EMPTY;
        for (int i = 0xDA; i <= 0xDF; i++) {
            javaFileContentMap[i][0] = EMPTY;}
        for (int i = 0xEA; i <= 0xEF; i++) {
            javaFileContentMap[i][0] = EMPTY;}
        for (int i = 0xF0; i <= 2 * 0xF0; i++) {
            javaFileContentMap[i - 1][0] = EMPTY;}
        
        for (int i = 0; i <= javaFileContentMapExtend.length - 1; i++) {
            javaFileContentMapExtend[i][0] = EMPTY;}
        for (int i = 0; i <= javaFileContentMap3ByteExtend.length - 1; i++) {
            javaFileContentMap3ByteExtend[i][0] = EMPTY;}
    }
}
