package Structure.Models;
import java.util.Comparator;
import java.util.Objects;

public class State {
    private  State parent;
    private GameModel value;
    private int cost = 1;


    public State(State parent, GameModel value)
    {
        this.parent = parent;
        this.value = value;
    }

    public State(State parent, GameModel value, int cost)
    {
        this.parent = parent;
        this.value = value;
        this.cost = cost;
    }

    public State() {}

    public boolean hasPrevious()
    {
        return this.parent != null;
    }

    public State getParent() {
        return parent;
    }

    public void setParent(State parent) {
        this.parent = parent;
    }

    public GameModel getValue() {
        return value;
    }

    public void setValue(GameModel value) {
        this.value = value;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        State state = (State) obj;
        return Objects.equals(value, state.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


}
