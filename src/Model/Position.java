package Model;

public class Position {

    private int x;
    private int y;
    private PositionStates positionState = PositionStates.EMPTY;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public PositionStates getPositionState() {
        return positionState;
    }

    public void setPositionState(PositionStates positionState) {
        this.positionState = positionState;
    }
}
