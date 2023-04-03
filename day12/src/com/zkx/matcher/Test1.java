package com.zkx.matcher;
/**
 *         QQ号正则:
 *             1.不能以0开头
 *             2.全部都是数字
 *             3.5~12位
 */

import java.util.Scanner;

/**
 * @author 周坤雄
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //正则
        String qqRegex = "[1-9]\\d{4,11}";

        while (true) {
            System.out.print("请输入你的QQ号:");
            boolean matches = scanner.nextLine().matches(qqRegex);
            if (matches) {
                System.out.println("输入的QQ号格式正确");
            } else {
                System.out.println("输入的QQ号格式不正确");
            }
        }
    }
}
