package com.atguigu.java.chapter05.virtual;


//*解析调用中非虚方法、虚方法的测试

/**
 * invokestatic指令和invokespecial指令调用的方法称为非虚方法
 */
class Father {
    public Father() {
        System.out.println(" father的构造器");
    }

    public static void showStatic(String str) {
        System.out.println("father" + str);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father普通方法");
    }
}

public class Son extends Father {
    public Son() {
        super();
    }

    public Son(int age) {
        this();
    }

    //不是重写的父类的静态方法，因为静态方法不能被重写!
    public static void showStatic(String str) {
        System.out.println("son " + str);
    }

    private void showPrivate(String str) {
        System.out.println("son private" + str);
    }

    public void show() {
        //invokestatic
        showStatic("atguigu.con");
        //invokestatic
        super.showStatic("good!");
        //invokespecial
        showPrivate("hello!");
        //invokespecial
        super.showCommon();

        // invokevirtual
        showFinal();//因为此方法声明有final, 不能被子类重写，所以也认为此方法是非虚方法
        //虚方法如下：
        //invokevirtual
        showCommon();
        //invokevirtual
        info();
        MethodInterface in = null;
        //invokeinterface
        in.methodA();
    }

    public void info(){

    }

    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }

}
interface  MethodInterface{
   void methodA();
}


