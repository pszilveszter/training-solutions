package exceptionmulticatch.converter;

public class AnswerStat {

    BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter converter) {
        this.converter = converter;
    }

    public boolean[] convert(String s) {
        try {
            return converter.binaryStringToBooleanArray(s);
        }
        catch (NullPointerException | IllegalArgumentException ex) {
            throw new InvalidBinaryStringException("Conversion failure", ex);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] values = convert(answers);
        int numOfTrueValues = 0;
        for (boolean b: values) {
            if (b) {
                numOfTrueValues++;
            }
        }
        return numOfTrueValues * 100 / values.length;
    }
}
