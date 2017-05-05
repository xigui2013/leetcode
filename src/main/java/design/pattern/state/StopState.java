package design.pattern.state;

/**
 * Created by wjw on 4/23/17.
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop state";
    }
}
