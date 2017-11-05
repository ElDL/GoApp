package Model;

public class Board {
    private int dimX;
    private int dimY;
    private Position[][] positions;

    public Board(int dimX, int dimY) {
        this.dimX = dimX;
        this.dimY = dimY;
        this.positions = new Position[dimX][dimY];
        resetPositions();
    }

    private void resetPositions() {
        for (int i = 0; i < positions.length; i++){
            for (int j = 0; j < positions[i].length; i++){
                positions[i][j] = new Position(i, j);
            }
        }
    }

    public void addStone(PositionStates state, int X, int Y){
        positions[X][Y].setPositionState(state);
    }

    public void removeStone(int X, int Y){
        positions[X][Y].setPositionState(PositionStates.EMPTY);
    }
}
