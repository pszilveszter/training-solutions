package algorithmsmax.trainers;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer trainerWithMaxAge(List<Trainer> trainers) {
        Trainer trainerWMaxAge = null;
        for (Trainer t : trainers) {
            if (trainerWMaxAge == null || t.getAge() > trainerWMaxAge.getAge() ) {
                trainerWMaxAge = t;
            }
        }
        return trainerWMaxAge;
    }
}
