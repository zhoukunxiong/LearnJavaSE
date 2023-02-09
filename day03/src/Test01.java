import java.util.Scanner;

public class Test01 {
    /*需求：
    某商场购物可以打折，具体规则如下：
	普通顾客购不满100元不打折，满100元打9折；
	会员购物不满200元打8折，满200元打7.5折；
    不同打折规则不累加计算。
    请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和
    购物的折前金额（整数即可），输出应付金额（小数类型）。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 0;
        int type = sc.nextInt();
        int amount = sc.nextInt();

        if (type == 0) {
            if (amount < 100)
                price = amount;
            else price = amount * 0.9;
        } else if (type == 1) {
            if (amount < 200)
                price = amount * 0.8;
            else price = amount * 0.75;
        }
        System.out.println("应付金额为：" + price);
    }
}
