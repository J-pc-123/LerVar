/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 * @since 2025
 * Copyright (c) 2026
 * J_pc and/or his studios
 * All rights reserved
 */

package com.lervar.main;

/**
 * >build in JDK 17.0.0<
 */

public class Main implements com.lervar.interfaces.of_lervar_output.of_system_print.SystemPrintText {
    /*
     *                             _ooOoo_
     *                            o8888888o
     *                            88" . "88
     *                            (| -_- |)
     *                            O\  =  /O
     *                         ____/'---'\____
     *                       .'  \\|     |//  `.
     *                      /  \\|||  :  |||//  \
     *                     /  _||||| -:- |||||-  \
     *                     |   | \\\  -  /// |   |
     *                     | \_|  ''\---/''  |   |
     *                     \  .-\__  `-`  ___/-. /
     *                   ___`. .'  /--.--\  `. . __
     *                ."" '<  `.___\_<|>_/___.'  >'"".
     *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     *               \  \ `-.   \_ __\ /__ _/   .-` /  /
     *          ======`-.____`-.___\_____/___.-`____.-'======
     *                             '=---='
     *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
     *                     佛祖保佑        永无BUG
     */
    public static void main(String[] srg) {
        if (System.getProperty("os.name").toLowerCase().contains("win"))
            System.out.print(lervarIcon_Windows);
        else
            System.out.print(lervarIcon_Linux);
        System.out.println("LerVar " + lervarVersion);
        System.out.print("Run in " + os + " with ");
        System.out.println(osArch);
        RunClasses.runClasses();
    }
}
