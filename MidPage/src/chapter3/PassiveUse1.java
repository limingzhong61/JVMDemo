package chapter3;

import org.junit.Test;

/* 1.当访间一个静态字段时，只有真正声明这个字段的类才会被初始化。
> 当通过子类引用父类的静态变量， 不会导致子类初始化
* 2.通过数组定义类引用，不会触发此类的初始化
* 3.引用常量不会触发此类或接口的初始化。因为常量在链接阶段就已经被显式赋值了。
* 4.调用classLoader类的loadClass()方法加载一 个类，并不是对类的主动使用， 不会导致类的初始化。
说明:没有初始化的类，不意味着没有加载!
*/
public class PassiveUse1 {
    //1.当访间一个静态字段时，只有真正声明这个字段的类才会被初始化。
    @Test
    public void test1() {
        System.out.println(Child.num);
    }
    //2.通过数组定义类引用，不会触发此类的初始化
    @Test
    public void test2() {
        Parent[] parents = new Parent[10];
        System.out.println(parents.getClass());
        System.out.println(parents.getClass().getSuperclass());
        parents[0] = new Parent();
    }

}

class Parent {
    static {
        System.out.println("Parent的初始化过程");
    }

    public static int num = 1;
}

class Child extends Parent {
    static {
        System.out.println("Child的初始化过程");
    }
}