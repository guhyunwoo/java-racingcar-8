package racingcar.util.converter;

import racingcar.domain.CarNameParser;
import racingcar.domain.Cars;

public class StringToCarsConverter implements Converter<String, Cars> {
    @Override
    public Cars convert(String input) {
        CarNameParser carNameParser = new CarNameParser();

        String[] carNameArray = carNameParser.parseCarName(input);
        return new Cars(carNameArray);
    }
}
