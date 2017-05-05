package design.pattern.state;

/**
 * Created by wjw on 4/23/17.
 */
public class StartState implements State{
    public void doAction(Context context) {
        System.out.println("Player is start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start state";
    }
}
