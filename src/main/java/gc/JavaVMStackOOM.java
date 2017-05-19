package gc;

/**
 * leetcode
 * Created by wjw on 18/05/2017.
 * VM Args:-Xss2048m
 * -Xss 设置每个线程堆大小
 */
public class JavaVMStackOOM {
    private void dontStop(){
        while (true){
        }
    }
    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM javaVMStackOOM = new JavaVMStackOOM();
        javaVMStackOOM.stackLeakByThread();
    }
}

