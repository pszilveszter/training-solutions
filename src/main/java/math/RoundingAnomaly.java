package math;

import java.util.Random;

public class RoundingAnomaly {

    public double[] randomNumbers(int size, double max, int scale) {
        double[] numbers = new double[size];
        Random rnd = new Random();
        double fractionLenght = Math.pow(10, scale);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt((int) max) + rnd.nextInt((int) fractionLenght) / fractionLenght;
        }

        return numbers;
    }


    public double roundAfterSum(double[] numbers) {
        double sum = 0;

        for (double random : numbers) {
            sum += random;
        }

        return Math.round(sum);
    }

    public double sumAfterRound(double[] numbers) {
        double sum = 0;

        for (double random : numbers) {
            sum += Math.round(random);
        }

        return sum;
    }


    public double difference(int size, double max, int scale) {
        double[] generatedNumbers = randomNumbers(size,max,scale);

        double roundOfSums = roundAfterSum(generatedNumbers);
        double sumOfRounds = sumAfterRound(generatedNumbers);

        return roundOfSums - sumOfRounds;
    }


    public static void main(String[] args) {
        RoundingAnomaly anomaly = new RoundingAnomaly();
        double[] differences = new double[100];
        double sumOfAnomalies = 0;

        for (double difference : differences) {
            difference = anomaly.difference(1_000,1_000_000,5);
            sumOfAnomalies += difference;
        }

        System.out.println(sumOfAnomalies / differences.length);
    }
}
