package com.abel;

public class Main {
    static class Point {
        int x;
        int y;
    }
    static int[][] DIRECTION = new int[][]{
            {0, -1},
            {0, 1},
            {-1, 0},
            {1, 0}
    };// 定义上下左右四个方向
    public static void main(String[] args) {
        Point point = new Point();
        point.x = 3;
        point.y = 4;
        System.out.println("原始坐标为： " + point.x + " " + point.y);
        //打印上下左右的相邻点
        for (int i = 0; i < 4; i++) {
            int after_x = point.x + DIRECTION[i][0];
            int after_y = point.y + DIRECTION[i][1];
            System.out.println("第" + (i + 1) + "次变换:");
            System.out.format("变换后的x坐标: %d", after_x);
            System.out.println();
            System.out.format("变换后的y坐标: %d", after_y);
            System.out.println();
        }
    }
}