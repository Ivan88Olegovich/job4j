package ru.job4j.oop.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        boolean start = true;
        int matches = 11;
        while (start) {

            System.out.println("введите число от 1 до 3");
            int select = Integer.valueOf(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("ты долбаеб? сказанно же от 1 до 3");
            } else {
                matches = matches - select;
                System.out.println(matches + "спичек осталось");
            }
            if (matches == 0 || matches < 0) {
                start = false;
            }
        }
    }
}
