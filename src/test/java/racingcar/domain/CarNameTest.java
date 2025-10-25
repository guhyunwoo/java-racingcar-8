package racingcar.domain;

import org.junit.jupiter.api.Test;
import racingcar.error.ErrorMessage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {
    @Test
    void 자동차_이름_생성_성공() {
        // given
        String name = "pobi";

        // when
        CarName carName = new CarName(name);

        // then
        assertThat(carName.getName()).isEqualTo(name);
    }

    @Test
    void 자동차_이름이_5자인_경우_성공() {
        // given
        String name = "abcde";

        // when
        CarName carName = new CarName(name);

        // then
        assertThat(carName.getName()).isEqualTo(name);
    }

    @Test
    void 자동차_이름이_5자_초과하면_예외발생() {
        // given
        String name = "pobi12";

        // when & then
        assertThatThrownBy(() -> new CarName(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.CAR_NAME_TOO_LONG.content);
    }

    @Test
    void 자동차_이름이_null이면_예외발생() {
        // given
        String name = null;

        // when & then
        assertThatThrownBy(() -> new CarName(name))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void 자동차_이름이_비어있으면_예외발생() {
        // given
        String name = "";

        // when & then
        assertThatThrownBy(() -> new CarName(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.CAR_NAME_EMPTY.content);
    }

    @Test
    void 자동차_이름이_공백만_있으면_예외발생() {
        // given
        String name = "   ";

        // when & then
        assertThatThrownBy(() -> new CarName(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.CAR_NAME_EMPTY.content);
    }
}
