package CaseStudy.tictactoe.models;

import CaseStudy.tictactoe.exceptions.InvalidMoveException;
import CaseStudy.tictactoe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private int nextPlayerMoveIndex;
    private GameState gameState;
    private Player winner;
    private List<WinningStrategy> winningStrategies;

    public void makeMove() throws InvalidMoveException {
        Player currentPlayer = players.get(nextPlayerMoveIndex);
        Move move = currentPlayer.makeMove(board);

        if(!validateMove(move)) {
            throw new InvalidMoveException("Invalid Move made by player: " + currentPlayer.getName());
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Cell cell = board.getCells().get(row).get(col);
        cell.setCellState(CellState.OCCUPIED);
        cell.setPlayer(currentPlayer);

        moves.add(new Move(cell, currentPlayer));
        nextPlayerMoveIndex = (nextPlayerMoveIndex + 1) % players.size();

        //check winner
        if(checkWinner(move)) {
            gameState = GameState.ENDED;
            winner = currentPlayer;
            System.out.println("Game won by player: " + currentPlayer.getName());
        } else if(moves.size() == board.getDimension() * board.getDimension()) {
            gameState = GameState.DRAW;
            winner = null; //draw
            System.out.println("Game is a draw!");
        }
    }
    private boolean checkWinner(Move move) {
        for(WinningStrategy winningStrategy: winningStrategies) {
            if(winningStrategy.checkWinner(board, move)) {
                return true;
            }
        }
        return false;
    }

    private boolean validateMove(Move move) {
        Player player= move.getPlayer();
        Cell cell = move.getCell();
        int row = cell.getRow();
        int col = cell.getCol();
        if(row < 0 || row >= board.getDimension()
                || col < 0 || col >= board.getDimension()) {
            return false;
        }
        //Add more validations like cell already occupied

        return true;
    }

    public void printBoard() {
        board.printBoard();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Game build() {
            //validations can be added here
            //duplicate player symbol check can be added here

            Game game = new Game();
            game.board = new Board(dimension);
            game.players = players;
            game.nextPlayerMoveIndex = 0;
            game.gameState = GameState.IN_PROGRESS;
            game.moves = new ArrayList<>();
            game.winningStrategies = winningStrategies;
            return game;
        }
    }
}
