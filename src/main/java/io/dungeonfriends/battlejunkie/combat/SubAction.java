package io.dungeonfriends.battlejunkie.combat;

import java.util.List;

/**
 * Action that takes place within a top-level action in the turn model.
 */
public class SubAction implements Action {

    @Override
    public Object getTarget() {
        return null;
    }

    @Override
    public List<SubAction> getSubActions() {
        return null;
    }

    @Override
    public void execute() {

    }
}
