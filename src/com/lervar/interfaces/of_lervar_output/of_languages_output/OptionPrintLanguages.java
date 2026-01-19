/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026
 * J_pc and/or his studios
 * All rights reserved
 */

package com.lervar.interfaces.of_lervar_output.of_languages_output;

import static com.lervar.main.system_print.OptionPrint.languageArray;

public interface OptionPrintLanguages {
    int LANGUAGE_COUNT = languageArray.length;
    String[][] OPTIONS = {
            {"Convert", "Parse", "Encrypt"},
            {"转换", "解析", "加密"},
            {"轉換", "解析", "加密"}
    };
    String[] CHOOSE_FILE = {
            "Choose file",
            "选择文件",
            "選擇檔案"
    };
    String[] CHOOSE_PULLING_PATH = {
            "Choose pulling path",
            "选择插件路径",
            "選擇插件路徑"
    };
    String[] ENTER_PULLING_PATH = {
            "Enter pulling path",
            "输入插件路径",
            "輸入插件路徑"
    };
    String[] LIST_PULLING_FILE = {
            "Not a valid path or no plugins available",
            "不是有效的路径或没有可用的插件",
            "路徑無效或未找到任何插件"
    };
}
