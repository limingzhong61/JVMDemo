package com.atguigu.java.chapter09;

/**
 * staticObj、instanceObj、 LocalObj存放在哪里?
 *
 * @author shkstart shks tart@126. com
 * @create 2020 11:39
 */
public class StaticObjTest {
    static class Test {
        static ObjectHolder staticObj = new ObjectHolder();
        ObjectHolder instance0bj = new ObjectHolder();

        void foo() {
            ObjectHolder local0bj = new ObjectHolder();
            System.out.println("done");
        }

        private static class ObjectHolder {
            public static void main(String[] args) {
                Test test = new StaticObjTest.Test();
                test.foo();
            }
        }
    }
}
