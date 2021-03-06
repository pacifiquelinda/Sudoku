//Author: Caleb Mugisha

package sudoku.problemdomain;

import sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
//    The game will start in Active state, and when a Complete state is achieved (based on GameLogic),
//      then a special UI screen will be displayed by the user interface.
    private final GameState gameState;

    private final int [][] gridState;
    /**
     * To make it easier to work with Arrays (where the first index position is 0 instead of 1, and so on),
     * Grid coordinates will be represented with x and y index values ranging from 0 (inclusive) to 8 (inclusive).
     */
    public static final int  GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return gridState;
    }
}
