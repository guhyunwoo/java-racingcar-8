package racingcar.application.dto;

import java.util.List;

public record RacingResponse(
        List<RacingRoundInfo> racingRoundInfoResponse,
        List<String> winners
) {
}
