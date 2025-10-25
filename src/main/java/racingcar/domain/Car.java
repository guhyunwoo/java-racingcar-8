package racingcar.domain;

public class Car {
    private final CarInfo carInfo;
    private final RaceProgress raceProgress;

    public Car(CarInfo carInfo) {
        this.carInfo = carInfo;
        this.raceProgress = new RaceProgress();
    }

    public String advance() {
        raceProgress.advance();
        return raceProgress.getPosition();
    }
}
