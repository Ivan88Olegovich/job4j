package ru.job4j.oop;

public class DimmyDic {
    public String engToRus(String eng) {
        String translation = "Неизвестное слово. " + eng;
        return translation;
    }

    public static void main(String[] args) {
        DimmyDic dimmyDic = new DimmyDic();
        System.out.println(dimmyDic.engToRus("xyu"));
    }
}
