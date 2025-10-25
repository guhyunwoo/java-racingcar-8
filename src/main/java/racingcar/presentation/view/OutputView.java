package racingcar.presentation.view;

import racingcar.application.dto.RacingCarInfo;
import racingcar.application.dto.RacingRoundInfo;
import racingcar.application.dto.RacingResponse;

public class OutputView {
    public void showResponse(RacingResponse racingResponse) {
        System.out.println(OutputMessage.RACING_MESSAGE.content);
        racingResponse.racingRoundInfoResponse()
                .forEach(
                        racingRoundInfo -> {
                            showRoundResult(racingRoundInfo);
                            System.out.println();
                        }
                );
        String winners = String.join(", ", racingResponse.winners());

        System.out.printf(OutputMessage.RACING_WINNER_MESSAGE.content, winners);
    }

    private void showRoundResult(RacingRoundInfo racingRoundInfo) {
        racingRoundInfo.racingCarInfos()
                .forEach(this::showCarProgress);
    }

    private void showCarProgress(RacingCarInfo racingCarInfo) {
        System.out.printf(OutputMessage.RACING_PROGRESS_INFO_MESSAGE.content,
                racingCarInfo.carName(),
                racingCarInfo.position()
        );
    }
}
