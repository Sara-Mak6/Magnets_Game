package Algorithms;

import Structure.Actions.GridActions;
import Structure.Models.GameModel;
import Structure.Models.State;

import java.util.Stack;

public class DFS extends BaseLogic {

    private Stack<State> stackStates = new Stack<State>();

    State SolveDFS(State state) {

        stackStates.push(state);

//        int cnt= 10;
        while (!stackStates.isEmpty() ) {
//            cnt--;
            State node = stackStates.pop();
            visitedList.add(node.getValue());

            if (GridActions.isFinal(node.getValue())) {
                return node;
            }

            for (GameModel child : GridActions.GetNextStates(node.getValue())) {
                if (!isVisited(child)) {
                    stackStates.push(new State(node, child));
                }
            }
            System.out.println("the stack size is " + stackStates.size());
            System.out.println("the visited size is " + visitedList.size());
        }
        return null;
    }


    public DFS(GameModel game) {

        System.out.println("Solving ...");

        State sol = SolveDFS(new State(null, game));

        this.Play(sol);
    }
}