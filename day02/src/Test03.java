public class Test03 {
    /*
    需求：
        某外卖商家的菜品单价如下:
    1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
    2.优惠方式:
        总金额大于100元,总金额打9折,其它无折扣
    3.需求:
        小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?
     */
    public static void main(String[] args) {
        int price = 24 * 3 + 8 * 3 + 3 * 5;

        if (price > 100)
            System.out.println("小明需付：" + price * 0.9);
        else
            System.out.println("小明需付：" + price);

    }
}
