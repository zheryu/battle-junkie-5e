package io.dungeonfriends.battlejunkie.combat;

import java.util.List;

/**
 * an action that can be taken during a turn.
 */
public interface Action {

    Object getTarget();

//    /**
//     * Gets the set of actions that this action is allowed to operate under. For instance, a melee attack is only allowed
//     *
//     * @return a {@link List} of {@link Action}s that this Action is allowed to operate under
//     */
//    List<Action> validParentActions();

    List<SubAction> getSubActions();

    void execute();
}
