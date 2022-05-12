package com.atguigu.java.chapter13;


/**
 * 字符串拼接
 */
public class StringTest5 {
    public static void test1() {
        String s1 = "a" + "b" + "c";  // 常量与常量的拼接结果在常量池，原理是编译期优化， 得到 abc的常量池
        String s2 = "abc"; // “abc”存放在常量池，直接将常量池的地址返回给时s2
        /**
         * 最终java编译成.class，再执行.class
         */
        System.out.println(s1 == s2); // true，因为存放在字符串常量池
        System.out.println(s1.equals(s2)); // true
    }

    public static void test2() {
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop"; //编译期优化
        //如果拼接符号的前后出现了变量，则相当于在堆空间中new String()， 具体的内容为拼接的结果。
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4); // true
        System.out.println(s3 == s5); // false
        System.out.println(s3 == s6); // false
        System.out.println(s3 == s7); // false
        System.out.println(s5 == s6); // false
        System.out.println(s5 == s7); // false
        System.out.println(s6 == s7); // false
        // intern():判断字符串常量池中是否存在javaEEhadoop值，如果存在，则返回常量池中javaEEhadoop的地址;
        //如果字符串常量池中不存在javaEEhadoop，则在常量池中加载一份javaEEhadoop, 并返回次对象的地址。
        String s8 = s6.intern();
        System.out.println(s3 == s8); // true
    }

    public static void test3() {
        //非常量
        /*
        如下的s1+s2的执行细节: (变量s是我临时定义的)
        ③StringBuilder s = new stringBuilder();
        ②s. append("a")
        ③s.append("b")
        ④s. toString()-->约等于new string("ab")
        注： 在JDK5之后，使用的是StringBuilder，在JDK5之前使用的是StringBuffer
        */
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println(s3 == s4);
    }

    /*
        1.字符串拼接操作不一定使用的是StringBuilder!
            如果拼接符号左右两边都是字符串常量或常量引用，则仍然使用编译期优化，即非stringBuilder 的方式。
        2.针对于final 修饰类、方法、基本数据类型、引用数据类型的量的结构时，能使用Lfinal的时候建议使用上。

    */
    public static void test4() {
        //常量
        final String s1 = "a";
        final String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println(s3 == s4);
    }
/*
体会执行效率:通过stringBuilder 的append()的方式添加字符串的效率要远高于使用string的字符串拼接方式!
详情: @StringBuilder 的append()的方式:自始至终中只创建过- -个stringBuilder的对象
使用string的字符串拼接方式:创建过多个StringBuilder和String的对象
②使用string的字符串拼接方式:内存中由于创建了较多的StringBuilder和String的对象， 内存占用更大;如果进行GC，需要花费额外的时间。

改进的空间:在实际开发中，如果基本确定要前前后后添加的字符串长度不高于某个限定值highlevel的情况下，建议使用构造器实例化：
stringBuilder s = new StringBuilder(highLevel );//new char[highLevel ]

*/

    public static void test6() {
        long start = System.currentTimeMillis();

        method1(100000); //4061
        //method2(100000);//3
        long end = System.currentTimeMillis();
        System.out.println("花费时间："+(end -start) );
    }

    public static void method1(int highLevel) {
        String src = "";
        for (int i = 0; i < highLevel; i++) {
            src += "a"; // 每次循环都会创建一个StringBuilder、String对象
        }
    }

    public static void method2(int highLevel) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < highLevel; i++) {
            sb.append("a");
        }
    }

    public static void main(String[] args) {
        test6();
    }
}
