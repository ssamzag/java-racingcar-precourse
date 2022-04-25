package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    @DisplayName("경계값인 4가 입력되었을 경우 이동")
    void moveCar() {
        Car car = new Car("ssam");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void stopCar() {
        Car car = new Car("ssam");
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
