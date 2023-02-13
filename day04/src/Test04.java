import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
    /*需求：
    有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
    再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，并
    且数组的元素依旧是从小到大排列的
     */
    public static void main(String[] args) {
        int[] array = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] arr = new int[11];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        arr[10] = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            arr[i] = array[i];
        }
        Arrays.sort(arr);
        for (int i : arr) {
            if (i != arr[arr.length - 1])
                System.out.print(i + " ");
            else System.out.println(i);
        }
    }
}
