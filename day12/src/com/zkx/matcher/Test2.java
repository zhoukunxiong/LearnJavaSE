package com.zkx.matcher;

import java.util.Scanner;

/**
 *      手机号正则:
 *          1.必须1开头
 *          2.第2位3~9
 *          3.全部是数字且必须11位
 */

/**
 * @author 94343
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //正则
        String phoneNumber = "1[3-9]\\d{9}";

        while (true) {
            System.out.print("请输入你的手机号:");
            boolean matches = scanner.nextLine().matches(phoneNumber);
            if (matches) {
                System.out.println("输入的手机号格式正确");
            } else {
                System.out.println("输入的手机号格式不正确");
            }
        }
    }
}
