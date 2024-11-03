package Structure.Models;

public class Position {
    private int row_index;
    private int column_index;

    // default constructor
    public Position() {}

    public Position(int row, int column)
    {
        this.row_index = row;
        this.column_index = column;
    }

    // copy constructor
    public Position(Position position)
    {
        this.row_index = position.row_index;
        this.column_index = position.column_index;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Position position = (Position) obj;
        return row_index == position.row_index && column_index == position.column_index;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(row_index, column_index);
    }

    @Override
    public String toString() {
        return "(" + "row=" + row_index + ", column=" + column_index + ")";
    }

    public int getRow_index() {
        return row_index;
    }

    public void setRow_index(int row_index) {
        this.row_index = row_index;
    }

    public int getColumn_index() {
        return column_index;
    }

    public void setColumn_index(int column_index) {
        this.column_index = column_index;
    }
}
