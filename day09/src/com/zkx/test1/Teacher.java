package com.zkx.test1;

public class Teacher extends People {
    private String seniority;


    public Teacher() {
    }

    public Teacher(String name, int age, String seniority) {
        super(name, age);
        this.seniority = seniority;
    }

    /**
     * 获取
     *
     * @return seniority
     */
    public String getSeniority() {
        return seniority;
    }

    /**
     * 设置
     *
     * @param seniority
     */
    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String toString() {
        return "Teacher{seniority = " + seniority + "}";
    }

    void teacher() {
        System.out.println(this.getName()+""+this.getAge()+"");
    }


}
