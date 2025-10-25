package racingcar.presentation.controller;

import racingcar.application.dto.RacingResponse;
import racingcar.application.service.RacingService;
import racingcar.domain.Cars;
import racingcar.presentation.view.InputView;
import racingcar.presentation.view.OutputView;

public class RacingCarController {
    private final InputView inputView;
    private final OutputView outputView;
    private final RacingService racingService;

    public RacingCarController(InputView inputView, OutputView outputView, RacingService racingService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.racingService = racingService;
    }

    public void playRacing() {
        Cars cars = inputView.readCars();
        Integer numberOfAttempts = inputView.readAttempts();

        RacingResponse racingResponse = racingService.start(numberOfAttempts, cars);
        outputView.showResponse(racingResponse);
    }
}
