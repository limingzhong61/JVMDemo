package com.atguigu.java.chapter13;

class Memory {
    public static void main(String[] args) {//line 1
        int i = 1;//line 2
        Object obj = new Object();//line 3
        Memory mem = new Memory();//line 4
        mem.foo(obj);//line 5| I
    }//line 9

    private void foo(Object param) {//Line 6
        String str = param.toString();//line 7
        System.out.println(str);
    }//line 8
}
