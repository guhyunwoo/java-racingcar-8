package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;

public class RacingCarController {
    public void playRacing() {
        String carNameCsv = readInput(InputMessage.CAR_NAME_INPUT_MESSAGE);
    }

    private String readInput(InputMessage inputMessage) {
        System.out.println(inputMessage.content);
        String inputString =  Console.readLine();
        return inputString;
    }
}
