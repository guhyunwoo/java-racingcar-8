package racingcar.view;

import racingcar.dto.RacingCarInfo;
import racingcar.dto.RacingRoundInfo;
import racingcar.dto.RacingResponse;

public class RacingResponseView {
    public void showResponse(RacingResponse racingResponse) {
        System.out.println(OutputMessage.RACING_MESSAGE);
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
