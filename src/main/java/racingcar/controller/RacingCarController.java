package racingcar.controller;

public class RacingCarController {
    public void playRacing() {
        readInput(InputMessage.CAR_NAME_INPUT_MESSAGE);
    }

    private String readInput(InputMessage inputMessage) {
        System.out.println(inputMessage.content);
    }
}
