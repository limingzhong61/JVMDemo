//package com.atguigu.java.chapter02.class_loader;
//
//import com.sun.java.accessibility.AccessBridge;
//import sun.security.util.CurveDB;
//
//import java.net.URL;
//import java.security.Provider;
//
///**
// * @author:
// * @create: 2020-07-05-10:17
// */
//public class ClassLoaderTest1 {
//    public static void main(String[] args) {
//        System.out.println("*********启动类加载器************");
//        // 获取BootstrapClassLoader 能够加载的API的路径
//        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
//        for (URL url : urls) {
//            System.out.println(url.toExternalForm());
//        }
//
//        // 从上面路径中，随意选择一个类，来看看他的类加载器是什么：得到的是null，说明是  引导类加载器
//        ClassLoader classLoader = Provider.class.getClassLoader();
//        System.out.println(classLoader);
//
//        System.out.println("**********扩展类加载器***********");
//        String extDirs = System.getProperty("java.ext.dirs");
//        for (String path : extDirs.split(";")) {
//            System.out.println(path);
//        }
//        //从上面的路径中随意选择-一个类,来看看他的类加载器是什么: 扩展类加载器
//        ClassLoader classLoader1 = AccessBridge.class.getClassLoader();
//        System.out.println(classLoader1);   //sun.misc.Launcher$ExtClassLoader@7f31245a
//
//    }
//}
