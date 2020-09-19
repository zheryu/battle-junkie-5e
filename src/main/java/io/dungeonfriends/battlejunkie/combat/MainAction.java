package io.dungeonfriends.battlejunkie.combat;

import java.util.List;

/**
 * A top-level bonus action in the traditional turn model.
 */
public class MainAction implements Action {

    private final List<SubAction> subActions;

    public MainAction(List<SubAction> subActions) {
        this.subActions = subActions;
    }

    @Override
    public Object getTarget() {
        return null;
    }

    @Override
    public List<SubAction> getSubActions() {
        return subActions;
    }

    @Override
    public void execute() {

    }
}
