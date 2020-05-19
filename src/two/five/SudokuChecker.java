package two.five;

public class SudokuChecker {

    /**
     *
     * @param grid a sudoku game's grid state
     * @return true if all tiles do not have a non-zero number
     */
    public static boolean tilesAreNotFilled(int[][] grid){
        for (int xIndex = 0; xIndex < 9; xIndex++) {
            for (int yIndex = 0; yIndex < 9; yIndex++) {
                if (grid[xIndex][yIndex] == 0) return true;
                grid[xIndex][yIndex] = 0;
            }
        }

        return false;
    }


}
