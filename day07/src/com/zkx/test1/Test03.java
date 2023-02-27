package com.zkx.test1;

import java.util.Scanner;

public class Test03 {
    /*需求：
    以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("请输入一个手机号：");
        s = sc.nextLine();
        String s1 = s.substring(0, 3);
        String s2 = s.substring(7);
        System.out.println(s1 + "****" + s2);
    }
}
