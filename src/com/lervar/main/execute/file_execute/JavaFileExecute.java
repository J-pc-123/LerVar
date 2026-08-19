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

import static com.lervar.main.RunClasses.runnable;
import static com.lervar.main.execute.FileExecute.*;
import static com.lervar.main.execute.verify.file_verify.VerifyCodeCalculate.verifyCalculator;

public class JavaFileExecute implements JavaFileExecuteInterface {
    public static String mainMethodArrayIdentifier = "arg";
    public static void javaFileExecuteOfConvert() throws Exception {
        if (!runnable) {
            return;
        }
        FileExecute._LerVarFileHeadWriter();
        StringBuilder stringBuilder = new StringBuilder();
        boolean isText = false;
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "r")) {
            for (long i = 0; i <= Files.size(Path.of(filePath)); i++) {
                randomAccessFile.seek(i);
                
            }
        }
        
        if (verifyCode != 0xFF) {
            try (RandomAccessFile fileOutputStream = new RandomAccessFile(_LerVarfile, "rw")) {
                switch (verifyCode) {
                case 0x01:
                    fileOutputStream.writeLong(verifyCalculator(0, String.valueOf(_LerVarfile)));
                case 0x02:
                }
            }
        }
    }
    public static void javaJarFileExecuteOfConvert() throws Exception {
        FileExecute._LerVarFileHeadWriter();
    }
}
