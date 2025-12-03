package CaseStudy.tictactoe.strategies;

import CaseStudy.tictactoe.models.*;

import java.util.List;

public class EasyBotStrategy implements BotStrategy {
    @Override
    public Move makeMove(Board board, Player player) {
        // Simple logic for easy bot: choose the first available cell
        for(List<Cell> cellList: board.getCells()) {
            for(Cell cell: cellList) {
                if(cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(cell, player); // Player will be set later
                }
            }
        }
        return null; // No moves available
    }
}
