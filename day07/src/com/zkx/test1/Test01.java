package com.zkx.test1;

import java.util.Scanner;

public class Test01 {
    /*需求：
    已知正确的用户名和密码，请用程序实现模拟用户登录。
            总共给三次机会，登录之后，给出相应的提示

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = "943435989";
        String password = "zhoukunxiongdemima";
        int count = 0;

        while (count < 4) {
            count++;
            System.out.print("请输入用户名：");
            String s1 = sc.nextLine();
            System.out.print("请输入密码：");
            String s2 = sc.nextLine();
            if (userName.equals(s1) && password.equals(s2)) {
                System.out.println("登录成功！");
                break;
            }
            if (count != 3) {
                System.out.println("用户名或密码错误，请检查后重新输入！");
            }
            if (count == 3) {
                System.out.println("你已错误3次，请5分钟后再次尝试登录！");
                break;
            }
        }
    }
}
