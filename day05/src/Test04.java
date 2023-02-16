import java.util.Scanner;

public class Test04 {
    /*需求：
        输出99乘法表
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MultiplicationTable(scanner.nextInt());
    }

    public static void MultiplicationTable(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (j != i)
                    System.out.print(i + "x" + j + " ");
                else System.out.print(i + "x" + j);
            }
            System.out.println();
        }

    }
}
