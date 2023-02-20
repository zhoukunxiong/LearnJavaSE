public class Student {
    //创建一个标准JavaBean
    private String name;
    private int age;
    private int grades;


    public Student() {
    }

    public Student(String name, int age, int grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
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
     * @return grades
     */
    public int getGrades() {
        return grades;
    }

    /**
     * 设置
     *
     * @param grades
     */
    public void setGrades(int grades) {
        this.grades = grades;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", grades = " + grades + "}";
    }

    public void showInformation() {
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
        System.out.println("grades:" + this.grades);
    }
}
