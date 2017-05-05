package design.pattern.Observer;

/**
 * Created by wjw on 4/23/17.
 */
public class ObserverPatternDemo {
    public static void main(String[] args){
        Subject subject = new Subject();

        new HexaObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);

        System.out.println("First state change 15");
        subject.setState(15);

        System.out.println("Seconde stage change 10");
        subject.setState(10);
    }

}
