public class Test01 {
    /*需求：
    输出1-100中7的倍数或包含7的数
     */
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if ((i % 7 == 0) || judge(i)) {
                System.out.println(i + "跳过");
            }
        }
    }

    //judge方法，判断数字中是否包含7
    public static boolean judge(int number) {
        //先判断数字是几位数
        int count = 0;
        int num = number;
        while (num != 0) {
            ++count;
            num /= 10;
        }
        //逐一取出数中的每个数字，判断是否含7
        for (int i = 0; i < count; i++) {
            if (number % 10 == 7)
                return true;
            else
                number = number / 10;
        }

        return false;
    }
}
