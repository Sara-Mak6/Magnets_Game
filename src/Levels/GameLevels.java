package Levels;

import Structure.Models.GameModel;
import Structure.Models.Position;

import java.util.ArrayList;
import java.util.List;

public class GameLevels {

    // G ==> gray cell
    // P ==> purple cell
    // R ==> red cell
    // space ==> wall

    public static GameModel level1() {

        char[][] grid = {
                {'.', '.', '.', '.'},
                {'.', '.', 'G', '.'},
                {'P', '.', '.', '.'},
        };

        int white_cells = 2;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(1, 1));
        white_position.add(new Position(1, 3));

        return new GameModel(3, 4, grid, white_cells, white_position);
    }

//    public static GameModel level1() {
//
//        char[][] grid = {
//                {'.', 'P'},
//                {'.', '.'},
//                {'R', '.'},
//        };
//
//        int white_cells = 1;
//
//        // Define the white cell positions
//        List<Position> white_position = new ArrayList<>();
//        white_position.add(new Position(0, 0));
//        white_position.add(new Position(2, 1));
//
//
//        return new GameModel(3, 2, grid, white_cells, white_position);
//    }

    public static GameModel level2() {

        char[][] grid = {
                {'.', '.', '.', '.', '.'},
                {'.', '.', 'G', '.', '.'},
                {'.', 'G', '.', 'G', '.'},
                {'.', '.', 'G', '.', '.'},
                {'P', '.', '.', '.', '.'},
        };

        int white_cells = 5;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 2));
        white_position.add(new Position(2, 0));
        white_position.add(new Position(2, 2));
        white_position.add(new Position(2, 4));
        white_position.add(new Position(4, 2));

        return new GameModel(5, 5, grid, white_cells, white_position);
    }

    public static GameModel level3() {

        char[][] grid = {
                {' ', ' ', ' ', '.'},
                {'.', 'P', '.', 'G'},
                {'.', '.', '.', '.'},
        };

        int white_cells = 2;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 3));
        white_position.add(new Position(2, 3));

        return new GameModel(3, 4, grid, white_cells, white_position);
    }

    public static GameModel level4() {

        char[][] grid = {
                {'.', '.', '.'},
                {' ', 'G', '.'},
                {'P', '.', '.'},
                {' ', 'G', '.'},
                {'.', '.', '.'},
        };

        int white_cells = 3;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 0));
        white_position.add(new Position(0, 2));
        white_position.add(new Position(4, 1));

        return new GameModel(5, 3, grid, white_cells, white_position);
    }

    public static GameModel level5() {

        char[][] grid = {
                {'.', ' ', '.'},
                {'G', ' ', 'G'},
                {'G', ' ', 'G'},
                {'.', 'P', '.'},
        };

        int white_cells = 5;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 0));
        white_position.add(new Position(0, 2));
        white_position.add(new Position(1, 0));
        white_position.add(new Position(1, 2));
        white_position.add(new Position(3, 0));

        return new GameModel(4, 3, grid, white_cells, white_position);
    }

    public static GameModel level6() {

        char[][] grid = {
                {'.', '.', '.', '.', '.'},
                {'.', 'G', '.', 'G', '.'},
                {'P', '.', '.', '.', '.'},
        };

        int white_cells = 3;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 3));
        white_position.add(new Position(1, 2));
        white_position.add(new Position(2, 3));

        return new GameModel(3, 5, grid, white_cells, white_position);
    }

    public static GameModel level7() {

        char[][] grid = {
                {'.', '.', '.', '.'},
                {'G', '.', '.', '.'},
                {'G', 'P', '.', '.'},
                {'.', 'G', 'G', '.'},
                {' ', ' ', ' ', '.'},
        };

        int white_cells = 3;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 0));
        white_position.add(new Position(4, 3));
        white_position.add(new Position(2, 3));

        return new GameModel(5, 4, grid, white_cells, white_position);
    }

    public static GameModel level8() {

        char[][] grid = {
                {'.', '.', '.', '.'},
                {'.', 'G', 'G', '.'},
                {'P', '.', '.', '.'},
        };

        int white_cells = 3;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 0));
        white_position.add(new Position(0, 2));
        white_position.add(new Position(2, 2));

        return new GameModel(3, 4, grid, white_cells, white_position);
    }

    public static GameModel level9() {

        char[][] grid = {
                {'P', '.', '.', 'G', '.', 'G', '.'},
        };

        int white_cells = 3;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 1));
        white_position.add(new Position(0, 3));
        white_position.add(new Position(0, 6));

        return new GameModel(1, 7, grid, white_cells, white_position);
    }

    public static GameModel level10() {

        char[][] grid = {
                {'P' , '.' , '.' , '.' },
                {'.' , '.' , '.' , '.' },
                {'.' , '.' , 'G' , 'G' },
                {'.' , 'G' , '.' , '.' },
        };

        int white_cells = 4;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(1, 1));
        white_position.add(new Position(1, 3));
        white_position.add(new Position(3, 0));
        white_position.add(new Position(3, 3));

        return new GameModel(4, 4, grid, white_cells, white_position);
    }

    public static GameModel level11() {

        char[][] grid = {
                {'G' , '.' , '.' , '.' , 'G' },
                {' ' , ' ' , 'R' , ' ' , ' ' },
        };

        int white_cells = 3;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 1));
        white_position.add(new Position(0, 2));
        white_position.add(new Position(0, 3));

        return new GameModel(2 , 5, grid, white_cells, white_position);
    }

    public static GameModel level12() {

        char[][] grid = {
                {'G' , '.' , ' ' , ' ' },
                {'G' , '.' , ' ' , ' ' },
                {'.' , '.' , '.' , '.' },
                {'.' , 'R' , '.' , '.' },
                {'.' , '.' , '.' , 'G' },
        };

        int white_cells = 4;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(1, 0));
        white_position.add(new Position(2, 0));
        white_position.add(new Position(4, 0));
        white_position.add(new Position(4, 2));

        return new GameModel(5 , 4, grid, white_cells, white_position);
    }

    public static GameModel level13() {

        char[][] grid = {
                {'G' , '.' , '.' , '.' , 'G' , 'G'},
                {' ' , '.' , '.' , '.' , ' ' , ' '},
                {' ' , '.' , '.' , 'R' , ' ' , ' '},
        };

        int white_cells = 4;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 3));
        white_position.add(new Position(0, 4));
        white_position.add(new Position(1, 1));
        white_position.add(new Position(2, 1));

        return new GameModel(3 , 6, grid, white_cells, white_position);
    }

    public static GameModel level14() {

        char[][] grid = {
                {'.' , '.' , '.' , 'G' },
                {'.' , '.' , '.' , '.' },
                {'G' , '.' , '.' , '.' },
                {'G' , '.' , '.' , 'R' },
        };

        int white_cells = 4;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(2, 1));
        white_position.add(new Position(2, 2));
        white_position.add(new Position(1, 0));
        white_position.add(new Position(1, 2));

        return new GameModel(4 , 4, grid, white_cells, white_position);
    }

    public static GameModel level15() {

        char[][] grid = {
                {'.' , 'G' , '.' , 'G' , '.' },
                {'.' , '.' , 'P' , '.' , '.' },
                {'.' , '.' , 'R' , '.' , '.' },
        };

        int white_cells = 4;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 0));
        white_position.add(new Position(0, 2));
        white_position.add(new Position(1, 4));
        white_position.add(new Position(2, 4));

        return new GameModel(3 , 5, grid, white_cells, white_position);
    }

    public static GameModel level16() {

        char[][] grid = {
                {'.' , '.' , '.' , '.' , '.' },
                {'.' , '.' , 'G' , '.' , '.' },
                {'R' , '.' , '.' , '.' , 'P' },
                {'.' , '.' , 'G' , '.' , '.' },
                {'.' , '.' , '.' , '.' , '.' },
        };

        int white_cells = 4;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 3));
        white_position.add(new Position(0, 4));
        white_position.add(new Position(4, 0));
        white_position.add(new Position(4, 3));

        return new GameModel(5 , 5, grid, white_cells, white_position);
    }

    public static GameModel level17() {

        char[][] grid = {
                {'R' , '.' , 'G' , '.' },
                {'.' , '.' , '.' , '.' },
                {'G' , '.' , '.' , '.' },
                {'.' , '.' , '.' , 'P' },
        };

        int white_cells = 4;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(1, 1));
        white_position.add(new Position(1, 3));
        white_position.add(new Position(2, 2));
        white_position.add(new Position(3, 1));

        return new GameModel(4 , 4, grid, white_cells, white_position);
    }

    public static GameModel level18() {

        char[][] grid = {
                {' ' , ' ' , '.' , 'G' , ' ' , ' '},
                {' ' , ' ' , '.' , '.' , ' ' , ' '},
                {'G' , '.' , '.' , '.' , '.' , 'G'},
                {'.' , '.' , '.' , '.' , '.' , '.'},
                {' ' , ' ' , 'R' , 'P' , ' ' , ' '},
        };

        int white_cells = 4;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(1, 3));
        white_position.add(new Position(2, 1));
        white_position.add(new Position(2, 2));
        white_position.add(new Position(2, 3));

        return new GameModel(5 , 6, grid, white_cells, white_position);
    }

    public static GameModel level19() {

        char[][] grid = {
                {' ' , 'G' , 'P' , 'G' , ' ' },
                {'.' , '.' , '.' , '.' , '.' },
                {' ' , '.' , 'R' , '.' , ' ' },
                {'.' , '.' , '.' , '.' , '.' },
                {' ' , 'G' , '.' , 'G' , ' ' },
        };

        int white_cells = 6;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(1, 0));
        white_position.add(new Position(1, 4));
        white_position.add(new Position(2, 1));
        white_position.add(new Position(3, 0));
        white_position.add(new Position(3, 2));
        white_position.add(new Position(3, 4));

        return new GameModel(5 , 5, grid, white_cells, white_position);
    }

    public static GameModel level20() {

        char[][] grid = {
                {'.' , 'G' , 'G' , '.' },
                {'.' , '.' , '.' , '.' },
                {'.' , '.' , '.' , '.' },
                {'.' , '.' , '.' , '.' },
                {'G' , '.' , 'P' , 'R' },
        };

        int white_cells = 5;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 1));
        white_position.add(new Position(0, 3));
        white_position.add(new Position(1, 0));
        white_position.add(new Position(2, 0));
        white_position.add(new Position(3, 0));

        return new GameModel(5 , 4, grid, white_cells, white_position);
    }

    public static GameModel level21() {

        char[][] grid = {
                {'.', 'G', '.', '.'},
                {'.', 'G', 'G', '.'},
                {'P', '.', '.', 'R'}
        };

        int white_cells = 5;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 2));
        white_position.add(new Position(1, 0));
        white_position.add(new Position(1, 1));
        white_position.add(new Position(2, 0));
        white_position.add(new Position(2, 1));

        return new GameModel(3 , 4, grid, white_cells, white_position);
    }

    public static GameModel level22() {

        char[][] grid = {
                {'P', '.', ' ', 'G' , 'G'},
                {'.', '.', ' ', '.' , '.'},
                {'.', '.', '.', '.' , '.'},
                {'G', '.', 'R', '.' , ' '},
        };

        int white_cells = 5;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 1));
        white_position.add(new Position(0, 3));
        white_position.add(new Position(1, 0));
        white_position.add(new Position(1, 4));
        white_position.add(new Position(2, 1));

        return new GameModel(4 , 5, grid, white_cells, white_position);
    }

    public static GameModel level23() {

        char[][] grid = {
                {'.', '.', '.', 'G' , '.'},
                {'.', '.', '.', '.' , 'G'},
                {'G', '.', '.', '.' , '.'},
                {'.', '.', 'R', '.' , 'P'},
        };

        int white_cells = 5;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 2));
        white_position.add(new Position(2, 1));
        white_position.add(new Position(2, 2));
        white_position.add(new Position(2, 3));
        white_position.add(new Position(3, 2));

        return new GameModel(4 , 5, grid, white_cells, white_position);
    }

    public static GameModel level24() {

        char[][] grid = {
                {'.', 'G', '.', '.' , '.'},
                {'.', '.', '.', 'G' , 'P'},
                {'.', '.', '.', '.' , '.'},
                {'R', '.', '.', '.' , 'G'},
                {' ', '.', '.', '.' , ' '},
        };

        int white_cells = 5;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 3));
        white_position.add(new Position(2, 1));
        white_position.add(new Position(2, 3));
        white_position.add(new Position(4, 1));
        white_position.add(new Position(4, 2));

        return new GameModel(5 , 5, grid, white_cells, white_position);
    }

    public static GameModel level25() {

        char[][] grid = {
                {'G', '.', '.' , 'R'},
                {'.', '.', 'G' , '.'},
                {'.', '.', '.' , '.'},
                {'.', '.', 'G' , '.'},
                {'P', '.', '.' , 'G'},
        };

        int white_cells = 5;

        // Define the white cell positions
        List<Position> white_position = new ArrayList<>();
        white_position.add(new Position(0, 0));
        white_position.add(new Position(2, 0));
        white_position.add(new Position(4, 0));
        white_position.add(new Position(4, 1));
        white_position.add(new Position(4, 2));


        return new GameModel(5 , 4, grid, white_cells, white_position);
    }

}
