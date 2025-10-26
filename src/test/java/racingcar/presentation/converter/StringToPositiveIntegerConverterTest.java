package racingcar.presentation.converter;

import org.junit.jupiter.api.Test;
import racingcar.error.ErrorMessage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringToPositiveIntegerConverterTest {
    private final StringToPositiveIntegerConverter converter = new StringToPositiveIntegerConverter();

    @Test
    void 양수_문자열_변환_성공() {
        // given
        String input = "5";

        // when
        Integer result = converter.convert(input);

        // then
        assertThat(result).isEqualTo(5);
    }

    @Test
    void 한자리_양수_변환_성공() {
        // given
        String input = "1";

        // when
        Integer result = converter.convert(input);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void 여러자리_양수_변환_성공() {
        // given
        String input = "123";

        // when
        Integer result = converter.convert(input);

        // then
        assertThat(result).isEqualTo(123);
    }

    @Test
    void 영으로_시작하는_숫자_예외발생() {
        // given
        String input = "01";

        // when & then
        assertThatThrownBy(() -> converter.convert(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INVALID_INPUT.content);
    }

    @Test
    void 음수_예외발생() {
        // given
        String input = "-1";

        // when & then
        assertThatThrownBy(() -> converter.convert(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INVALID_INPUT.content);
    }

    @Test
    void 영_예외발생() {
        // given
        String input = "0";

        // when & then
        assertThatThrownBy(() -> converter.convert(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INVALID_INPUT.content);
    }

    @Test
    void 문자_포함_예외발생() {
        // given
        String input = "a1";

        // when & then
        assertThatThrownBy(() -> converter.convert(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INVALID_INPUT.content);
    }

    @Test
    void 빈_문자열_예외발생() {
        // given
        String input = "";

        // when & then
        assertThatThrownBy(() -> converter.convert(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INVALID_INPUT.content);
    }

    @Test
    void 공백_포함_예외발생() {
        // given
        String input = "1 2";

        // when & then
        assertThatThrownBy(() -> converter.convert(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INVALID_INPUT.content);
    }

    @Test
    void 특수문자_예외발생() {
        // given
        String input = "1!";

        // when & then
        assertThatThrownBy(() -> converter.convert(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INVALID_INPUT.content);
    }
}
