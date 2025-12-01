package CaseStudy.tictactoe.models;

import java.util.Scanner;

public class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name, Symbol symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move makeMove(Board board) {
        // Logic for making a move based on player type
        System.out.println("Player " + name + " is making a move.");
        System.out.println("Please enter row index:");
        int row = scanner.nextInt();
        System.out.println("Please enter column index:");
        int col = scanner.nextInt();
        return new Move(new Cell(row, col), this);
    }
}
