package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[]word, char[]post) {
        boolean result = true;
        for (int i = word.length - 1, j = post.length - 1; i > post.length; i--, j--) {
            if (word[i] != post[j]) {
                result = false;
            }
        } return result;
    }
}
