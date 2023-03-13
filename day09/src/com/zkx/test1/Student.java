package com.zkx.test1;

public class Student extends People {
    private double grades;

    public Student() {
    }

    public Student(String name, int age, double grades) {
        super(name, age);
        this.grades = grades;
    }

    /**
     * 获取
     *
     * @return grades
     */
    public double getGrades() {
        return grades;
    }

    /**
     * 设置
     *
     * @param grades
     */
    public void setGrades(double grades) {
        this.grades = grades;
    }

    public String toString() {
        return "Student{grades = " + grades + "}";
    }

}
