import chapter3.User;

public class UserTest {
}

public class UserTest {
    public static void main(String[] args) {
        User user = new User(); //隐式加载
        try {
            Class clazz = Class.forName(" com. atguigu. java.User"); //显式加载
            ClassLoader.getSystemClassLoader().loadClass(name: ”com.atguigu.java.User ");//显式加载
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}