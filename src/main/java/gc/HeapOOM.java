package gc;

import java.util.ArrayList;
import java.util.List;
/**
 * leetcode
 * Created by wjw on 14/05/2017.
 * VM args:-Xms20m-Xmx=20m-XX:HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    static class OOMObject{
    }
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
