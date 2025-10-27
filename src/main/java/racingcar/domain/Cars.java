package racingcar.domain;

import racingcar.error.ErrorMessage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cars implements Iterable<Car> {
    private final List<Car> cars;

    public Cars(List<String> carNames) {
        List<Car> cars = carNameListToCars(carNames);
        validateCars(cars);
        this.cars = cars;
    }

    private List<Car> carNameListToCars(List<String> carNames) {
        List<CarName> carNameList = carNames.stream().map(CarName::new).toList();
        return carNameList.stream().map(Car::new).toList();
    }

    public List<String> findWinners() {
        int maxDistance = 0;
        List<String> winners = new ArrayList<>();

        for (Car car : cars) {
            int distance = car.getRacingDistance();

            if (car.isRacingDistanceBiggerThan(maxDistance)) {
                maxDistance = distance;
                winners.clear();
                winners.add(car.getName());
            } else if (car.isRacingDistanceEquals(maxDistance)) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    private void validateCars(List<Car> cars) {
        if(cars.size() < 2) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CARS_COUNT.content);
        }
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
