package Algorithms;

import Structure.Actions.GridActions;
import Structure.Models.GameModel;
import Structure.Models.State;

import java.util.Stack;

public class DFS extends BaseLogic {

    private Stack<State> stackStates = new Stack<State>();

    State SolveDFS(State state) {

        stackStates.push(state);

        while (!stackStates.isEmpty() ) {
            State node = stackStates.pop();
            visitedList.add(node.getValue());

            if (GridActions.isFinal(node.getValue())) {
                return node;
            }

//            System.out.println("the node is : ");
//            GridActions.printGrid(node.getValue());
//            System.out.println("visited is : " + isVisited(node.getValue()));
//            System.out.println("and it is children is : ");
//            for (GameModel g : GridActions.GetNextStates(node.getValue())) {
//                GridActions.printGrid(g);
//                System.out.println("visited is : " + isVisited(g));
//
//            }

            for (GameModel child : GridActions.GetNextStates(node.getValue())) {
                if (!isVisited(child)) {
                    stackStates.push(new State(node, child));
                }
            }
//            System.out.println("the stack size is " + stackStates.size());
//            System.out.println("the visited size is " + visitedList.size());
//            System.out.println("the visited list is :");
//            for(GameModel g : visitedList)
//                GridActions.printGrid(g);
        }
        return null;
    }


    public DFS(GameModel game) {

        System.out.println("Solving ...");

        State sol = SolveDFS(new State(null, game));

        this.Play(sol);
    }
}