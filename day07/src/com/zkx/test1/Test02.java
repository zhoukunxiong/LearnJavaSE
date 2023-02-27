package com.zkx.test1;

import java.util.Scanner;

public class Test02 {
    /*需求：
        键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = 0;
        int upperCase = 0;
        int lowerCase = 0;

        System.out.print("请输入一个字符串：");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            System.out.println(c);
            if (c >= '0' && c <= '9')
                ++digit;
            if (c >= 'a' && c <= 'z')
                ++lowerCase;
            if (c >= 'A' && c <= 'Z')
                ++upperCase;
        }
        System.out.println(s + "中");
        System.out.println("数字：" + digit + "个");
        System.out.println("大写字母：" + upperCase + "个");
        System.out.println("小写字母：" + lowerCase + "个");
    }
}
