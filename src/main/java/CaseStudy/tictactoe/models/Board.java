package CaseStudy.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> cells;

    public Board(int dimension) {
        this.dimension = dimension;
        this.cells = initializeCells(dimension);
    }

    private List<List<Cell>> initializeCells(int dimension) {
        List<List<Cell>> cells = new ArrayList<>();
        for(int i = 0; i < dimension; i++) {
            List<Cell> row = new ArrayList<>();
            for(int j = 0; j < dimension; j++) {
                row.add(new Cell(i, j));
            }
            cells.add(row);
        }
        return cells;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }
}
