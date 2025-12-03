package CaseStudy.tictactoe.strategies;

import CaseStudy.tictactoe.models.Board;
import CaseStudy.tictactoe.models.Move;
import CaseStudy.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {

    private Map<Integer, Map<Symbol, Integer>> rowCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        rowCounts.putIfAbsent(row, new HashMap<>());
        Map<Symbol, Integer> symbolCountMap = rowCounts.get(row);
        symbolCountMap.put(symbol, symbolCountMap.getOrDefault(symbol, 0) + 1);

        return symbolCountMap.get(symbol) == board.getDimension();
    }
}
