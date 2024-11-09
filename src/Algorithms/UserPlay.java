package Algorithms;

import Structure.Actions.GridActions;
import Structure.Models.GameModel;

import java.util.Scanner;

public class UserPlay {

    private GameModel gameModel;
    private int movement;
    Scanner scanner = new Scanner(System.in);

    public UserPlay(GameModel gameModel, int movement) {
        this.gameModel = gameModel;
        this.movement = movement;
        this.play();
    }

    private void play() {

        boolean won=false;

        while (movement > 0) {

            GridActions.printGrid(gameModel);

            System.out.println("Enter the position of the piece you want to move it :");
            System.out.println("x :");
            int x1 = scanner.nextInt();
            System.out.println("y :");
            int y1 = scanner.nextInt();

            System.out.println("Enter the new position :");
            System.out.println("x :");
            int x2 = scanner.nextInt();
            System.out.println("y :");
            int y2 = scanner.nextInt();

            boolean can_move = GridActions.CheckMove(x1, y1, x2, y2, gameModel);

            if (can_move) {
                movement--;
                GridActions.Move(x1, y1, x2, y2, gameModel);
                won = GridActions.isFinal(gameModel);
                if(won){
                    GridActions.printGrid(gameModel);
                    break;
                }
            } else {
                System.out.println("something went wrong!! please try again ");
            }

        }
        if(won){
            System.out.println("YOU WON !!!");
        }
        else{
            System.out.println("GAME OVER ...");
        }
    }

}
