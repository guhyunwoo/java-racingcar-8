package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    @Test
    void 자동차_생성() {
        // given
        CarName carName = new CarName("pobi");

        // when
        Car car = new Car(carName);

        // then
        assertThat(car.getName()).isEqualTo("pobi");
        assertThat(car.getRacingDistance()).isEqualTo(0);
    }

    @Test
    void 자동차_이름_조회() {
        // given
        CarName carName = new CarName("woni");
        Car car = new Car(carName);

        // when
        String name = car.getName();

        // then
        assertThat(name).isEqualTo("woni");
    }

    @Test
    void 자동차_초기_거리는_0() {
        // given
        CarName carName = new CarName("pobi");
        Car car = new Car(carName);

        // when
        Integer distance = car.getRacingDistance();

        // then
        assertThat(distance).isEqualTo(0);
    }

    @Test
    void 동일한_거리_비교_true() {
        // given
        CarName carName = new CarName("pobi");
        Car car = new Car(carName);

        // when
        Boolean result = car.isRacingDistanceEquals(0);

        // then
        assertThat(result).isTrue();
    }

    @Test
    void 다른_거리_비교_false() {
        // given
        CarName carName = new CarName("pobi");
        Car car = new Car(carName);

        // when
        Boolean result = car.isRacingDistanceEquals(5);

        // then
        assertThat(result).isFalse();
    }
}
