package com.atguigu.java.chapter08;

//* -Xms600m -Xmx600m
//        *
//-XX: -UseAdaptivesizePolicy: 关闭自适应的内存分配策略 (暂时用不到)
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油~");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
