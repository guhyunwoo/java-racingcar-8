package racingcar.domain;

public class Racing {
    private final Cars cars;

    public Racing(Cars cars) {
        this.cars = cars;
    }

    public void start(Integer numberOfAttempts) {
        for (int i = 0; i < numberOfAttempts; i++) {
            playRound(cars);
        }
    }

    private void playRound(Cars cars) {
        for (Car car : cars) {
            RandomNumber randomNumber = new RandomNumber();
            car.tryAdvance(randomNumber);
        }
    }
}
