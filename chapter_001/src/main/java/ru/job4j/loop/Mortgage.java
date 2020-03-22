package ru.job4j.loop;


public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        while (amount > 0) {
            double a = amount + (amount * percent);
            amount = a - salary;
            year++;
        }
        return year;

    }
}
