package racingcar.presentation.converter;

import racingcar.domain.Cars;

import java.util.Arrays;

public class StringToCarsConverter implements Converter<String, Cars> {
    @Override
    public Cars convert(String input) {
        CarNameParser carNameParser = new CarNameParser();

        String[] carNameArray = carNameParser.parseCarName(input);
        return new Cars(Arrays.stream(carNameArray).toList());
    }
}
