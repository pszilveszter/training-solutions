package exceptions.polinom;

public class Polynomial {
    private final double[] coefficients;

    public Polynomial(double[] coefficients) {
        if (coefficients == null) {
            throw new NullPointerException("coefficients is null");
        }
            this.coefficients = coefficients;
    }

    public Polynomial(String... coefficients) {
        try {
            this.coefficients = convertToDoubleArray(coefficients);
        }
        catch (NullPointerException npe) {
            throw new NullPointerException("coefficientStrs is null");
        }
        catch (NumberFormatException nfo) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", nfo);
        }
    }


    public double[] getCoefficients() {
        return coefficients;
    }

    public double evaluate(double x) { // based on Solution
        double result = 0d;
        int lenght = coefficients.length - 1;
        for (int i = lenght; i >= 0; i--) {
            result += coefficients[i] * Math.pow(x, (double)lenght - i);
        }
        return result;
    }

    private double[] convertToDoubleArray(String... s) {
        double[] result = new double[s.length];
        for (int i = 0; i < s.length; i++) {
            result[i] = Double.parseDouble(s[i]);
        }
        return result;
    }
}
