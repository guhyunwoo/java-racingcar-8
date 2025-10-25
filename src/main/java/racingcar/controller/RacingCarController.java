package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.Racing;
import racingcar.dto.RacingResponse;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingCarController {
    private final InputView inputView;
    private final OutputView outputView;

    public RacingCarController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void playRacing() {
        Cars cars = inputView.readCars();
        Integer numberOfAttempts = inputView.readAttempts();

        Racing racing = new Racing(cars);
        RacingResponse racingResponse = racing.start(numberOfAttempts);
        outputView.showResponse(racingResponse);
    }
}
