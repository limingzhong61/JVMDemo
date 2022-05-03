package chapter3;

import org.junit.Test;

import java.io.*;
/*
* 1.实例化:当创建一个类的实例时，比如使用 new 关键字，或者通过反射、克隆、反序列化。
* 2.静态方法：当调用类的静态方法时，即当使用了字节码 invokestatic 指令。
* */
public class ActiveUse1 {

    public static void main(String[] args) {
        Order order = new Order();
    }

    //序列化的过程:
    @Test
    public void test1() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("order .dat"));
            oos.writeObject(new Order());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //反序列化的过程: (验证)
    @Test
    public void test2() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("order .dat"));
            Order order = (Order) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test3(){
        Order.method();
    }
}

class Order implements Serializable {
    static {
        System.out.println("Order类的初始化过程");
    }

    public static void method() {
        System.out.println("Order method()....");
    }
}