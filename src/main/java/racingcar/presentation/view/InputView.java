package racingcar.presentation.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;
import racingcar.error.ErrorMessage;
import racingcar.util.converter.StringToCarsConverter;
import racingcar.util.converter.StringToPositiveIntegerConverter;

public class InputView {
    public Cars readCars() {
        System.out.println(InputMessage.CAR_NAME_INPUT_MESSAGE.content);
        String input = readLine();
        return new StringToCarsConverter().convert(input);
    }

    public Integer readAttempts() {
        System.out.println(InputMessage.NUMBER_OF_ATTEMPTS_INPUT_MESSAGE.content);
        String input = readLine();
        return new StringToPositiveIntegerConverter().convert(input);
    }

    private String readLine() {
        String input = Console.readLine();
        validateInput(input);
        return input;
    }

    private void validateInput(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.content);
        }
    }
}
