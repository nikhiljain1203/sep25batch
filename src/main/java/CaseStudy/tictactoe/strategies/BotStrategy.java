package CaseStudy.tictactoe.strategies;

import CaseStudy.tictactoe.models.Board;
import CaseStudy.tictactoe.models.Move;
import CaseStudy.tictactoe.models.Player;

public interface BotStrategy {
    Move makeMove(Board board, Player player);
}
