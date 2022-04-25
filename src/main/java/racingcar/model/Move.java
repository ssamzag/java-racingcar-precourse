package racingcar.model;

public class Move implements MovingStrategy {
    @Override
    public boolean movable() {
        return false;
    }
}
