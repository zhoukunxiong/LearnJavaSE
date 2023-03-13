package com.zkx.test2;

public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder("张三", 23, 15000);
        Manager manager = new Manager("李四", 24, 18000, 5000);

        coder.setAge(24);
        coder.work();
        manager.work();
    }
}
