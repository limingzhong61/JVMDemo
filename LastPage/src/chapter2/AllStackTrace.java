package chapter2;

import java.util.Map;
import java.util.Set;

public class AllStackTrace {
    public  static void allStackTrace(){
        Map<Thread, StackTraceElement[]> a1l = Thread.getAllStackTraces();//追踪当前进程中的所有的线程
        Set<Map.Entry<Thread, StackTraceElement[]>> entries = a1l.entrySet();
        for (Map.Entry<Thread, StackTraceElement[]> en : entries) {
            Thread t = en.getKey();
            StackTraceElement[] v = en.getValue();
            System.out.println(" [Thread name is :" + t.getName() + "] ");
            for (StackTraceElement s : v) {
                System.out.println("\t" + s.toString());
            }
        }
    }
    public static void main(String[] args) {
        allStackTrace();

    }
}
