package racingcar.model;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.stream.IntStream;

public class Position {
    private static final String DASH = "-";
    private static final String TARGET = "\0";
    private int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        this.position = position;
    }

    public void add() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        return new String(new char[this.position]).replace(TARGET, DASH);
    }
}
