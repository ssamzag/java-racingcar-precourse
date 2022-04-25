package racingcar.model;

import java.util.Objects;

public class Car {
    private static final int FORWARD_BEGIN_NUM = 4;
    private static final int FORWARD_END_NUM = 9;
    private final Name name;
    private final Position position;
    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(int number) {
        if (number >= FORWARD_BEGIN_NUM && number <= FORWARD_END_NUM) {
            position.increase();
        }
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.movable()) {
            position.increase();
        }
    }

    public int getPosition() {
        return this.position.getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        return this.name + ": " + position;
    }

    public boolean isWinnerPosition(int position) {
        return this.position.isMaxPosition(position);
    }
}
