package chapter3;

import org.junit.Test;

import java.util.Random;
/*
* <mark>静态字段</mark>：当使用类、接口的静态字段时（**final 修饰特殊考虑**），比如，使用 getstatic 或者 putstatic 指令。（对应访问变量、赋值变量操作）
* */
public class ActiveUse2 {
    @Test
    public void test1() {
        //System.out.println(User.num);   //会
        //System.out.println(User.num1);  //不会
        System.out.println(User.num2);  //会
    }

    @Test
    public void test2() {
        System.out.println(CompareA.NUM1); //不会
        //System.out.println(CompareA.NUM2); //会
    }


}

class User {
    static {
        System.out.println("User类的初始化过程");
    }

    public static int num = 1;
    public static final int num1 = 1;
    public static final int num2 = new Random().nextInt(10);

}

interface CompareA {
    public static final Thread t = new Thread() {
        {
            System.out.println("CompareA的初始化");
        }
    };

    public static final int NUM1 = 1;
    public static final int NUM2 = new Random().nextInt(10);
}