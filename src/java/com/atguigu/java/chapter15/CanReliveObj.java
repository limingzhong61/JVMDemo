package com.atguigu.java.chapter15;

/**
 * 测试Object类中finalize()方法
 * 对象复活场景
 *
 */
public class CanReliveObj {
    // 类变量，属于GC Roots的一部分
    public static CanReliveObj canReliveObj;

    //此方法只能被调用一次
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用当前类重写的finalize()方法");
        canReliveObj = this;    //当前待回收的对象在finalize()方法中与引用链上的任何-一个对象建立联系
    }

    public static void main(String[] args) throws InterruptedException {
        canReliveObj = new CanReliveObj();
        //对象第一次成功拯救自己
        canReliveObj = null;
        System.gc();//调用垃圾回收器
        System.out.println("-----------------第一次gc操作------------");
        // 因为Finalizer线程的优先级比较低，暂停2秒，以等待它
        Thread.sleep(2000);
        if (canReliveObj == null) {
            System.out.println("obj is dead");
        } else {
            System.out.println("obj is still alive");
        }

        System.out.println("-----------------第二次gc操作------------");
        canReliveObj = null;
        System.gc();
        // 下面代码和上面代码是一样的，但是 canReliveObj却自救失败了
        Thread.sleep(2000);
        if (canReliveObj == null) {
            System.out.println("obj is dead");
        } else {
            System.out.println("obj is still alive");
        }

    }
}
