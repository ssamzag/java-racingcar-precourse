package racingcar.model;

import java.util.Objects;

public class Name {
    private static final String MAX_LENGTH_ERROR_MESSAGE = "이름은 5자를 초과할 수 없습니다.";
    private static final String BLANK_ERROR_MESSAGE = "이름을 공백일 수 없습니다.";
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public Name(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (isBlank(name)) {
            throw new IllegalArgumentException(BLANK_ERROR_MESSAGE);
        }
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(MAX_LENGTH_ERROR_MESSAGE);
        }
    }

    private boolean isBlank(String name) {
        return name == null || name.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
