package com.zkx.test1;

import java.util.Scanner;

public class Test04 {
    /*需求：
    键盘录入一个 字符串，如果字符串中包含（TMD），则使用 *** 替换
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "TMD";
        String s = sc.nextLine();
        s = replace(s, str);
        System.out.println(s);
    }

    public static String replace(String s, String str) {
        //把键盘录入的字符串转换成小写字符数组
        char[] chars1 = s.toLowerCase().toCharArray();
        //将要检测的字符串转换成小写字符数组
        char[] chars2 = str.toLowerCase().toCharArray();
        //统计chars1中和chars2中连续相等的字符个数，如果count==chars2.length，则chars1中包含chars2
        int count = 0;
        //循环找出chars1中是否包含chars2
        for (int i = 0; i < chars1.length - chars2.length + 1; i++) {
            for (int j = 0; j < chars2.length; j++) {
                //判断chars1[i]和后面chars2.length-1个元素是否和chars2中所有元素对应相等
                if (chars1[i + j] == chars2[j]) {
                    ++count;
                }
                if (count == chars2.length) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i + chars2.length);
                    s = s1 + "***" + s2;
                    count = 0;
                    break;
                }
            }
        }

        return s;
    }
}
