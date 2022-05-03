package chapter3;

public class SubInitialization extends InitializationTest {
    static {
        number = 4; //number.属性必须提前已经加载。
        System.out.println("son static{}");
    }

    public static void main(String[] args) {
        System.out.println(number);
    }
}
