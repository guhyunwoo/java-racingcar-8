package racingcar.domain;

public class Car {
    private final CarName carName;
    private Position position;

    public Car(CarName carName) {
        this.carName = carName;
        this.position = Position.start();
    }

    public String tryAdvance(RandomNumber randomNumber) {
        if (randomNumber.isMoreThanCriterion()) {
            this.position = position.advance();
        }
        return position.getValue();
    }

    public String getName() {
        return carName.getName();
    }

    public Boolean isRacingDistanceEquals(Integer distance) {
        return getRacingDistance().equals(distance);
    }

    public Integer getRacingDistance() {
        return getPosition().length();
    }

    private String getPosition() {
        return position.getValue();
    }
}
