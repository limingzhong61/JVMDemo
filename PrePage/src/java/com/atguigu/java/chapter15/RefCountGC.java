package com.atguigu.java.chapter15;

/**
 * -XX:+PrintGCDetails
 *
 * 引用计数算法测试
 * 证明: java 使用的不是引用计数算法
 */
public class RefCountGC {
    // 这个成员属性的唯一作用就是占用一点内存
    private byte[] bigSize = new byte[5 * 1024 * 1024]; // 5MB
    // 引用
    Object reference = null;

    public static void main(String[] args) {
        RefCountGC obj1 = new RefCountGC();
        RefCountGC obj2 = new RefCountGC();
        obj1.reference = obj2;
        obj2.reference = obj1;
        obj1 = null;
        obj2 = null;
        // 显示的执行垃圾收集行为，判断obj1 和 obj2是否被回收？
        //System.gc();
    }
}

