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
            JavaFileExecute.javaFileExecuteOfConvert();
        default:
            LerVarExecute.illegalFileExecute();
        }
    }
    
    public static void _LerVarFileHeadWriter() throws Exception {
        File _LerVarfile = new File(String.valueOf(fileCreate("lvr")));
        try (FileOutputStream fileOutputStream = new FileOutputStream(_LerVarfile)) {
            fileOutputStream.write(_LerVarSignatureByte);
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
    
    @Override
    public void execute() {}
    
    @Override
    public String[][] optionPrintLanguages(Type t) {
        return new String[0][];
    }
}
