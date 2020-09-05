package combat;

import java.util.List;

/**
 * an action that can be taken during a turn.
 */
public interface Action {

    Object getTarget();

    List<SubAction> getSubActions();

    void execute();
}
