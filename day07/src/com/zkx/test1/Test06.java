package com.zkx.test1;

public class Test06 {
    /*需求：
    定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(splicing(arr));
    }

    public static String splicing(int[] array) {
        String s = "";
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                s = s + array[i] + ",";
            } else s = s + array[i];
        }

        return "[" + s + "]";
    }
}
