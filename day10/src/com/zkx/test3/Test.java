package com.zkx.test3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择支付方式：1、支付平台支付    2、银行卡网银支付   3、引用卡快捷支付");
        System.out.print("请输入你的支付方式：");
        int i = scanner.nextInt();
        //消除回车
        scanner.nextLine();
        System.out.print("请输入你的支付金额：");
        out(i, scanner.nextDouble());
    }

    public static void out(int x, double y) {
        String s = "";
        switch (x) {
            case 1 -> s = "支付平台支付";
            case 2 -> s = "银行卡网银支付";
            case 3 -> s = "引用卡快捷支付";
        }
        System.out.println("通过" + s + "支付了：" + y + "元！");
    }
}
