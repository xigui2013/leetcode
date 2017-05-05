package design.pattern.Observer;

/**
 * Created by wjw on 4/23/17.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binay String" +
                Integer.toBinaryString(subject.getState()));
    }
}
