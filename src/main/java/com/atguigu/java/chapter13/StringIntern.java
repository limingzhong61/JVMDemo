package com.atguigu.java.chapter13;

/**
 * @author:
 * @create: 2020-07-11-11:16
 */
public class StringIntern {
    public static void main(String[] args) {
        String s = new String("1");  // 在常量池中已经有了,因为“1"本身就是字符串常量
        s.intern();//调用此方法之前，字符串常量池中已经存在了"1"
        //s = s.intern();
        String s2 = "1";
        System.out.println(s == s2); //jdk6: false jdk7/8: false



        String s3 = new String("1") + new String("1");
        //执行完上行代码以后，字符串常量池中，是否存在"11"呢?答案:不存在! !

        s3.intern();//在字符串常量池中生成"11"
        // 如何理解:
        // jdk6: 创建了-个新的对象 "11",也就有新的地址。
        //jdk7:此时常量中并没有创建"11",而是创建一个 指向堆空间中new String("11")的对象

        String s4 = "11";//使用的是上一行代码代码执行时，在常量池中生成的"11"
        System.out.println(s3 == s4); //jdk6: false jdk7/8: true

    }
}
