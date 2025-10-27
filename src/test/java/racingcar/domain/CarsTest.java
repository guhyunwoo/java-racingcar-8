package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarsTest {
    @Test
    void 자동차_목록_생성() {
        // given
        List<String> carNames = List.of("pobi", "woni", "jun");

        // when
        Cars cars = new Cars(carNames);

        // then
        int count = 0;
        for (Car car : cars) {
            count++;
        }
        assertThat(count).isEqualTo(3);
    }

    @Test
    void 자동차가_2대_미만으로_생성되면_예외발생() {
        // given
        List<String> carNames = List.of("pobi");

        // when & then
        assertThatThrownBy(() -> new Cars(carNames))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름이_5자_초과하면_예외발생() {
        // given
        List<String> carNames = List.of("pobi", "javaji");

        // when & then
        assertThatThrownBy(() -> new Cars(carNames))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 최대_거리가_같은_자동차가_2대_이상일때_우승자_조회() {
        // given
        List<String> carNames = List.of("pobi", "woni");
        Cars cars = new Cars(carNames);

        // when
        List<String> winners = cars.findWinners();

        // then
        assertThat(winners).hasSize(2);
        assertThat(winners).containsExactlyInAnyOrder("pobi", "woni");
    }
}
