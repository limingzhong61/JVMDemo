package java.lang;

import java.util.stream.IntStream;

/**
 * chapter2 测试，双亲委派机制
 */
////错误: 在类 java.lang.String 中找不到 main 方法
// class String  {
//    static {
//        System.out.println("自定义String");
//    }
//
//     public static void main(String[] args) {
//         System.out.println("hello,String");
//     }
//}
