import java.util.Random;
import java.util.Scanner;

public class TestRandom {
    /*需求：
    猜数字小游戏
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int guess = -1;
        int build = ra.nextInt(101);
        System.out.println("已产生一个0~100的随机数");
        System.out.println(build);
        while (guess != build) {
            System.out.print("请输入你猜测的数字:");
            guess = sc.nextInt();
            if (guess < build)
                System.out.println("猜小了！");
            else if (guess > build)
                System.out.println("猜大了！");
        }
        System.out.println("猜对了！");


    }
}
