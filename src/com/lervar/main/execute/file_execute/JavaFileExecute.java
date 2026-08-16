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

import com.lervar.main.execute.FileExecute;

import java.io.RandomAccessFile;

import static com.lervar.main.execute.FileExecute.*;
import static com.lervar.main.execute.verify.file_verify.VerifyCodeCalculate.verifyCalculator;

public class JavaFileExecute {
    public static void javaFileExecuteOfConvert() throws Exception {
        FileExecute._LerVarFileHeadWriter();
        //
        if (verifyCode != 0xFF) {
            try (RandomAccessFile fileOutputStream = new RandomAccessFile(_LerVarfile, "rw")) {
                switch (verifyCode) {
                case 0x01:
                    fileOutputStream.writeLong(verifyCalculator(verifyCode, String.valueOf(_LerVarfile)));
                }
            }
        }
    }
    public static void javaJarFileExecuteOfConvert() throws Exception {
        FileExecute._LerVarFileHeadWriter();
    }
}
