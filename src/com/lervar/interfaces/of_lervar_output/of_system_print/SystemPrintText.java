/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2025
 * J_pc and/or his studios
 * All rights reserved
 */

package com.lervar.interfaces.of_lervar_output.of_system_print;

public interface SystemPrintText {
    String lervarIcon = """
            ==============================================================
               WWW
               WWW
              WWW
              WWW            MMMMM   W| WWWW
             WWW           MM____MM  W^W    M
             WWW______WWW  MM        W|
            LWWWWWWWWWWWW   MMMMMM^  W|
                                          MMM        mmm
                                ######### MMM       MMM
              #########################   MMM      MMM
              ##################           MMM    MMM
                                           MMM   MMM    $WWWWW$   W| WWWW
                                           MMM  MMM   WW     WW   W^W    M
                                            MMMMM     WW     WW   W|
                                            WWWW       WWWWWW WW  W|
            """;
    String lervarVersion = "v.pre-1.0_Beta1";
    String os = System.getProperty("os.name").toLowerCase();
    String osArch = System.getProperty("os.arch").toLowerCase();
}
