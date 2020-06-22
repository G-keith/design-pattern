package com.keith.pattern.state;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-22
 */
public class StateContext {

    public final static State OPENSTATE = new OpenState();
    public final static State CLOSESTATE = new CloseState();
    private State currentState = CLOSESTATE;
    public void open() {
        this.currentState.open();
        this.currentState = OPENSTATE;
    }
    public void close() {
        this.currentState.close();
        this.currentState = CLOSESTATE;
    }
}
