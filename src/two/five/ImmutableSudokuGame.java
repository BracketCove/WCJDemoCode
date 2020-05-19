package two.five;

import two.four.GameState;

public class ImmutableSudokuGame {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;


    public ImmutableSudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    //Complicated, but much safer!
    public int[][] getCopyOfGridState() {
        int[][] newArray = new int[GRID_BOUNDARY][GRID_BOUNDARY];
        for (int xIndex = 0; xIndex < GRID_BOUNDARY; xIndex++){
            for (int yIndex = 0; yIndex < GRID_BOUNDARY; yIndex++ ){
                newArray[xIndex][yIndex] = gridState[xIndex][yIndex];
            }
        }
        return newArray;
    }
}
