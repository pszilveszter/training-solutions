package methodvarargs;

public class ExamStats {

    private double maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }


    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        isEmpty(results);
        int counter = 0;
        for (int result: results) {
            if (result > limitInPercent * maxPoints / 100) {
                counter++;
            }
        }
        return counter;
    }


    public boolean hasAnyFailed(int limitInPercent, int... results) {
        isEmpty(results);
        boolean isFailed = false;
        int currentItem = 0;
        while (currentItem < results.length && !isFailed) {
            isFailed = limitInPercent > results[currentItem] * maxPoints / 100;
            currentItem++;
        }
        return isFailed;
    }


    private void isEmpty(int[] args) {
        if (args == null || args.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
    }
}
