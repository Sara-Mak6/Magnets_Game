import Algorithms.BFS;
import Algorithms.DFS;
import Algorithms.UserPlay;
import Levels.GameLevels;
import Structure.Models.GameModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameModel level;
        int movement = 0;

        System.out.println("1-UserPlay ");
        System.out.println("2-BFS");
        System.out.println("3-DFS");

        int playMethod = new Scanner(System.in).nextInt();

        System.out.println("Choose Level from ( 1 to 25 ):");

        int option = new Scanner(System.in).nextInt();

        switch (option) {
            case 1: {
                level = GameLevels.level1();
                movement = 5;
            }
            break;
            case 2: {
                level = GameLevels.level2();
                movement = 5;
            }
            break;
            case 3: {
                level = GameLevels.level3();
                movement = 5;
            }
            break;
            case 4: {
                level = GameLevels.level4();
                movement = 2;
            }
            break;
            case 5: {
                level = GameLevels.level5();
                movement = 2;
            }
            break;
            case 6: {
                level = GameLevels.level6();
                movement = 2;
            }
            break;
            case 7: {
                level = GameLevels.level7();
                movement = 2;
            }
            break;
            case 8: {
                level = GameLevels.level8();
                movement = 2;
            }
            break;
            case 9: {
                level = GameLevels.level9();
                movement = 2;
            }
            break;
            case 10: {
                level = GameLevels.level10();
                movement = 2;
            }
            break;
            case 11: {
                level = GameLevels.level11();
                movement = 2;
            }
            break;
            case 12: {
                level = GameLevels.level12();
                movement = 1;
            }
            break;
            case 13: {
                level = GameLevels.level13();
                movement = 2;
            }
            break;
            case 14: {
                level = GameLevels.level14();
                movement = 2;
            }
            break;
            case 15: {
                level = GameLevels.level15();
                movement = 2;
            }
            break;
            case 16: {
                level = GameLevels.level16();
                movement = 3;
            }
            break;
            case 17: {
                level = GameLevels.level17();
                movement = 2;
            }
            break;
            case 18: {
                level = GameLevels.level18();
                movement = 2;
            }
            break;
            case 19: {
                level = GameLevels.level19();
                movement = 4;
            }
            break;
            case 20: {
                level = GameLevels.level20();
                movement = 2;
            }
            break;
            case 21: {
                level = GameLevels.level21();
                movement = 2;
            }
            break;
            case 22: {
                level = GameLevels.level22();
                movement = 3;
            }
            break;
            case 23: {
                level = GameLevels.level23();
                movement = 3;
            }
            break;
            case 24: {
                level = GameLevels.level24();
                movement = 3;
            }
            break;
            case 25: {
                level = GameLevels.level25();
                movement = 3;
            }
            break;
            default:
                System.out.println("Invalid level selection , Starting with default level 1");
                level = GameLevels.level1();
                movement = 5;
        }

        if (playMethod == 1) {
            UserPlay userPlay = new UserPlay(level, movement);
        } else if (playMethod == 2) {
            BFS bfs = new BFS(level);
        } else if (playMethod == 3) {
            DFS dfs = new DFS(level);
        }else{
            System.out.println("invalid input! ... Start with default playMethod");
        }

    }
}
