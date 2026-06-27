/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.interfaces.of_lervar_output.of_system_print;

public interface SystemPrintText {
    String LERVAR_ICON_LINUX = """
            ==========================================================================================
                                                   #/----------------
                                                   /
                                                  /
                WWW                              /
                WWW                             /
               WWW                             /
               WWW                            /
              WWW                            /
              WWW            MMMM   WW WWW\u001B[31mW\u001B[0m /
             WWW           MMwwwMM  W^W    \u001B[0m/\u001B[31mW\u001B[0m
             WWW      WWW  MM       WW    / MMM           MMM
            WWWWWWWWWWWWW   MMMMM^  WW   /  MMM          MMM
                                        /    MMM        MMM
                                       /     MMM       MMM
                                      /      MMM      MMM
                                     /        MMM    MMM
                                    /         MMM   MMM    WWWWW   WW WWW
                                   /          MMM  MMM   WW   WW   W^W   W
                                  /            MMMMM     WW   WW   WW
                                 /             WWWW       WWWW WW  WW
                                /
                               /
              ----------------/#
             ==========================================================================================
            """;
    String LERVAR_ICON_WINDOWS = """
            ==========================================================================================
                                                   #/----------------
                                                   /
                                                  /
                WWW                              /
                WWW                             /
               WWW                             /
               WWW                            /
              WWW                            /
              WWW            MMMM   WW WWW >/
             WWW           MMwwwMM  W^W   W/<
             WWW      WWW  MM       WW    / MMM           MMM
            WWWWWWWWWWWWW   MMMMM^  WW   /  MMM          MMM
                                        /    MMM        MMM
                                       /     MMM       MMM
                                      /      MMM      MMM
                                     /        MMM    MMM
                                    /         MMM   MMM    WWWWW   WW WWW
                                   /          MMM  MMM   WW   WW   W^W   W
                                  /            MMMMM     WW   WW   WW
                                 /             WWWW       WWWW WW  WW
                                /
                               /
              ----------------/#
            ==========================================================================================
            """;
    String LERVAR_VERSION = "v.pre-1.0_Beta2";
    String OS = System.getProperty("os.name").toLowerCase();
    String OS_ARCH = System.getProperty("os.arch").toLowerCase();
    String COPYRIGHT = "Copyright (c) 2026 J_pc and/or his studios";
}
