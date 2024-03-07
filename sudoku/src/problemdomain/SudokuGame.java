package problemdomain;

import computationLogic.SudokuUtilities;
import constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridstate;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridstate) {
        this.gameState = gameState;
        this.gridstate = gridstate;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridstate() {
        return SudokuUtilities.copyToNewArray(gridstate);
    }
}
