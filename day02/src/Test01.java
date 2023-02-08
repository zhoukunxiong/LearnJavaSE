import java.util.Scanner;

public class Test01 {
    /*
        需求：键盘录入一个3位数，输出打印这个数的个位、十位、百位
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个3位数：");
        int number = scanner.nextInt();
        int num = number;
        int geWei = number % 10;
        number /= 10;
        int shiWei = number % 10;
        number /= 10;
        int baiWei = number % 10;
        System.out.println(num + "的个位是" + geWei);
        System.out.println(num + "的十位是" + shiWei);
        System.out.println(num + "的百位是" + baiWei);
    }
}
