package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.movingStrategy.RandomMove;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomMoveTest {
    @Test
    @DisplayName("move 값이 3 또는 10이면 false를 반환한다")
    void movableFalse() {
        assertThat(new RandomMove(3).movable()).isFalse();
        assertThat(new RandomMove(10).movable()).isFalse();
    }

    @Test
    @DisplayName("move 값이 4 또는 9면 true를 반환한다")
    void movableTrue() {
        assertThat(new RandomMove(4).movable()).isTrue();
        assertThat(new RandomMove(9).movable()).isTrue();
    }
}
