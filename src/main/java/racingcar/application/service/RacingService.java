package racingcar.application.service;

import racingcar.application.dto.RacingCarInfo;
import racingcar.application.dto.RacingResponse;
import racingcar.application.dto.RacingRoundInfo;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.RandomNumber;

import java.util.ArrayList;
import java.util.List;

public class RacingService {
    public RacingResponse start(Integer numberOfAttempts, Cars cars) {
        List<RacingRoundInfo> racingRoundInfos = new ArrayList<>();
        for (int i = 0; i < numberOfAttempts; i++) {
            racingRoundInfos.add(playRound(cars));
        }
        List<String> winners = cars.findWinners();
        return new RacingResponse(racingRoundInfos, winners);
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
