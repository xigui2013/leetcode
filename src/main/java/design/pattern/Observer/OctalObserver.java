package design.pattern.Observer;

/**
 * Created by wjw on 4/23/17.
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String:" +
                Integer.toOctalString(subject.getState()));
    }
}
