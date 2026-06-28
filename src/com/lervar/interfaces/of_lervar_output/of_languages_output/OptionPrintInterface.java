/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.interfaces.of_lervar_output.of_languages_output;

import com.lervar.main.Type;

//import static com.lervar.main.system_print.OptionPrint.languageArray;

public interface OptionPrintInterface {
    String PLUGIN_TEXT = System.getProperty("os.name").toLowerCase().contains("win") ?
            "\\_plugins" : "/_plugins";
//    int LANGUAGE_COUNT = languageArray.length;
    String[][] PATTERN = {
        {"Static byte", "Data Stream(Beta)"},{"pattern"}
    };
    String[][] OPTIONS = {
            {"Convert", "Parse", "Encrypt"},{"options"}
//            {"转换", "解析", "加密"},
//            {"轉換", "解析", "加密"}
    };
    String[][] CHOOSE_FILE = {
            {"Choose file"}, {"choose_file"}
//            "选择文件",
//            "選擇檔案"
    };
//    String[][] CHOOSE_PLUGINS$_PATH = {
//            {"Choose plugins path"}, {"choose_plugins_path"},
////            "选择插件路径",
////            "選擇插件路徑"
//    };
//    String[][] ENTER_PULLING_PATH = {
//            {"Enter pulling path"}, {"enter_pulling_path"},
////            "输入插件路径",
////            "輸入插件路徑"
//    };
//    String[][] LIST_PULLING_FILE = {
//            {"Not a valid path or no plugins available"}, {"unavailable_path"},
////            "不是有效的路径或没有可用的插件",
////            "路徑無效或未找到任何插件"
//    };
    
    String[][] optionPrintLanguages(Type t);
}
