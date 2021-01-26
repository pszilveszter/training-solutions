package exceptions.faults;

public enum ProcessingResult {
    WORD_COUNT_ERROR(2), VALUE_ERROR(4), DATE_ERROR(8), VALUE_AND_DATE_ERROR(12);

    private final short errorNum;

    ProcessingResult(int errorNum) {
        this.errorNum = (short) errorNum;
    }

    public short getCode() {
        return errorNum;
    }
}
