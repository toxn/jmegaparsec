package text.megaparsec.state;

import text.megaparsec.error.ParseError;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;

class State<S, E>  {
    /** 
     * The rest of input to process
     */
    private S input;
    
    /**
     * Number of processed tokens so far
     * 
     * @since 7.0.0
     */
    private int offset;

    /**
     * State that is used for line\/column calculation
     * 
     * @since 7.0.0
     */
    private PosState posState;
    
    /**
     * Collection of “delayed” 'ParseError's in reverse order. This means
     * that the last registered error is the first element of the list.
     * 
     * @since 8.0.0
     */
    private Collection<ParseError> parseErrors;

    /**
     * Given the name of the source file and the input construct the initial
     * state for a parser.
     * 
     * @since 9.6.0
     * 
     * @param name Name of the file the input is coming from
     * @param s Input
     */
    State(Path name, S s) {
        input       = s;
        offset      = 0;
        posState    = new PosState(name, s);
        parseErrors = new ArrayList<>();
    }

}
