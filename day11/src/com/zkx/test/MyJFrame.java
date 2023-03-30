package com.zkx.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * 石头迷阵单机游戏初始界面
 */
public class MyJFrame extends JFrame implements KeyListener {
    /**
     * 记录0号行
     */
    int row;
    /**
     * 记录0号列
     */
    int column;
    /**
     * 记录移动次数
     */
    int count = 0;
    int[][] array = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};
    int[][] win = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};

    public MyJFrame() {
        //添加监听
        this.addKeyListener(this);
        //初始化窗体
        initMyJFrame();
        //打乱石块
        dislocate();
        //绘制界面
        paintView();
        //设置窗体可见
        setVisible(true);
    }

    /**
     * 窗体初始化
     */
    private void initMyJFrame() {
        //设置窗体大小
        setSize(500, 600);
        //设置关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体顶层显示和居中
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        //设置窗体名称
        setTitle("石头迷阵");
        //取消窗体默认布局
        setLayout(null);
    }

    /**
     * 绘制界面
     */
    private void paintView() {
        //移除面板中所有的组件
        getContentPane().removeAll();

        if (victory()) {
            JLabel jLabel = new JLabel(new ImageIcon(".\\day11\\image\\win.png"));
            jLabel.setBounds(60, 230, 400, 100);
            getContentPane().add(jLabel);
        }
        //统计步数
        JLabel jLabel1 = new JLabel("步数为:" + count);
        jLabel1.setBounds(30, 20, 100, 20);
        getContentPane().add(jLabel1);

        //重新游戏
        JButton jButton = new JButton("重新游戏");
        jButton.setBounds(370, 20, 100, 20);
        getContentPane().add(jButton);
        jButton.setFocusable(false);
        jButton.addActionListener(e -> {
            count = 0;
            dislocate();
            paintView();
        });

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建组件对象
                JLabel jLabel = new JLabel(new ImageIcon(".\\day11\\image\\" + array[i][j] + ".png"));
                //设置组件放置位置
                jLabel.setBounds((50 + 100 * j), (100 + 100 * i), 100, 100);
                //添加组件到窗口
                getContentPane().add(jLabel);
            }
        }
        //创建组件对象
        JLabel jLabel = new JLabel(new ImageIcon(".\\day11\\image\\background.png"));
        //设置组件放置位置
        jLabel.setBounds(0, 50, 500, 500);
        //添加组件到窗口
        getContentPane().add(jLabel);
        //刷新
        getContentPane().repaint();
    }

    /**
     * 打乱原石块位置
     */
    private void dislocate() {
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int x = random.nextInt(4);
                int y = random.nextInt(4);
                int t;
                t = array[i][j];
                array[i][j] = array[x][y];
                array[x][y] = t;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取0号位置
                if (array[i][j] == 0) {
                    row = i;
                    column = j;
                    break;
                }
            }
        }
    }

    /**
     * 监听方向键是否按下，按下则执行移动逻辑
     */
    @Override
    public void keyPressed(KeyEvent e) {
        //左键值：37，上键值：38，右键值：39，下键值：40
        //获取键值
        int keyCode = e.getKeyCode();
        //移动
        move(keyCode);
        //每次移动都重新绘制界面
        paintView();
    }

    /**
     * 移动逻辑代码
     *
     * @param keyCode
     */
    private void move(int keyCode) {
        //←,↑,→,↓和z的键值
        int left = 37;
        int up = 38;
        int right = 39;
        int down = 40;
        int goldenFinger = 90;

        //如果胜利则不移动
        if (victory()) {
            return;
        }

        //左移动，0号右边的元素向左移动
        if (keyCode == left) {
            //最右情况，左边没元素了
            if (column == 3) {
                return;
            }
            //其它
            int t = array[row][column];
            array[row][column] = array[row][column + 1];
            array[row][column + 1] = t;
            ++column;
            ++count;
        }

        //上移动，0号下面的元素向上移动
        else if (keyCode == up) {
            //最下情况，下边没元素了
            if (row == 3) {
                return;
            }
            //其它
            int t = array[row][column];
            array[row][column] = array[row + 1][column];
            array[row + 1][column] = t;
            ++row;
            ++count;
        }

        //右移动，0号左边的元素向右移动
        else if (keyCode == right) {
            //最左情况，左边没元素了
            if (column == 0) {
                return;
            }
            //其它
            int t = array[row][column];
            array[row][column] = array[row][column - 1];
            array[row][column - 1] = t;
            --column;
            ++count;
        }

        //下移动，0号上面的元素向下移动
        else if (keyCode == down) {
            //最下情况
            if (row == 0) {
                return;
            }
            //其它
            int t = array[row][column];
            array[row][column] = array[row - 1][column];
            array[row - 1][column] = t;
            --row;
            ++count;
        }

        //作弊器，按下”Z“键，石块自动排序成功
        else if (keyCode == goldenFinger) {
            int k = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    array[i][j] = k;
                    k++;
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * 胜利
     */
    private boolean victory() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
