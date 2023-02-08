import java.util.Scanner;

public class Test05 {
    /*
    需求：
        一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
	    请用程序实现获取这三个和尚的最高身高
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入第一个和尚的身高（cm）：");
        int first = scanner.nextInt();
        System.out.print("输入第二个和尚的身高（cm）：");
        int second = scanner.nextInt();
        System.out.print("输入第三个和尚的身高（cm）：");
        int third = scanner.nextInt();
        int max = first;

        max = Math.max(max, second);
        max = Math.max(max, third);

        System.out.println("三个和尚的最高身高为：" + max + "cm");

    }
}
