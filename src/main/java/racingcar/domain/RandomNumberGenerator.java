package racingcar.domain;

import java.util.Random;

public class RandomNumberGenerator {
    private final Random RANDOM = new Random();

    public Integer generateRandomNumber() {
        return RANDOM.nextInt(10);
    }
}
