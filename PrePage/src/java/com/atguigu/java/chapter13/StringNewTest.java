package com.atguigu.java.chapter13;

/**
 * new String("ab") 会创建几个对象？ 看字节码就知道是2个对象
 *- 一个对象是：new关键字在堆空间中创建
 * - 另一个对象：字符串常量池中的对象 字节码指令：ldc
 * 思考:
 * new
 * String("a") + new String("b")呢?
 * 对象1: new StringBuilder()
 * 对象2:
 * new String("a")
 * 对象3:
 * 常量池中的"a”
 * 对象4: new String("b")
 * 对象5:常量池中的"b"
 * 深入剖析: StringBuilder的toString():
 * 对象6:new String("ab")
 */
public class StringNewTest {
    public static void main(String[] args) {
        //String str = new String("ab");
        String str = new String("a") + new String("b");
    }
}
