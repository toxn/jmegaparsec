package jmegaparsec.state;

import java.nio.file.Path;

/**
 * A special kind of state that is used to calculate line/column
 * positions on demand.
 */
class PosState<S> {
    /**
     * The rest of input to process
     */
    S input;

    /**
     * Offset corresponding to beginning of {@link #input}
     */
    int offset;

    /**
     * Source position corresponding to beginning of {@link #input}
     */
    SourcePos sourcePos;

    /**
     * Tab width to use for column calculation
     */
    Pos tabWidth;

    /**
     * Prefix to prepend to offending line
     */
    String linePrefix;

    /**
     * Given the name of source file and the input construct the initial
     * positional state.
     * 
     * @since 9.6.0
     * 
     * @param name Name of the file the input is coming from
     * @param s Input
     */
    PosState(Path name, S s) {
        input = s;
        offset = 0;
        sourcePos = new SourcePos(name);
        tabWidth = defaultTabWidth;
        linePrefix = "";
    }
}
