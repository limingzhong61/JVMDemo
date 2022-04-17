package com.atguigu.java.chapter10;

/**
 * 测试对象实例化的过程
 * ①加载类元信息-②为对象分配内存-③处理并发问题-④属性的默认初始化(零值初始化)
 * -⑤设置对象头的信息-⑥属性的显式初始化、代码块中初始化、构造器中初始化
 * <p>
 * 给对象的属性赋值的操作:
 * ①属性的默认初始化-②显式初始化/③代码块中初始化-④构造器中初始化
 */
public class Customer {
    int id;
    String name;

    {
        name = "lisi";
    }

    Account account;

    public Customer() {
        account = new Account();
    }
}

class Account {}