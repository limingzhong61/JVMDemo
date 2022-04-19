package com.atguigu.java.chapter13;

/**
 * @author:
 * @create: 2020-07-11-11:16
 */
public class StringIntern1 {
    public static void main(String[] args) {
        String s3 = new String("1") + new String("1");
        //执行完上行代码以后，字符串常量池中，是否存在"11"呢?答案:不存在! !

        String s4 = "11";//使用的是上一行代码代码执行时，在常量池中生成的"11"
        String s5 = s3.intern();

        System.out.println(s3 == s4);
        System.out.println(s5 == s4);

    }
}
