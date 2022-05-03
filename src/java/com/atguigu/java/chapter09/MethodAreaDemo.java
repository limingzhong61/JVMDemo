package com.atguigu.java.chapter09;

/**
 * 测试设置方法区大小参数的默认值
 * <p>
 * jdk7及 以前:
 * - XX:Permsize= 100m - XX:MaxPermsize=100mT
 * <p>
 * <p>
 * jdk8及以后:
 * <p>
 * - XX:MetaspaceSize=100m -XX :MaxMetaspaceSize=100m
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

