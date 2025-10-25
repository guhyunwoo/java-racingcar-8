package racingcar.domain;

public class Car {
    private final CarInfo carInfo;
    private final RaceProgress raceProgress;

    public Car(CarInfo carInfo) {
        this.carInfo = carInfo;
        this.raceProgress = new RaceProgress();
    }

    public String tryAdvance(RandomNumber randomNumber) {
        if(randomNumber.isMoreThanCriterion()) {
            raceProgress.advance();
        }
        return raceProgress.getPosition();
    }
}
