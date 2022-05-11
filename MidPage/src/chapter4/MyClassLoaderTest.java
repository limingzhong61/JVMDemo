package chapter4;


public class MyClassLoaderTest {
    public static void main(String[] args) {
        MyClassLoader1 loader = new MyClassLoader1("D:\\Users\\Lenovo\\Desktop\\JVM\\Code\\MidPage\\src\\chapter5\\");
        try {
            Class clazz = loader.loadClass("Demo1");
            System.out.println("加载此类的类的加载器为:" + clazz.getClassLoader().getClass().getName());
            System.out.println("加载当前Demo1类的类的加载器的父类加载器为: " + clazz.getClassLoader().getParent().getClass().getName());
            System.out.println("加载当前AppClassLoader类的类的加载器的父类加载器为: " + clazz.getClassLoader().getParent().getParent().getClass().getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}