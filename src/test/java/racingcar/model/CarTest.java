package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;

    @BeforeEach
    void setCar() {
        this.car = new Car("ssam");
    }
    @Test
    @DisplayName("경계값인 4 또는 9가 입력되었을 경우 이동")
    void moveCar() {
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
        car.move(9);
        assertThat(car.getPosition()).isEqualTo(2);
    }

    @Test
    @DisplayName("3 또는 10이 입력되었을 경우 정지")
    void stopCar() {
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
        car.move(10);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("우승 포지션값이 3이고 조회차량의 포지션값이 3이라면 true 를 반환한다.")
    void winnerPosition() {
        car.move(4);
        car.move(4);
        car.move(4);
        assertThat(car.isWinnerPosition(3)).isTrue();
    }

    @Test
    @DisplayName("우승 포지션값이 3이고 조회차량의 포지션값이 2라면 false 를 반환한다.")
    void losePosition() {
        car.move(4);
        car.move(4);
        assertThat(car.isWinnerPosition(3)).isFalse();
    }

    @Test
    @DisplayName("이동조건 true 를 1번 주입하면 포지션값 1을 반환한다.")
    void moveCarByMovingStrategyTrue() {
        Car car = new Car("ssam");
        car.move(() -> true);
        assertThat(car.getPosition()).isEqualTo(1);
    }


    @Test
    @DisplayName("이동조건 false 를 3번 주입하면 포지션값 0을 반환한다.")
    void moveCarByMovingStrategyFalse() {
        car.move(() -> false);
        car.move(() -> false);
        car.move(() -> false);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
