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
        List<CarInfo> carInfoList = Arrays.stream(carNameArray).map(CarInfo::new).toList();
        return carInfoList.stream().map(Car::new).toList();
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
