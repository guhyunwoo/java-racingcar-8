package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.error.ErrorMessage;

public class RacingCarController {
    public void playRacing() {
        String carNameCsv = readInput(InputMessage.CAR_NAME_INPUT_MESSAGE);
    }

    private String readInput(InputMessage inputMessage) {
        System.out.println(inputMessage.content);
        String inputString =  Console.readLine();
        validateInput(inputString);
        return inputString;
    }

    private void validateInput(String inputString) {
        if (inputString == null || inputString.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_MESSAGE.content);
        }
    }
}
