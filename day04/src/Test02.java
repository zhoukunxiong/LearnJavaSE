public class Test02 {
    /*需求：
    现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的和并打印
     */
    public static void main(String[] args) {
        int[] array = {100, 50, 90, 60, 80, 70};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
//            if (i != array.length - 1)
//                System.out.print(array[i] + " ");
//            else System.out.println(array[i]);
        }
        System.out.println("sum is:" + sum);
    }
}
