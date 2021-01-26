package exceptionmulticatch.converter;

public class InvalidBinaryStringException extends RuntimeException {

    public InvalidBinaryStringException(String message, Throwable exception) {
        super(message, exception);
    }

}
