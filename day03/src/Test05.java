public class Test05 {
    /*需求:
    有一个容量为10L的空水桶。水桶的上面开始往里灌水，同时下面开始往出流水。第一分钟灌水的速度是1L/min，第二分钟
    灌水的速度是2L/min，第三分钟灌水的速度是3L/min，以此类推。而流水的速度固定是3L/min。那么几分钟之后，水桶里
    能保持灌满水的状态？
     */
    public static void main(String[] args) {
        int water = 0;
        int in = 0;
        while (water < 10) {
            ++in;
            water = in - 3 + water;
            if (water < 0)
                water = 0;
            System.out.println(water);
        }
        System.out.println("第" + in + "分钟之后水桶里能保持灌满水的状态");
    }
}
