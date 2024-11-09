package Algorithms;

import Structure.Actions.GridActions;
import Structure.Models.GameModel;
import Structure.Models.State;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BaseLogic {

    Set<GameModel> visitedList = new HashSet<>();

    ArrayList<GameModel> solution = new ArrayList<>();


    public boolean isVisited(GameModel game) {
        for (GameModel g : visitedList) {
            if(GridActions.isGridEqual(game,g))
                return true;
        }
        return false;
    }

    protected void Play(State sol) {

        if (sol != null)
            System.out.println("------ << Successfully Solved >> -------");

        else
            System.out.println("NO SOLUTION FOUND");

        while (sol != null && sol.hasPrevious()) {
            solution.add(sol.getValue());
            sol = sol.getParent();
        }

        System.out.println();

        System.out.println("Visited Nodes Count: " + visitedList.size());
        System.out.println("Node Depth: " + solution.size());

        for (GameModel game : solution) {
            GridActions.printGrid(game);
        }
    }
}
