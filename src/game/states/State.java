package game.states;

import java.awt.Graphics;
import game.Handler;

public abstract class State {
    
    private static State currentState = null;
    protected Handler handler;
    
    public static void setState(State state) {
        currentState = state;
    }
    
    public static State getState() {
        return currentState;
    }
    
    public State(Handler handler) {
        this.handler = handler;
    }
    
    public abstract void tick();
    
    public abstract void render(Graphics g);
}
