import java.util.Scanner;

public class Test02 {
    /*需求：
        2019年1月1日起，国家推出新的个人所得税政策，起征点上调至5000元。也就是说税前工资扣除三险一金
        （三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。如果大于5000元，那么大于5000元
        的部分按梯度交税，具体梯度比例如下：
        0 ~ 3000元的部分，交税3%
        3000 ~ 12000元的部分，交税10%
        12000 ~ 25000的部分 ， 交税20%
        25000 ~ 35000的部分，交税25%
        35000 ~ 55000的部分，交税30%
        55000 ~ 80000的部分，交税35%
        超过80000的部分，交税45%
        比如：黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分是15000-1500-5000=8500元，
        个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。请完成一个个税计算程序，在用户输入税前
        工资后，计算出他对应的纳税数额，以及税后工资为多少？
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tax = 0;

        System.out.println("请输入工资");
        double salary = sc.nextDouble();
        //计算并扣除三险一金
        salary = salary * 0.9;
        double number = salary;
        //扣除三险一金后工资>5000，则计算个税
        if (salary > 5000) {
            //计算交税部分
            salary = salary - 5000;
            //0~3000部分交税3%
            if (salary < 3000) {
                tax = (3000 - salary) * 0.03 + tax;
            } else if (salary >= 3000) {
                tax = (3000 - 0) * 0.03 + tax;
            }
            //3000~12000部分交税10%
            if (salary < 12000 && salary > 3000) {
                tax = (salary - 3000) * 0.1 + tax;
            } else if (salary >= 12000) {
                tax = (12000 - 3000) * 0.1 + tax;
            }
            //12000~25000部分交税20%
            if (salary < 25000 && salary > 12000) {
                tax = (salary - 12000) * 0.2 + tax;
            } else if (salary >= 25000) {
                tax = (25000 - 12000) * 0.2 + tax;
            }
            //25000~35000部分交税25%
            if (salary < 35000 && salary > 25000) {
                tax = (salary - 25000) * 0.25 + tax;
            } else if (salary >= 35000) {
                tax = (35000 - 25000) * 0.25 + tax;
            }
            //35000~55000部分交税30%
            if (salary < 55000 && salary > 35000) {
                tax = (salary - 35000) * 0.3 + tax;
            } else if (salary >= 55000) {
                tax = (55000 - 35000) * 0.3 + tax;
            }
            //55000~80000部分交税35%
            if (salary < 80000 && salary > 55000) {
                tax = (salary - 55000) * 0.35 + tax;
            } else if (salary >= 80000) {
                tax = (80000 - 55000) * 0.35 + tax;
            }
            //超过80000部分交税45%
            if (salary > 80000) {
                tax = (salary - 80000) * 0.45 + tax;
            }
        }
        System.out.println("缴纳税额为：" + tax+"元");
        System.out.println("税后工资为" + (number - tax)+"元");
    }
}
