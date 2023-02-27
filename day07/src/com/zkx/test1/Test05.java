package com.zkx.test1;

import java.util.Scanner;

public class Test05 {
    /*需求：
    键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
     */
    public static void main(String[] args) {
        //利用StringBuileder类中的reverse方法发转字符串，再比较反转前后的内容是否相等
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = new StringBuilder(s).reverse().toString();
        if (s.equals(str))
            System.out.println("对称字符串：" + s);
        else System.out.println("非对称字符串：" + s);
    }
}
