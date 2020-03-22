package ru.job4j.condition;

public class Point {

    public static double distence(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        double c = (a + b);
        return Math.sqrt(c);
    }

    public static void main(String[] args) {
        double result = distence(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
