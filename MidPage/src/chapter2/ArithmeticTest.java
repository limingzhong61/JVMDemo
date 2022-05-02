package chapter2;


public class ArithmeticTest {

    public static void method1() {
        int i = 10;
        double j = i / 0.0;
        System.out.println(j); //无穷大

        double d1 = 0.0;
        double d2 = d1 / 0.0;
        System.out.println(d2); //NaN: not a number
    }

    public void method2() {
        float i = 10;
        float j = -i;
        i = -j;
    }

    public void method3() {
        int i = 10;
        //i = i + 10;
        i += 10;
    }

    public int method4() {
        int a = 80;
        int b = 7;
        int c = 10;
        return (a + b) * c;
    }

    public int method5(int i, int j) {
        return ((i + j - 1) & ~(j - 1));
    }

    //关于(前)++和(后)++
    public void method6() {
        int i = 10;
        //i++;
        ++i;
    }

    public void method7() {
        int i = 10;
        int a = i++;
        int j = 20;
        int b = ++j;
    }

    //思考
    public void method8() {
        int i = 10;
        i = i++;
        System.out.println(i);
    }


    public static void main(String[] args) {
        //method1();
        //System.out.println(Integer.MIN_VALUE);
        //System.out.println(-Integer.MIN_VALUE);
        //double i = 0.1;
        //double j = 0.1;
        //double k = 0.01;
        //
        //System.out.println(i*j);
        //System.out.println(i*j == k);
        Integer i = 12;
        Integer j = 12;
        System.out.println(i == j);
        //System.out.println(Integer.valueOf(i) == Integer.valueOf(i));

        Integer k = 128;
        Integer p = 128;
        System.out.println(k == p);
    }
}