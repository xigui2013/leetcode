package design.pattern.state;

/**
 * Created by wjw on 4/23/17.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
