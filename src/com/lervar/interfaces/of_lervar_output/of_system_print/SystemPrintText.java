/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026
 * J_pc and/or his studios
 * All rights reserved
 */

package com.lervar.interfaces.of_lervar_output.of_system_print;

public interface SystemPrintText {
    String LERVAR_ICON_LINUX = """
            ==========================================================================================
                                                   #/---------------->
                                                   /
                                                  /
                WWW                              /
                WWW                             /
               WWW                             /
               WWW                            /
              WWW                            /
              WWW            MMMMM   W| WWW\u001B[31mW\u001B[0m/
             WWW           MM____MM  W^W   /\u001B[31mM\u001B[0m
             WWW______WWW  MM        W|   / MMM           MMM
            LWWWWWWWWWWWW   MMMMMM^  W|  /  MMM          MMM
                                        /    MMM        MMM
                                       /     MMM       MMM
                                      /      MMM      MMM
                                     /        MMM    MMM
                                    /         MMM   MMM    $WWWW$   W| WWWW
                                   /          MMM  MMM   WW    WW   W^W    M
                                  /            MMMMM     WW    WW   W|
                                 /             WWWW       WWWWW WW  W|
                                /
                               /
             <----------------/#
             ==========================================================================================
            """;
    String LERVAR_ICON_WINDOWS = """
            ==========================================================================================
                                                   #/---------------->
                                                   /
                                                  /
                WWW                              /
                WWW                             /
               WWW                             /
               WWW                     File---/
              WWW                            /
              WWW            MMMM   W| WWW >/
             WWW           MM___MM  W^W   W/<
             WWW______WWW  MM       W|    / MMM           MMM
            LWWWWWWWWWWWW   MMMMM^  W|   /  MMM          MMM
                                        /    MMM        MMM
                                       /     MMM       MMM
                                      /      MMM      MMM
                                     /        MMM    MMM
                                    /         MMM   MMM    $WWW$   W| WWW
                                   /          MMM  MMM   WW   WW   W^W   M
                                  /            MMMMM     WW   WW   W|
                                 /             WWWW       WWWW WW  W|
                                /
                               /
             <----------------/#
            ==========================================================================================
            """;
    String LERVAR_VERSION = "v.pre-1.0_Beta2";
    String OS = System.getProperty("os.name").toLowerCase();
    String OS_ARCH = System.getProperty("os.arch").toLowerCase();
}
