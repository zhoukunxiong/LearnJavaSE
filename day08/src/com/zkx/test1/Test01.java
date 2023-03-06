package com.zkx.test1;

import java.util.ArrayList;

public class Test01 {
    /*需求：
    创建一个存储字符串的集合，内部存储3个字符串元素,  使用程序实现在控制台遍历该集合
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("我是");
        arrayList.add("周坤");
        arrayList.add("xiong");

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
