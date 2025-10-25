package racingcar.domain;

import racingcar.dto.RacingRoundInfo;
import racingcar.dto.RacingCarInfo;
import racingcar.dto.RacingResponse;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    private final Cars cars;

    public Racing(Cars cars) {
        this.cars = cars;
    }

    public RacingResponse start(Integer numberOfAttempts) {
        List<RacingRoundInfo> racingRoundInfos = new ArrayList<>();
        for (int i = 0; i < numberOfAttempts; i++) {
            racingRoundInfos.add(playRound(cars));
        }
        return new RacingResponse(racingRoundInfos);
    }

    private RacingRoundInfo playRound(Cars cars) {
        List<RacingCarInfo> racingCarInfoList = new ArrayList<>();
        for (Car car : cars) {
            RandomNumber randomNumber = new RandomNumber();
            String position = car.tryAdvance(randomNumber);

            racingCarInfoList.add(new RacingCarInfo(car.getName(), position));
        }
        return new RacingRoundInfo(racingCarInfoList);
    }
}
