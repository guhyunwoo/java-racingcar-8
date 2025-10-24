package racingcar;

import racingcar.controller.RacingCarController;
import racingcar.view.View;

public class Application {
    public static void main(String[] args) {
        RacingCarController racingCarController = new RacingCarController(new View());
        racingCarController.playRacing();
    }
}
