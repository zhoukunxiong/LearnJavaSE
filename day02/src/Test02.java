import java.util.Scanner;

public class Test02 {
    /*
    需求:
        身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
        儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
        女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
        现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入父亲身高（cm）：");
        double fatherHeight = scanner.nextDouble();
        System.out.print("输入母亲身高（cm）：");
        double motherHeight = scanner.nextDouble();
        double sonHeight = (fatherHeight + motherHeight) * 1.08 / 2;
        double daughterHeight = (fatherHeight * 0.923 + motherHeight) / 2;
        System.out.println("儿子预计身高：" + sonHeight);
        System.out.println("女儿预计身高：" + daughterHeight);
    }
}
