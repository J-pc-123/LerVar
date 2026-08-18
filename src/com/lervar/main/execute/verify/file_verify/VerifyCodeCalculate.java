/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 *
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main.execute.verify.file_verify;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.*;

abstract public class VerifyCodeCalculate {
    public static final Object[] verifier = {new CRC32(), new Adler32()};
    public static Checksum verify;
    public static long verifyCalculator(int i, String filePath) {
        verify = (Checksum) verifier[i];
        try (InputStream inputStream = new FileInputStream(filePath)) {
            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                verify.update(buffer, 0, bytesRead);
            }
        } catch (IOException ignore) {}
        return verify.getValue();
    }
}
