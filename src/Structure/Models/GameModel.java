package Structure.Models;
import java.util.ArrayList;
import java.util.List;

public class GameModel {
    private int row_boundary;
    private int column_boundary;
    private char[][] grid;
    private int white_cells;
    private List<Position> white_position;

    public GameModel(){}
    // Normal constructor
    public GameModel(int row_boundary, int column_boundary, char[][] grid, int white_cells, List<Position> white_position) {
        this.row_boundary = row_boundary;
        this.column_boundary = column_boundary;
        this.grid = new char[row_boundary][column_boundary];

        // Deep copy the grid array
        for (int i = 0; i < row_boundary; i++) {
            System.arraycopy(grid[i], 0, this.grid[i], 0, column_boundary);
        }

        this.white_cells = white_cells;

        // Deep copy the list of positions
        this.white_position = new ArrayList<>();
        for (Position pos : white_position) {
            this.white_position.add(new Position(pos));
        }
    }

    // Copy constructor
    public GameModel(GameModel gameModel) {
        this.row_boundary = gameModel.row_boundary;
        this.column_boundary = gameModel.column_boundary;
        this.white_cells = gameModel.white_cells;

        // Deep copy the grid array
        this.grid = new char[row_boundary][column_boundary];
        for (int i = 0; i < row_boundary; i++) {
            System.arraycopy(gameModel.grid[i], 0, this.grid[i], 0, column_boundary);
        }

        // Deep copy the list of positions
        this.white_position = new ArrayList<>();
        for (Position pos : gameModel.white_position) {
            this.white_position.add(new Position(pos));
        }
    }

    public int getRow_boundary() {
        return row_boundary;
    }

    public int getColumn_boundary() {
        return column_boundary;
    }

    public int getWhite_cells() {
        return white_cells;
    }

    public List<Position> getWhite_position() {
        return white_position;
    }

    public char[][] getBoard() {
        return grid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash();
    }
}
