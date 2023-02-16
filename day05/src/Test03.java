import java.util.Random;

public class Test03 {
    /*需求：
    产生一个由字母和数字随机组成的4位数验证码
     */
    public static void main(String[] args) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
                'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z'};
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            System.out.println(ch[rd.nextInt(ch.length)]);
        }
    }
}
