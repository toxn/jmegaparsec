package text.megaparsec.error;

/**
 * Additional error data, extendable by user. When no custom data is
 * necessary, the type is typically indexed by 'Void' to “cancel” the
 * 'ErrorCustom' constructor.
 */
abstract class ErrorFancy<E> {
    /**
     * 'fail' has been used in parser monad
     */
    static class ErrorFail extends ErrorFancy<String> {}

    /**
     * Incorrect indentation error: desired ordering between reference
     * level and actual level, reference indentation level, actual
     * indentation level
     */
    static class ErrorIndentation extends ErrorFancy<Comparable<Pos>> {
        ErrorIndentation(Comparable<Pos> pos) {}
    }

    /**
     * Custom error data
     */
    static class ErrorCustom extends ErrorFancy {}
}
