package com.zkx.test1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    static ArrayList<Student> arrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            menu();
            function(sc.nextInt());
        }
    }

    //菜单
    public static void menu() {
        System.out.println("**********学生信息管理系统**********");
        System.out.println("***1.添加学生信息***");
        System.out.println("***2.删除学生信息***");
        System.out.println("***3.修改学生信息***");
        System.out.println("***4.查看学生信息***");
        System.out.println("***5.退出系统***");
        System.out.print("请输入：");
    }

    //去除上个nextInt()产生的Enter
    public static void dispel() {
        sc.nextLine();
    }

    public static void stringOut(String str) {
        System.out.print("请输入学生" + str + ":");
    }

    public static void out(Object obj) {
        System.out.println("原值：" + obj);
        System.out.print("输入修改值：");
    }

    public static void function(int number) {
        dispel();
        switch (number) {
            case 1 -> function1();
            case 2 -> function2();
            case 3 -> function3();
            case 4 -> function4();
            case 5 -> function5();
        }
    }

    //添加功能
    public static void function1() {
        //换行，美观
        System.out.println();
        Student student = new Student();
        stringOut("学号");
        student.setId(sc.nextLine());
        stringOut("姓名");
        student.setName(sc.nextLine());
        stringOut("年龄");
        student.setAge(sc.nextInt());
        dispel();
        stringOut("班级");
        student.setClasses(sc.nextLine());
        arrayList.add(student);
        System.out.println("添加成功！");
        //换行，美观
        System.out.println();
    }

    //删除功能
    public static void function2() {
        function4();
        System.out.print("请输入要删除学生的学号:");
        String s = sc.nextLine();
        boolean flag = false;
        //遍历匹配到学号则删除
        for (Student student : arrayList) {
            if (student.getId().equals(s)) {
                arrayList.remove(student);
                System.out.println("删除成功！\n");
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("删除失败！未找到该学号，请检查后再次尝试\n");
    }

    //修改功能
    public static void function3() {
        function4();
        System.out.print("请输入需要修改学生的学号：");
        String s = sc.nextLine();
        boolean flag = false;
        for (Student student : arrayList) {
            //根据学号遍历找出目标对象
            if (student.getId().equals(s)) {
                System.out.println("\n该学生信息：");
                System.out.println("学号：" + student.getId() + "," + "姓名：" + student.getName() + "," + "年龄：" + student.getAge() + "," + "班级：" + student.getClasses());
                //选择菜单
                System.out.println("1.学号");
                System.out.println("2.姓名");
                System.out.println("3.年龄");
                System.out.println("4.班级");
                System.out.print("请选择要修改的值：");
                //输入值
                int i = sc.nextInt();
                dispel();
                switch (i) {
                    case 1 -> {
                        out(student.getId());
                        student.setId(sc.nextLine());
                    }
                    case 2 -> {
                        out(student.getName());
                        student.setName(sc.nextLine());
                    }
                    case 3 -> {
                        out(student.getAge());
                        student.setAge(sc.nextInt());
                        dispel();
                    }
                    case 4 -> {
                        out(student.getClasses());
                        student.setClasses(sc.nextLine());
                    }
                }
                System.out.println("修改成功！\n");
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("修改失败！未找到该学号，请检查后再次尝试\n");
    }

    //查看功能
    public static void function4() {
        //换行，美观
        System.out.println("\n所有学生信息：");
        for (Student student : arrayList) {
            System.out.println("学号：" + student.getId() + "," + "姓名：" + student.getName() + "," + "年龄：" + student.getAge() + "," + "班级：" + student.getClasses());
        }
        System.out.println();
    }

    //退出功能
    public static void function5() {
        System.out.println("退出系统！");
        System.exit(1);
    }

}
