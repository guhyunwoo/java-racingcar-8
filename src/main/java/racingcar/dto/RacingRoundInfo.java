package racingcar.dto;

import java.util.List;

public record RacingRoundInfo(
        List<RacingCarInfo> racingCarInfos
) {
}
