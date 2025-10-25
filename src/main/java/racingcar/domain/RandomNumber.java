package racingcar.domain;

public class RandomNumber {
    private final Integer value;
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
    private final Integer CRITERION = 4;

    public RandomNumber() {
        this.value = randomNumberGenerator.generateRandomNumber();
    }

    public Boolean isMoreThanCriterion() {
        return value >= CRITERION;
    }
}
