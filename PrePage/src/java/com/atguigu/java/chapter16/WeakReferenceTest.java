package com.atguigu.java.chapter16;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {
    public static class User {
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int id;
        public String name;

        @Override
        public String toString() {
            return "[id=" + id + "，name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        //构造了弱引用
        WeakReference<User> userWeakRef = new WeakReference<>(new User(1, " slonghk"));
        //从弱引用中重新获取对象
        System.out.println(userWeakRef.get());
        System.gc();
        //不管当前内存空间足够与否，都会回收它的内存
        System.out.println("After GC:");
        //重新尝试从弱引用中获取对象
        System.out.println(userWeakRef.get());
    }

}
