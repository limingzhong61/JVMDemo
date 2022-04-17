package com.atguigu.java.chapter08;

/**
 * 标量替换测试
 * -Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:+EliminateAllocations
 */

public class ScalarReplace {
    static class User {
        public int id;
        public String name;
    }

    public static void alloc() {
        User u = new User();//未发生逃逸
        u.id = 5;
        u.name = "Www.atguigu.com";

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            alloc();


        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为:" + (end - start) + "ms");
    }
}
