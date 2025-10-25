package racingcar;

import racingcar.application.service.RacingService;
import racingcar.presentation.controller.RacingCarController;
import racingcar.presentation.view.InputView;
import racingcar.presentation.view.OutputView;

public class Application {
    public static void main(String[] args) {
        RacingCarController racingCarController = new RacingCarController(
                new InputView(),
                new OutputView(),
                new RacingService()
        );
        racingCarController.playRacing();
    }
}
