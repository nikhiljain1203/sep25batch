package CaseStudy.tictactoe.models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private int nextPlayerMoveIndex;
    private GameState gameState;
    private Player winner;

    public void makeMove() {
        Player currentPlayer = players.get(nextPlayerMoveIndex);
        Move move = currentPlayer.makeMove(board);
        if(!validateMove(move)) {
            throw new InvalidMoveException("Invalid Move made by player: " + currentPlayer.getName());
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Cell cell = board.getCells().get(row).get(col);
        cell.setCellState(CellState.OCCUPIED);

        moves.add(new Move(cell, currentPlayer));
        nextPlayerMoveIndex = (nextPlayerMoveIndex + 1) % players.size();

        //check winner
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
            return game;
        }
    }
}
