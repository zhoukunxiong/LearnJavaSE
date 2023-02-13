import java.util.Arrays;

public class Test01 {
    /*需求：
    请使用静态初始化的方式,创建一个长度为5的整数数组,并为数组中的元素赋值,
	遍历数组,在同一行打印所有元素,元素之间用空格隔开
     */
    public static void main(String[] args) {
        int[] array = new int[]{6, 7, 8, 9, 10};
        //for循环遍历
        System.out.println("for循环遍历");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) System.out.print(array[i] + " ");
            else System.out.print(array[i]);
        }
        System.out.println("\n" + "------------------------------");
        //foreach遍历
        System.out.println("foreach遍历");
        for (int i : array) {
            if (i != array[4]) System.out.print(i + " ");
            else System.out.print(i);
        }
        System.out.println("\n" + "------------------------------");
        //Arrays工具类中toString静态方法遍历
        System.out.println("toString遍历");
        System.out.println(Arrays.toString(array));
    }
}
