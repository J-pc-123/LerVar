/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.main;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import static com.lervar.dialog_box.FileChoose.*;

public class JarFileParse {
    public static void jarFileParse() {
        String jarPath = "file:/" + filePath + pulling[fileCode - 1].getName();
        String classPath = "pulling.lervar.main.PullingMain";
        String methodIdentifier = "lervarPullingMain";
        
        try (URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL(jarPath)})) {
            Class<?> _class = classLoader.loadClass(classPath);
            Object instance = _class.getDeclaredConstructor().newInstance();
            Method method = _class.getMethod(methodIdentifier);
            Object result = method.invoke(instance);
            System.out.println(result);
        } catch (Exception ignored) {}
    }
}
