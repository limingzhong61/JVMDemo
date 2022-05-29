package com.atguigu.java.chapter16;

/**
 * System.gc()
 *
 * @author:
 * @create: 2020-07-12-19:07
 */
public class SystemGCTest {
    public static void main(String[] args) {
        new SystemGCTest();
        // 提醒JVM进行垃圾回收，但是不确定是否马上执行gc
        System.gc();
//        System.runFinalization();     //强制调用使用引用的对象的finalize()方法
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SystemGCTest 执行了 finalize方法");
    }
}
