package racingcar.util.converter;


import racingcar.error.ErrorMessage;

public class StringToPositiveIntegerConverter implements Converter<String, Integer> {
    private final static String POSITIVE_INTEGER_REGULAR_EXPRESSION = "^[1-9]\\d*$";

    @Override
    public Integer convert(String input) {
        if (!input.matches(POSITIVE_INTEGER_REGULAR_EXPRESSION)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.content);
        }
        return Integer.parseInt(input);
    }
}
