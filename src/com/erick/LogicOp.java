package com.erick;

public class LogicOp {
    public static void main(String[] args) {
        boolean results2; int x; int y;

        x = 1;
        y = 1;
        x++;

        System.out.printf("x=%s, and y=%s", x, y);
        System.out.println(" -----");
        results2 = 1 < 0 || 1 == 0;
        System.out.printf("results2=%s",results2);

    }
}
