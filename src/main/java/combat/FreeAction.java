package combat;

import java.util.List;

/**
 * a top-level action that falls out of the bonus action / main action / movement model.
 */
public class FreeAction implements Action {
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
