package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.CarNameParser;
import racingcar.domain.Cars;
import racingcar.error.ErrorMessage;
import racingcar.view.InputMessage;
import racingcar.view.View;

public class RacingCarController {
    private final View view;

    public RacingCarController(View view) {
        this.view = view;
    }

    public void playRacing() {
        view.showMessage(InputMessage.CAR_NAME_INPUT_MESSAGE);
        String carNameCsv = readInput();
        view.showMessage(InputMessage.NUMBER_OF_ATTEMPTS_INPUT_MESSAGE);
        String numberOfAttempts = readInput();

        CarNameParser carNameParser = new CarNameParser();

        String[] carNameArray = carNameParser.parseCarName(carNameCsv);
        Cars cars = new Cars(carNameArray);
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
