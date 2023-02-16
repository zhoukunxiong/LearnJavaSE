import java.util.Random;
import java.util.Scanner;

public class Test06 {
    /*需求：
    一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
    请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复
     */
    public static void main(String[] args) {
        int[] array = {2, 588, 888, 1000, 10000};
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            //使产生的随机数大小每次训话-1
            int num = random.nextInt(array.length - i);
            System.out.println(array[num] + "元的奖金被抽出");
            //将每次被抽中的数组值和最末尾没被抽中的值交换
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[num];
            array[num] = temp;
        }
    }
}
