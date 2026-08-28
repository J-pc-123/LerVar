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
    String LERVAR_INFO_LINUX =
            """
            \u001B[34mWhat's LerVar?\u001B[0m
            -LerVar is a tool which is used to execute file.
            \u001B[34mWho owns the copyright of LerVar?\u001B[0m
            -J_pc
            \u001B[34mWhether LerVar is open source?\u001B[0m
            -Yes, it's licence is MIT and it was uploaded on Github
            \u001B[34mWhat LerVar can do?\u001B[0m
            -LerVar can convert, parse, encrypt& convert the file
            -LerVar can execute the file and create a new file(.lvr file) that smaller than source file
            -LerVar can parse the .lvr/.lervar file and create a new file that equivalent to/as same as their source file
            \u001B[34mWhat file can LerVar convert?\u001B[0m
            -.java file
            -.jar file
            \u001B[34mHow to contact author(s)?\u001B[0m
            -Review on https://github.com/J-pc-123/LerVar
            -Mail to 1691365315@qq.com
             \u001B[33m(If you don't within the Chinese mainland network, or haven't connect to the Chinese mainland network via VPN, send e-mail may be NOT a stable choice)\u001B[0m
            """;
    String LERVAR_INFO_WINDOWS =
            """
            > What's LerVar?
            --LerVar is a tool which is used to execute file.
            > Who owns the copyright of LerVar?
            --J_pc
            > Whether LerVar is open source?
            -Yes, it's licence is MIT and it was uploaded on Github
            > What LerVar can do?
            --LerVar can convert, parse, encrypt& convert the file
            --LerVar can execute the file and create a new file(.lvr file) that smaller than source file
            --LerVar can parse the .lvr/.lervar file and create a new file that equivalent to/as same as their source file
            > What file can LerVar convert?
            --.java file
            --.jar file
            > How to contact author(s)?
            -Review on https://github.com/J-pc-123/LerVar
            -Mail to 1691365315@qq.com
             (If you don't within the Chinese mainland network, or haven't connect to the Chinese mainland network via VPN, send e-mail may be NOT a stable choice)
            """;
    String LERVAR_VERSION = "v.pre-1.0_Beta1";
    String OS = System.getProperty("os.name").toLowerCase();
    String OS_ARCH = System.getProperty("os.arch").toLowerCase();
    String COPYRIGHT = "Copyright (c) 2026 J_pc and/or his studios";
}
