package ru.job4j.loop;

public class Factorial {


    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {

            result = i * result;

            if (n == 0) {
                result = 1;
            }


        }
        return result;
    }

}
