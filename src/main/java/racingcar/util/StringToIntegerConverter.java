package racingcar.util;

import racingcar.error.ErrorMessage;

import java.util.InputMismatchException;

public class StringToIntegerConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InputMismatchException(ErrorMessage.INVALID_INPUT.content);
        }
    }
}
