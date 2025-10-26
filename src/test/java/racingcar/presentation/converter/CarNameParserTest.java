package racingcar.presentation.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarNameParserTest {
    private final CarNameParser parser = new CarNameParser();

    @Test
    void 쉼표로_구분된_이름_파싱() {
        // given
        String input = "pobi,woni,jun";

        // when
        String[] result = parser.parseCarName(input);

        // then
        assertThat(result).hasSize(3);
        assertThat(result).containsExactly("pobi", "woni", "jun");
    }

    @Test
    void 단일_이름_파싱() {
        // given
        String input = "pobi";

        // when
        String[] result = parser.parseCarName(input);

        // then
        assertThat(result).hasSize(1);
        assertThat(result).containsExactly("pobi");
    }

    @Test
    void 공백_포함_이름_파싱() {
        // given
        String input = "po bi,wo ni";

        // when
        String[] result = parser.parseCarName(input);

        // then
        assertThat(result).hasSize(2);
        assertThat(result).containsExactly("po bi", "wo ni");
    }

    @Test
    void 빈_문자열_사이_파싱() {
        // given
        String input = "pobi,,woni";

        // when
        String[] result = parser.parseCarName(input);

        // then
        assertThat(result).hasSize(3);
        assertThat(result).containsExactly("pobi", "", "woni");
    }
}
