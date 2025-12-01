package CaseStudy.tictactoe.controllers;

import CaseStudy.tictactoe.models.Game;
import CaseStudy.tictactoe.models.Player;

import java.util.List;

public class GameController {
    //Starts a new game
    public Game startGame(int dimension, List<Player> players) {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }
}
