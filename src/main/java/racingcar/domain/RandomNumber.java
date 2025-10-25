package racingcar.domain;

import java.util.Random;

public class RandomNumber {
    private final Integer value;
    private static final Random random = new Random();
    private static final Integer RANDOM_NUMBER_BOUND = 10;
    private static final Integer CRITERION = 4;

    public RandomNumber() {
        this.value = random.nextInt(RANDOM_NUMBER_BOUND);
    }

    public Boolean isMoreThanCriterion() {
        return value >= CRITERION;
    }
}
