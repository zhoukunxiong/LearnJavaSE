package com.zkx.test;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int num = 120;

        for (int i = 0; i < 14; i++) {
            num += 70;
            System.out.println(num);
        }
        System.out.println("--------------------------------------");
        int b = 145;
        for (int i = 0; i < 13; i++) {
            System.out.println(b);
            b += 70;

        }
    }

    //方法重载
//    public static int method(int a, int b) {
//        return a + b;
//    }
//
//    public static void method(int a, double b) {
//        System.out.println(a + b);
//    }
}
