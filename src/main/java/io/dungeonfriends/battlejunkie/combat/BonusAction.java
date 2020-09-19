package io.dungeonfriends.battlejunkie.combat;

import java.util.List;

/**
 * A bonus action in the traditional turn model.
 */
public class BonusAction implements Action {


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
