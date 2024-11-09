package Algorithms;

import Structure.Actions.GridActions;
import Structure.Models.GameModel;
import Structure.Models.State;
import java.util.LinkedList;
import java.util.Queue;

public class BFS extends BaseLogic {

    private Queue<State> queueStates = new LinkedList<>();

    State SolveBFS(State state) {

        queueStates.add(state);

        if (GridActions.isFinal(state.getValue())) return state;

        while (!queueStates.isEmpty()) {

            State node = queueStates.poll();

            visitedList.add(node.getValue());

            for (GameModel child : GridActions.GetNextStates(node.getValue())) {
                if (!isVisited(child)) {
                    State state1 = new State(node, child);
                    if (!GridActions.isFinal(child)) queueStates.add(state1);
                    else return state1;
                }
            }
        }
        return null;
    }

    public BFS(GameModel game) {

        System.out.println("Solving ...");

        State sol = SolveBFS(new State(null, game));

        this.Play(sol);
    }
}
