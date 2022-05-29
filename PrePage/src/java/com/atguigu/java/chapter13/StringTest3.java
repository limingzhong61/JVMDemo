package com.atguigu.java.chapter13;

import java.util.HashSet;
import java.util.Set;

/*
    JDK6:
    -XX:Permsize=6m -XX :MaxPermSize=6m -Xms6m -Xmx6m .
 *
 * jdk8中:
 * -XX:MetaspaceSize=6m -XX:MaxMetaspaceSize=6m -Xms6m -Xmx6m
 */
public class StringTest3 {
    public static void main(String[] args) {
        //使用set保持着常量池引用，避免full gc回收常量池行为
        Set<String> set = new HashSet<String>();
        //在short可以取值的范围内足以iL6MB的Permsize或heap产生00M了。
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}

    
