package chapter4;

import java.util.ArrayList;

/**
 * -Xms100m -Xmx100m -XX:+HeapDumpBeforeFullGC -XX:HeapDumpPath=D:\Users\Lenovo\Desktop\heapdumpinstance.prof
 * -XX:+HeapDumpOnOutOfMemoryError
 * -XX:+HeapDumpBeforeFullGC
 * -XX:HeapDumpPath=D:\Users\Lenovo\Desktop\heapdumpinstance.prof
 */
public class HeapDumpInstance {
    private static int _1MB = 1024 * 1024;
    byte[] buffer = new byte[10 * _1MB];

    public static void main(String[] args) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayList<HeapDumpInstance> list = new ArrayList<HeapDumpInstance>();
        for (int i = 0; i < 59; i++) {
            list.add(new HeapDumpInstance());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
