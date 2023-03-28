package com.zkx.test;

import javax.swing.*;

public class test1 {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jFrame = new JFrame("石头迷阵单机版V1.0");
        //设置窗体高和宽
        jFrame.setSize(595, 514);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体默认顶层和居中
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        //取消窗体默认布局
        jFrame.setLayout(null);
        //创建组件对象
        JLabel jLabel = new JLabel(new ImageIcon("D:\\Documents\\LearnJavaSE\\day11\\image\\1.png"));
        //设置组件摆放位置
        jLabel.setBounds(50, 90, 100, 100);
        //添加组件到窗体
        jFrame.getContentPane().add(jLabel);
        //设置窗体可见
        jFrame.setVisible(true);
    }
}

