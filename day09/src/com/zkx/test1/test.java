package com.zkx.test1;

public class test {
    public static void main(String[] args) {
        Student student = new Student("zkx", 23, 98);
        Teacher teacher = new Teacher("chenrong", 24, "8年");

        student.setName("周坤雄");
        student.setAge(23);
        student.setGrades(61);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGrades());
        System.out.println("--------------------");
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getSeniority());
        teacher.setName("陈荣");
        teacher.setAge(24);
        teacher.setSeniority("7年");
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getSeniority());



    }
}
