/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main.execute.verify.hash_calculate;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class FileHashCalculate {
    public static String[][] hashPattern = {{"SHA-224", "SHA-256", "SHA-384", "SHA-512"}, {"SHA3-224", "SHA3-256", "SHA3-384", "SHA3-512"}};
    public static String SHACalculate (String s, String algorithm) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(algorithm);
        return Arrays.toString(md.digest(s.getBytes(StandardCharsets.US_ASCII)));
    }
    public static String SHACalculateOnHex (String s, String algorithm) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(algorithm);
        byte[] digest = md.digest(s.getBytes(StandardCharsets.US_ASCII));
        return toHex(digest);
    }
    public static String toHex(byte[] byteArray) {
        StringBuilder sb = new StringBuilder();
        for (byte b : byteArray) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
