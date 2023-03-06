package com.zkx.test1;

public class Student {
    private String id;
    private String name;
    private int age;
    private String classes;


    public Student() {
    }

    public Student(String id, String name, int age, String classes) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
    }

    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return classes
     */
    public String getClasses() {
        return classes;
    }

    /**
     * 设置
     *
     * @param classes
     */
    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", age = " + age + ", classes = " + classes + "}";
    }
}
