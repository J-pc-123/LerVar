/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main;

public class Type {
    public Type(){}
    public Type(String type){}
    public Type(char type){}
    public Type(int type){}
    public static final int END = 0x00;
    public static final Type EMPTY = null;
    public static final int isIdentifier = 0xD0;
    public static final int isText = 0xD1;
    public static final int isFormatCode = 0xD2;
    public static final int isRegularExpression = 0xD3;
}
