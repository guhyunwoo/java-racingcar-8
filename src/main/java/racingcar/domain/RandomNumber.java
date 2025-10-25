package racingcar.domain;

public class RandomNumber {
    private final Integer value;
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public RandomNumber() {
        this.value = randomNumberGenerator.generateRandomNumber();
    }
}
