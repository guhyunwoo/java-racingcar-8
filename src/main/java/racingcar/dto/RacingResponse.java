package racingcar.dto;

import java.util.List;

public record RacingResponse(
        List<RacingRoundInfo> racingRoundInfoResponse

) {
}
