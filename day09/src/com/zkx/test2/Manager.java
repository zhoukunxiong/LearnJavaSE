package com.zkx.test2;

public class Manager extends Employee {
    private double bonus;


    public Manager() {
    }

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }


    /**
     * 获取
     *
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * 设置
     *
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Manager{bonus = " + bonus + "}";
    }

    //方法重写
    @Override
    void work() {
        System.out.println("姓名为" + super.getName()
                + ",年龄为" + super.getAge()
                + ",工资为" + super.getSalary()
                + ",奖金为" + this.bonus
                + "的项目经理正在分配任务...");
    }
}
