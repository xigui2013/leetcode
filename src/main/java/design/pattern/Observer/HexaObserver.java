package design.pattern.Observer;

/**
 * Created by wjw on 4/23/17.
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String :" +
                Integer.toHexString(this.subject.getState()));
    }
}
