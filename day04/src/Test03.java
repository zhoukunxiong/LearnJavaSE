public class Test03 {
    /*需求：
    现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所
    有元素的最小值并打印
     */


    public static void main(String[] args) {
        int[] array = {100, 50, 90, 60, 80, 70};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("The least number is:" + min);
    }
}
