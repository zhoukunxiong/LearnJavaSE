package com.zkx.matcher;
/**
 * 邮箱正则:
 * 1.必须包含一个且只有一个"@"
 * 2.第一个字符不得是"@"或者"."
 * 3.不允许出现"@."或".@"
 * 4.结尾不得是"@"或者"."
 * 5.允许"@"前的字符中出现"+"
 * 6.不允许"+"在最前面,或者"+@"
 */

import java.util.Scanner;

/**
 * @author 周坤雄
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //正则
        String email = "\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+";

        while (true) {
            System.out.print("请输入你的邮箱:");
            boolean matches = scanner.nextLine().matches(email);
            if (matches) {
                System.out.println("输入的邮箱格式正确");
            } else {
                System.out.println("输入的邮箱格式不正确");
            }
        }
    }
}
