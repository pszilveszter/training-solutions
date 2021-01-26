package exceptionclass.bank;

public class InvalidBankOperationException extends RuntimeException {
    private final ErrorCode errorCode;

    public InvalidBankOperationException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
