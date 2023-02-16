public class Test02 {
    /*需求：
    判断两个数组长度、数值、顺序是否相等
     */
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {1, 2, 2, 4, 5};
        System.out.print("x数组：");
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("y数组：");
        for (int i : y) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("x,y两个数组是否相等：" + compare(x, y));
    }

    public static boolean compare(int[] x, int[] y) {
        //1.判断长度是否相等
        if (x.length != y.length)
            return false;
        //2.判断数值和顺序是否相等
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i])
                return false;
        }

        return true;
    }
}
