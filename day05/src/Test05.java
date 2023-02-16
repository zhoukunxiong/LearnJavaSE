import java.util.Scanner;

public class Test05 {
    /*需求：
    对正数的小数进行四舍五入的操作(不考虑负数情况)。四舍五入之后的结果是一个int整数类型并返回
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(round(scanner.nextDouble()));
    }

    public static int round(double num) {
        //一定要先乘10再转化为int类型，不然就会造成数据丢失
        int number = (int) (num * 10);

        if ((number % 10) >= 5)
            number = (number / 10) + 1;
        else number = number / 10;

        return number;
    }
}
