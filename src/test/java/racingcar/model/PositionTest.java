package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositionTest {
    @Test
    @DisplayName("3번 이동하면 toString()은 문자열 - 를 3개 리턴한다")
    void toStringOverride() {
        Position position = new Position();
        position.add();
        position.add();
        position.add();
        assertThat(position.toString()).isEqualTo("---");
    }
}
