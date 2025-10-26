package racingcar.presentation.converter;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Cars;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringToCarsConverterTest {
    private final StringToCarsConverter converter = new StringToCarsConverter();

    @Test
    void 쉼표로_구분된_자동차_이름_변환() {
        // given
        String input = "pobi,woni,jun";

        // when
        Cars cars = converter.convert(input);

        // then
        int count = 0;
        for (Car car : cars) {
            count++;
        }
        assertThat(count).isEqualTo(3);
    }

    @Test
    void 단일_자동차_이름_변환() {
        // given
        String input = "pobi";

        // when
        Cars cars = converter.convert(input);

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
        String input = "pobi,javaji";

        // when & then
        assertThatThrownBy(() -> converter.convert(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 빈_자동차_이름이_포함되면_예외발생() {
        // given
        String input = "pobi,,woni";

        // when & then
        assertThatThrownBy(() -> converter.convert(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
