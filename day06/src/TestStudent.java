public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student("张三", 18, 68);
        stu.setName("zhangsan");
        stu.setAge(20);
        stu.setGrades(57);
        System.out.println("name:" + stu.getName());
        System.out.println("age:" + stu.getAge());
        System.out.println("grades:" + stu.getGrades());
        System.out.println("----------------------------");
        stu.showInformation();
    }
}
