package gc;

/**
 * leetcode
 * Created by wjw on 17/05/2017.
 *
 * VM Args:-Xss128k
 */
public class JavaVMStackSOF {
    private int stackLength = 1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable{
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        }catch (Throwable e){
            System.out.println("Stack length:" + javaVMStackSOF.stackLength);
            throw e;
        }
    }
}
