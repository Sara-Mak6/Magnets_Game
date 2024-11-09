package Structure.Actions;

import Structure.Models.GameModel;
import Structure.Models.Position;
import java.util.ArrayList;
import java.util.List;

public class GridActions {

    public static void printGrid(GameModel game) {
        char[][] grid = game.getBoard();
        int rows = game.getRow_boundary();
        int cols = game.getColumn_boundary();
        List<Position> whiteCells = game.getWhite_position();

        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print("          ");
            for (int j = 0; j < cols; j++) {
                Position currentPosition = new Position(i, j);
                if (whiteCells.contains(currentPosition)) {
                    System.out.print("|" + grid[i][j] + "| ");
                } else {
                    System.out.print(" " + grid[i][j] + "  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isFinal(GameModel game) {
        char[][] grid = game.getBoard();
        List<Position> whiteCells = game.getWhite_position();
        boolean fin = true;
        for (Position pos : whiteCells) {
            char cell = grid[pos.getRow_index()][pos.getColumn_index()];
            if (cell != 'R' && cell != 'P' && cell != 'G') {
                fin = false;
                break;
            }
        }
        return fin;
    }

    public static boolean CheckMove(int x1, int y1, int x2, int y2, GameModel game) {
        int rows = game.getRow_boundary();
        int cols = game.getColumn_boundary();
        char[][] grid = game.getBoard();
        if ((grid[x1][y1] == 'R') || (grid[x1][y1] == 'P') && (x2 < rows && y2 < cols && grid[x2][y2] == '.')) {
            return true;
        } else
            return false;

    }

    public static void Move(int x1, int y1, int x2, int y2, GameModel game) {
        int rows = game.getRow_boundary();
        int cols = game.getColumn_boundary();
        char[][] grid = game.getBoard();
        if (grid[x1][y1] == 'R') {
            //move the red pice
            grid[x2][y2] = 'R';
            grid[x1][y1] = '.';

            moveRCells(x2, y2, game);

        } else if (grid[x1][y1] == 'P') {
            //move the purple pice
            grid[x2][y2] = 'P';
            grid[x1][y1] = '.';

            movePCells(x2, y2, game);

        }
    }

    public static void moveRCells(int x, int y, GameModel game) {
        int rows = game.getRow_boundary();
        int cols = game.getColumn_boundary();
        char[][] grid = game.getBoard();

        // row right shift
        for (int i = y - 2; i >= 0; i--) {
            if ((grid[x][i] != '.') && (grid[x][i] != ' ') && (grid[x][i + 1] == '.')) {
                grid[x][i + 1] = grid[x][i];
                grid[x][i] = '.';
//                printGrid(game);
            }
        }

        // row left shift
        for (int i = y + 2; i < cols; i++) {
            if ((grid[x][i] != '.') && (grid[x][i] != ' ') && (grid[x][i - 1] == '.')) {
                grid[x][i - 1] = grid[x][i];
                grid[x][i] = '.';
            }
        }

        // col up shift
        for (int i = x + 2; i < rows; i++) {
            if (((grid[i][y] != '.') && (grid[i][y] != ' ')) && (grid[i - 1][y] == '.')) {
                System.out.println(i + "the grid is " + grid[i][y]);
                grid[i - 1][y] = grid[i][y];
                grid[i][y] = '.';
            }
        }

        // col down shift
        for (int i = x - 2; i >= 0; i--) {
            if ((grid[i][y] != '.') && (grid[i][y] != ' ') && (grid[i + 1][y] == '.')) {
                grid[i + 1][y] = grid[i][y];
                grid[i][y] = '.';
//                printGrid(game);
            }
        }

    }

    public static void movePCells(int x, int y, GameModel game) {
        moveCol(x, y, game);
        moveRow(x, y, game);
    }

    public static void moveCol(int x, int y, GameModel game) {

        char[][] grid = game.getBoard();
        int rowBoundary = game.getRow_boundary();

        // col up shift
        int i = x - 1, startUp = -1;
        for (; i >= 0; i--) {
            if (grid[i][y] == 'R' || grid[i][y] == 'G' || grid[i][y] == 'P') {
                startUp = i;
                while (i >= 0 && grid[i][y] != '.') {
                    i--;
                }
                break;
            }
        }
        //start = -1  ==>  there is not any cells
        // i = -1  ==> there is not space to move the cells
        if (startUp != -1 && i != -1) {
            for (int j = i; j < startUp; j++) {
                if ((grid[j + 1][y] == 'G' || grid[j + 1][y] == 'R' || grid[j + 1][y] == 'P') && grid[j][y] == '.') {
                    char temp = grid[j][y];
                    grid[j][y] = grid[j + 1][y];
                    grid[j + 1][y] = temp;
                }
            }
        }


        // col down shift
        int j = x + 1, startDown = -1;
        for (; j < rowBoundary; j++) {
            if (grid[j][y] == 'R' || grid[j][y] == 'G' || grid[j][y] == 'P') {
                startDown = j;
                while (j < rowBoundary && grid[j][y] != '.') {
                    j++;
                }
                break;
            }
        }
        //start = -1  ==>  there is not any cells
        // j = -1  ==> there is not space to move the cells
        if (startDown != -1 && j != rowBoundary) {
            for (int k = j; j > startDown; j--) {
                if ((grid[j - 1][y] == 'G' || grid[j - 1][y] == 'R' || grid[j - 1][y] == 'P') && grid[j][y] == '.') {
                    char temp = grid[j][y];
                    grid[j][y] = grid[j - 1][y];
                    grid[j - 1][y] = temp;
                }
            }
        }

    }

    public static void moveRow(int x, int y, GameModel game) {

        char[][] grid = game.getBoard();
        int colBoundary = game.getColumn_boundary();

        // Row left shift
        int i = y - 1, startLeft = -1;
        for (; i >= 0; i--) {
            if (grid[x][i] == 'R' || grid[x][i] == 'G' || grid[x][i] == 'P') {
                startLeft = i;
                while (i >= 0 && grid[x][i] != '.') {
                    i--;
                }
                break;
            }
        }
        //start = -1  ==>  there is not any cells
        // i = -1  ==> there is not space to move the cells
        if (startLeft != -1 && i != -1) {
            for (int j = i; j < startLeft; j++) {
                if ((grid[x][j + 1] == 'G' || grid[x][j + 1] == 'R' || grid[x][j + 1] == 'P') && grid[x][j] == '.') {
                    char temp = grid[x][j];
                    grid[x][j] = grid[x][j + 1];
                    grid[x][j + 1] = temp;
                }
            }
        }


        // Row right shift
        int j = y + 1, startRight = -1;
        for (; j < colBoundary; j++) {
            if (grid[x][j] == 'R' || grid[x][j] == 'G' || grid[x][j] == 'P') {
                startRight = j;
                while (j < colBoundary && grid[x][j] != '.') {
                    j++;
                }
                break;
            }
        }
        //start = -1  ==>  there is not any cells
        // j = -1  ==> there is not space to move the cells
        if (startRight != -1 && j != colBoundary) {
            for (; j > startRight; j--) {
                if ((grid[x][j - 1] == 'G' || grid[x][j - 1] == 'R' || grid[x][j - 1] == 'P') && grid[x][j] == '.') {
                    char temp = grid[x][j];
                    grid[x][j] = grid[x][j - 1];
                    grid[x][j - 1] = temp;
                }
            }
        }

    }

    public static boolean Equals(GameModel game1, GameModel game2) {
        return game1.equals(game2);
    }

    public static void CheckMoves(int x, int y, GameModel game, ArrayList<GameModel> nextStates) {

        int rows = game.getRow_boundary();
        int cols = game.getColumn_boundary();
        char[][] grid = game.getBoard();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                {
                    if (CheckMove(x, y, i, j, game)) {
                        GameModel newState = new GameModel(game);
                        Move(x, y, i, j, newState);
                        nextStates.add(newState);
                    }
                }
            }
    }

    public static ArrayList<GameModel> GetNextStates(GameModel game) {

        ArrayList<GameModel> nextStates = new ArrayList<>(); // Store States

        int rows = game.getRow_boundary();
        int cols = game.getColumn_boundary();
        char[][] board = game.getBoard();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                {
                    if (board[i][j] == 'P' || board[i][j] == 'R') {
                        CheckMoves(i, j, game, nextStates);
                    }
                }
            }

        return nextStates;
    }

}