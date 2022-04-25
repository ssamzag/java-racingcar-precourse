package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {
    @Test
    @DisplayName("생성자로 name 문자열을 넘기면 toString() 시 name 문자열을 리턴한다.")
    void toStringNameString() {
        assertThat(new Name("ssam").toString()).isEqualTo("ssam");
    }

    @Test
    @DisplayName("이름이 5자 초과하면 예외가 발생한다")
    void nameMaxLengthException() {
        assertThatThrownBy(() -> new Name("ssamza"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 5자를 초과할 수 없습니다.");
    }

    @ParameterizedTest
    @DisplayName("이름이 공백이거나 null 이면 예외가 발생한다")
    @NullAndEmptySource
    void 이름_공백시_예외발생(String name) {
        assertThatThrownBy(() -> new Name(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름을 공백일 수 없습니다.");
    }
}
