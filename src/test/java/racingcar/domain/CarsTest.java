package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarsTest {
    @Test
    void 자동차_목록_생성() {
        // given
        String[] carNameArray = {"pobi", "woni", "jun"};

        // when
        Cars cars = new Cars(carNameArray);

        // then
        int count = 0;
        for (Car car : cars) {
            count++;
        }
        assertThat(count).isEqualTo(3);
    }

    @Test
    void 단일_자동차로_목록_생성() {
        // given
        String[] carNameArray = {"pobi"};

        // when
        Cars cars = new Cars(carNameArray);

        // then
        int count = 0;
        for (Car car : cars) {
            count++;
        }
        assertThat(count).isEqualTo(1);
    }

    @Test
    void 자동차_이름이_5자_초과하면_예외발생() {
        // given
        String[] carNameArray = {"pobi", "javaji"};

        // when & then
        assertThatThrownBy(() -> new Cars(carNameArray))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 빈_배열로_생성시_우승자_조회_예외발생() {
        // given
        String[] carNameArray = {};
        Cars cars = new Cars(carNameArray);

        // when & then
        assertThatThrownBy(cars::findWinners).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 초기_상태_우승자_조회() {
        // given
        String[] carNameArray = {"pobi", "woni"};
        Cars cars = new Cars(carNameArray);

        // when
        List<String> winners = cars.findWinners();

        // then
        assertThat(winners).hasSize(2);
        assertThat(winners).containsExactlyInAnyOrder("pobi", "woni");
    }
}
