/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main.execute;

import com.lervar.interfaces.of_lervar_execute.ExecuteInterface;
import com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface;
import com.lervar.main.Type;
import com.lervar.main.execute.file_execute.JavaFileExecute;
import com.lervar.main.system_print.OptionPrint;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static com.lervar.main.Main._LerVarSignature;
import static com.lervar.main.Main._LerVarSignatureByte;
import static com.lervar.main.system_print.OptionPrint.fileCreatePath;

public class FileExecute extends LerVarExecute implements ExecuteInterface, OptionPrintInterface {
    public static String filePath;
    public static byte encrypt = 0x00;
    public static int hash = 0x12;
    public static int checkCode = 0xFF;
    public static int[] fileType = new int[2];
    public static int[] fileHeadData = new int[]{};
    public static int fileEncode = 0xFF;
    public static int executePattern =
            switch(OptionPrint.getPatternChoice()) {
                case 2 -> 0x02;
                default -> 0x01;
            };
    public static int compressionMode = 0xFF;
    //Is '0' in com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface;
    //Match '1' in input
    public static void fileExecuteOnCONVERT() throws Exception {
        OptionPrint.choosePattern();
        getFilePath();
        fileRecognize();
    }
    //Is '1' in com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface;
    //Match '2' in input
    public static void fileExecuteOnPARSE() throws Exception {
        getFilePath();
        LerVarExecute._LerVarExecute(filePath);
    }
    //Is '2' in com.lervar.interfaces.of_lervar_output.of_languages_output.OptionPrintInterface;
    //Match '3' in input
    public static void fileExecuteOnENCRYPT() throws Exception {
//        encrypt = true;
        getFilePath();
        LerVarExecute._LerVarExecute(filePath);
    }
    
    public static void getFilePath() {
        System.out.println(CHOOSE_FILE[0][0]);
        filePath = new Scanner(System.in).nextLine();
    }
    
    public static void fileRecognize() throws Exception {
        Path lerverFilePath = Path.of(filePath);
        File file = lerverFilePath.toFile();
        if (!file.exists()) {
            System.err.println("Cannot find file: " + filePath);
            LerVarExecute.interrupt();
            return;
        }
        String s = lerverFilePath.getFileName().toString().toLowerCase();
        String extension = s.substring((s.lastIndexOf('.')) + 1);
        switch (extension) {
            case "java":
                System.out.println("Is java source file, Choose compression mode:\n1. Maximum compression\n2. High preserve");
                int mode = new Scanner(System.in).nextInt();
                if (mode == 1) {
                    compressionMode = 0x01;
                } else if (mode == 2) {
                    compressionMode = 0x02;
                } else {
                    interrupt();
                    return;
                }
                fileType[0] = 0x00;
                fileType[1] = 0x01;
                fileHeadData = new int[]{};
                JavaFileExecute.javaFileExecuteOfConvert();
            case "jar":
                fileType[0] = 0x00;
                fileType[1] = 0x02;
                fileHeadData = new int[]{};
            default:
                LerVarExecute.illegalFileExecute();
        }
    }
    
    public static void _LerVarFileHeadWriter() throws Exception {
        File _LerVarfile = new File(String.valueOf(fileCreate("lvr")));
        System.out.println("Choose check/checksum code:\n0. <Interrupt>\n1. <No check code>\nOther. <No check code>");
        String checkCodeChoice = new Scanner(System.in).nextLine();
        if (checkCodeChoice.equals("0")) {
            interrupt();
        } else {
            checkCode =
            switch (checkCodeChoice) {
                default -> 0xFF;
            };
        }
        System.out.println("Choose hash:\n0. <Interrupt>\n1. SHA-224\n2. SHA-256\n3. SHA-384\n4. SHA-512\n5. SHA3-224\n6. SHA3-256\n7. SHA3-384\n8. SHA3-512\nOther. SHA-256");
        String hashChoice = new Scanner(System.in).nextLine();
        if (hashChoice.equals("0")) {
            interrupt();
        } else {
            hash =
            switch (hashChoice) {
                case "1"-> 0x11;
                case "3"-> 0x13;
                case "4"-> 0x14;
                case "5"-> 0x21;
                case "6"-> 0x22;
                case "7"-> 0x23;
                case "8"-> 0x24;
                default -> 0x12;
            };
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(_LerVarfile)) {
            fileOutputStream.write((byte) _LerVarSignature.length);
            fileOutputStream.write(_LerVarSignatureByte);
            fileOutputStream.write(encrypt);
            fileOutputStream.write(checkCode);
            fileOutputStream.write(hash);
            fileOutputStream.write(fileType[0]);
            if (fileType[0] != 0xFF) {
                fileOutputStream.write(fileType[1]);
                for (int fhd : fileHeadData) {
                    fileOutputStream.write(fhd);
                }
            }
            fileOutputStream.write(fileEncode);
            fileOutputStream.write(executePattern);
            fileOutputStream.write(compressionMode);
        }
    }
    public static Path fileCreate(String ext) throws Exception {
        Path path;
        checkPath();
        if (!filePath.endsWith("\\")) {
            filePath = filePath + '\\';
        }
        if (fileCreatePath.equals("0")) {
            path = Paths.get(filePath);
        } else {
            path = Paths.get(fileCreatePath);
        }
        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            System.out.println("The file was exist in this path");
            interrupt();
        }
        return (path.getParent()).resolve(getFileName() + '.' + ext);
    }
    public static void checkPath() {
        if (!Files.exists(Paths.get(filePath))) {
            System.out.print("The path didn't exist, please enter path again\n->");
            filePath = new Scanner(System.in).nextLine();
            checkPath();
        }
    }
    public static String getFileName() {
        File file = new File(filePath);
        return file.getName().substring(0, file.getName().lastIndexOf('.'));
    }
    
    public static void initialize() {
        filePath = "";
        encrypt = 0x00;
        hash = 0x12;
        fileType[0] = 0xFF;
        fileType[1] = 0x00;
        fileHeadData = new int[]{};
        fileEncode = 0x01;
        executePattern = 0xFF;
        compressionMode = 0x01;
    }
    @Override
    public void execute() {}
    
    @Override
    public String[][] optionPrintLanguages(Type t) {
        return new String[0][];
    }
}
