package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PositionTest {
    @Test
    void 시작_위치_생성() {
        // when
        Position position = Position.start();

        // then
        assertThat(position.getValue()).isEqualTo("");
    }

    @Test
    void 위치_전진() {
        // given
        Position position = Position.start();

        // when
        Position advancedPosition = position.advance();

        // then
        assertThat(advancedPosition.getValue()).isEqualTo("-");
    }

    @Test
    void 시작_위치는_불변() {
        // given
        Position position = Position.start();

        // when
        position.advance();

        // then
        assertThat(position.getValue()).isEqualTo("");
    }
}
