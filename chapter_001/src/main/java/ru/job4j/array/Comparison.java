package ru.job4j.array;

public class Comparison {
    public static int comparison(int[] array1, int[] array2) {
        int c = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    c = array1[i];
                }
            }
        } return c;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {3, 1};
        System.out.println(comparison(array1, array2));
    }
}

