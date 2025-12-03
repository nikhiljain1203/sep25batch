package CaseStudy.tictactoe;

import CaseStudy.tictactoe.controllers.GameController;
import CaseStudy.tictactoe.exceptions.InvalidMoveException;
import CaseStudy.tictactoe.models.*;
import CaseStudy.tictactoe.strategies.ColWinningStrategy;
import CaseStudy.tictactoe.strategies.RowWinningStrategy;
import CaseStudy.tictactoe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws InvalidMoveException {
        System.out.println("Welcome to Tic Tac Toe Game!");
        int dimension = 3;
        List<Player> players = new ArrayList<>();
        players.add(
                new Player("Nikhil",
                        new Symbol("X"),
                        PlayerType.HUMAN));
        players.add(
                new Bot("ABC",
                        new Symbol("O"),
                        BotDifficulty.LOW));

        RowWinningStrategy rowWinningStrategy = new RowWinningStrategy();
        ColWinningStrategy colWinningStrategy = new ColWinningStrategy();
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(rowWinningStrategy);
        winningStrategies.add(colWinningStrategy);

        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension, players, winningStrategies);

        while (game.getGameState().equals(GameState.IN_PROGRESS)) {
            gameController.printGameBoard(game);
            gameController.makeMove(game);
        }

        gameController.printGameBoard(game);
    }
}
