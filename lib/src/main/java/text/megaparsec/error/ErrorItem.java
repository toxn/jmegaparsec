package text.megaparsec.error;

import java.util.stream.Stream;

/**
 * Parse error type
 * 
 * <p>A data type that is used to represent “unexpected/expected” items in
 * {@link ParseError}.</p>
 * 
 * @param <T> token type
 */
abstract class ErrorItem<T> {
    /**
     * Non-empty stream of tokens
     * @param <T>
     */
    static class Tokens extends ErrorItem<T> {
        public Tokens(T t)
    }

    /**
     * Label (cannot be empty)
     */
    static class Label extends ErrorItem<Stream<Character>> {

    /**
     * End of input
     */
    }
    static class EndOfInput extends ErrorItem {
        
    }
    
    static <T> ErrorItem<T> create<>
}
