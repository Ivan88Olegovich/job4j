package ru.condition;

public class DummyBot {

    public static String answer(String eqestion) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(eqestion)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(eqestion)) {
            rsl = "До скорой встречи.";
        }
        return rsl;

    }


}
