package two.four;

public class SudokuGame {
    //These are member variables
    private int[][] gridState;
    private GameState gameState;

    public SudokuGame(int[][] gridState, GameState gameState){
        this.gridState = gridState;
        this.gameState = gameState;
    }

    public int[][] getGridState(){
        return this.gridState;
    }

    public void setGridState(int[][] gridState) {
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
