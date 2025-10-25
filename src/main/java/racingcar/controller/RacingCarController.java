package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;
import racingcar.domain.Racing;
import racingcar.dto.RacingResponse;
import racingcar.error.ErrorMessage;
import racingcar.util.Converter;
import racingcar.util.StringToCarsConverter;
import racingcar.util.StringToIntegerConverter;
import racingcar.view.InputMessage;
import racingcar.view.RacingResponseView;
import racingcar.view.View;

public class RacingCarController {
    private final View view;
    private final RacingResponseView racingResponseView;

    public RacingCarController(View view, RacingResponseView racingResponseView) {
        this.view = view;
        this.racingResponseView = racingResponseView;
    }

    public void playRacing() {
        view.showMessage(InputMessage.CAR_NAME_INPUT_MESSAGE);
        String carNameCsv = readInput();
        view.showMessage(InputMessage.NUMBER_OF_ATTEMPTS_INPUT_MESSAGE);
        String numberOfAttemptsInput = readInput();

        Converter<String, Cars> carsConverter = new StringToCarsConverter();
        Converter<String, Integer> integerConverter = new StringToIntegerConverter();

        Cars cars = carsConverter.convert(carNameCsv);
        Integer numberOfAttempts = integerConverter.convert(numberOfAttemptsInput);

        Racing racing = new Racing(cars);
        RacingResponse racingResponse = racing.start(numberOfAttempts);
        racingResponseView.showResponse(racingResponse);
    }

    private String readInput() {
        String inputString =  Console.readLine();
        validateInput(inputString);
        return inputString;
    }

    private void validateInput(String inputString) {
        if (inputString == null || inputString.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.content);
        }
    }
}
