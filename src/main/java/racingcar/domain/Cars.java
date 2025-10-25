package racingcar.domain;

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
        Integer maxDistance = cars.stream()
                .mapToInt(Car::getRacingDistance)
                .max()
                .orElseThrow(IllegalArgumentException::new);

        return cars.stream()
                .filter(car -> car.getRacingDistance() == maxDistance)
                .map(Car::getName)
                .toList();
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
