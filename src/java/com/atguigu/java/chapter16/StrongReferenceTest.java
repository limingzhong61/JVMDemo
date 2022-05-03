package com.atguigu.java.chapter16;

/**
 * 强引用的测试
 */
public class StrongReferenceTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello, 尚硅谷");
        StringBuffer str1 = str;
        str = null;
        System.gc();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
