package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[]word, char[]post){
        boolean result = false;
        for (int i =word.length-1,j=post.length-1;i>post.length;i--,j--){
            if(word[i]==post[i]){
                result=true;
            }else {
                result = false;
            }
        }return result;
    }
}
