package io.zheryc.combat;

import java.util.LinkedList;
import java.util.List;

public class Turn {

    private final List<String> availableActionTypes;

    private final List<Action> turnExecution;

    public Turn() {
        this.turnExecution = new LinkedList<>();
        this.availableActionTypes = new LinkedList<>();
    }

    public void executeTurn() {
        turnExecution.forEach(Action::execute);
    }

}