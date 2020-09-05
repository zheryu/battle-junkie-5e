package combat;

import java.util.ArrayList;
import java.util.List;

public class TurnAssembler {

    private final Entity actor;

    private final List<Action> actions;

    public static TurnAssembler newInstance(Entity actor) {
        return new TurnAssembler(actor);
    }

    private TurnAssembler(Entity actor) {
        this.actor = actor;
        this.actions = new ArrayList<>();
    }

    public boolean canPerform(Action action) {
        return true;
    }

    public void addAction(Action action) {
        actions.add(action);
    }



}
