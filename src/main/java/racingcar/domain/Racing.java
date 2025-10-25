package racingcar.domain;

public class Racing {
    private final Cars cars;

    public Racing(Cars cars) {
        this.cars = cars;
    }

    public String start(Integer numberOfAttempts) {
        for (int i = 0; i < numberOfAttempts; i++) {
            advance(cars);
        }
    }

    private void advance(Cars cars) {
        for (Car car : cars) {
            RandomNumber randomNumber = new RandomNumber();
        }
    }
}
