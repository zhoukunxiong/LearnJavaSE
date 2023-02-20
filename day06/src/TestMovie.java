import java.util.Scanner;

public class TestMovie {
    public static void main(String[] args) {
        Movie movie1 = new Movie(1, "东八区的先生们", "2022", 2.1, "中国大陆",
                "剧情 喜剧", "夏睿", "张翰 王晓晨");
        Movie movie2 = new Movie(2, "上海堡垒", "2019", 2.9, "中国大陆",
                "爱情 战争 科幻", "滕华涛", "鹿晗 舒淇");
        Movie movie3 = new Movie(3, "纯洁心灵·逐梦演艺圈", "2015", 2.2, "中国大陆",
                "剧情 喜剧", "毕志飞", "朱一文 李彦漫");
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("请输入你的选择：");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询电影信息");
            System.out.println("3.退出");
            System.out.print("----->");
            int pick = sc.nextInt();
            if (pick == 3)
                break;
            else if (pick == 2) {
                System.out.print("请输入要查询的电影id：");
                int id = sc.nextInt();
                switch (id) {
                    case 1:
                        movie1.showAll();
                        break;
                    case 2:
                        movie2.showAll();
                        break;
                    case 3:
                        movie3.showAll();
                        break;
                }
            } else if (pick == 1) {
                movie1.show();
                movie2.show();
                movie3.show();
            }
        }
    }
}
