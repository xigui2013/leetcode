package gc;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;

/**
 * leetcode
 * Created by wjw on 31/05/2017.
 * VM Args: -Xmx20M -XX:MaxDirectMemorySize=10M -XX:MaxPermSize=10M
 * MaxDirectMemorySize的大小默认同堆大小，堆默认-Xmx
 */
public class DirectMemoryOOM {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws Exception {
//        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
//        unsafeField.setAccessible(true);
//        Unsafe unsafe = (Unsafe) unsafeField.get(null);
//        while (true){
//            System.out.println("allocate");
//            unsafe.allocateMemory(_1MB);
//        }
        for (int i = 0; i < 100000; i++) {
            ByteBuffer.allocateDirect(_1MB);
            System.out.println("allocate");
        }
        System.out.println("Done");
    }
}
