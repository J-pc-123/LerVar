/**
 * LerVar(v.pre-?.?_Beta?, v.release-?.?.?)
 * <p>
 *
 * @since 2025
 * Copyright (c) 2026 J_pc and/or his studios
 * SPDX-License-Identifier: MIT
 * URL: https://github.com/J-pc-123/LerVar/blob/main/LICENSE
 */

package com.lervar.interfaces.of_lervar_execute.of_java_file_execute.of_lervar_file_structure;

import com.lervar.main.Type;

import static com.lervar.main.Main.*;
import static com.lervar.main.execute.FileExecute.fileHeadData;

public interface LerVarFileStructure {
    boolean HAVE_FILE_HEAD_DATA = false;
    Object[
            //Structure type
    ][
            //Structure Length(byte)
    ] FILE_HEAD_STRUCTURE =
            {
                    {new Type("LerVar signature length"), 1},
                    {new Type("LerVar signature"), _LerVarSignature.length},
                    {new Type("Encrypt mod"), 1},
                    {new Type("Verify mod"), 2},
                    {new Type("Format"), 2 + fileHeadData.length},
                    {new Type("Encode"), 1},
                    {new Type("Pattern"), 1},
                    {new Type("Convert & Parse mod"), 1},
            };
}
