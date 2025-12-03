package CaseStudy.tictactoe;

import CaseStudy.tictactoe.controllers.GameController;
import CaseStudy.tictactoe.exceptions.InvalidMoveException;
import CaseStudy.tictactoe.models.*;

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
                new Player("ABC",
                        new Symbol("O"),
                        PlayerType.HUMAN));

        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension, players);

        while (game.getGameState().equals(GameState.IN_PROGRESS)) {
            gameController.printGameBoard(game);
            gameController.makeMove(game);
        }
    }
}
