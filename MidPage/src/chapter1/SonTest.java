package chapter1;

/*
成员变量(非静态)的赋值过程:①默认初始化-②显式初始化/代码块中初始化-③构造器中初始化-④有了对象之后，可以“对象. 属性”或”对象.方法"
的方式对成员变量进行赋值。
*/
class Father {
    int x = 10;

    public Father() {
        this.print();
        x = 20;
    }

    public void print() {
        System.out.println("Father.x=" + x);
    }
}

class Son extends Father {
    int x = 30;

    public Son() {
        this.print();
        x = 40;
    }

    public void print() {
        System.out.println("Son.x =" + x);
    }
}

public class SonTest {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x); //属性不存在动态性！！！
    }
}

