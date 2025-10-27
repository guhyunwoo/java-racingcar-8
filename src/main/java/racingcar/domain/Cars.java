package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cars implements Iterable<Car> {
    private final List<Car> cars;

    public Cars(String[] carNameArray) {
        this.cars = carNameArrayToCars(carNameArray);
    }

    private List<Car> carNameArrayToCars(String[] carNameArray) {
        List<CarName> carNameList = Arrays.stream(carNameArray).map(CarName::new).toList();
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

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
