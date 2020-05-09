package ru.job4j.oop;

public class Jukebox {
   public void music(int position) {
       if (position == 1) {
           System.out.println("пусть бегут не уклюже");
       } else if (position == 2) {
           System.out.println("спокойной ночи");
       } else {
           System.out.println("песня не найдена");
       }
   }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(3);
    }

}
