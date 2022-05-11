package chapter4;

public class UserTest {
    public static void main(String[] args) {
        User user = new User(); //隐式加载
        try {
            Class clazz = Class.forName("chapter4.User"); //显式加载
            ClassLoader.getSystemClassLoader().loadClass("chapter4.User");//显式加载
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}