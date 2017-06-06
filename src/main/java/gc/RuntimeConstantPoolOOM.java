package gc;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode
 * Created by wjw on 27/05/2017.
 * VM Args：-XX：PermSize=10M -XX：MaxPermSize=10M
 * PermSize和MaxPermSize限制永久带(常量区)的大小，对1.7JDK无用，1.7之后常量区不在永久代
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        //使用List保持着常量池引用，避免Full GC回收常量池行为
        List<String> list = new ArrayList<String>();
        //10MB的PermSize在integer范围内足够产生OOM了
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}