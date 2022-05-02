package chapter2;


/**
 * 指令3:类型转换指令
 */
public class ClassCastTest {
    //宽化类型转换
//针对于宽化类型转换的基本测试
    public void upCast1() {
        int i = 10;
        long l = i;
        float f = i;
        double d = i;
        float f1 = 1;
        double d1 = 1;
        double d2 = f1;
    }

    //举例:精度损失的问题
    public static void upCast2() {
        int i = 123123123;
        float f = i;
        System.out.println(f);//123123120
        long l = 123123123123L;
        l = 123123123123123123L;
        double d = l;
        System.out.println(d);//123123123123123120
    }

    //窄化类型转换
    //基本的使用
    public void downCast1() {
        int i = 10;
        byte b = (byte) i;
        short s = (short) i;
        char c = (char) i;
        long l = 10L;
        int i1 = (int) l;
        byte b1 = (byte) 1;
    }

    public void downCast2() {
        float f = 10;
        long l = (long) f;
        int i = (int) f;
        byte b = (byte) f;
        double d = 10;
        byte b1 = (byte) d;
    }

    //测试NaN,无穷大的情况
    public static void downCast5() {
        double d1 = Double.NaN;
        int i = (int) d1;
        System.out.println(d1);
        System.out.println(i);

        double d2 = Double.POSITIVE_INFINITY;
        long l = (long) d2;
        int j = (int) d2;
        System.out.println(Long.MAX_VALUE);
        System.out.println(l);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(j);

        float f = (float) d1;
        System.out.println(f);
    }


    public static void main(String[] args) {
        //upCast2();
        downCast5();
    }

}