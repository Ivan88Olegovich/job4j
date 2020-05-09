package ru.job4j.oop;

public class Cat {
   private String food;
   private String name;

   public void giveNick(String nick) {
     this.name = nick;
   }
   public void eat(String meat) {
       this.food = meat;
   }
   public void show() {
       System.out.println(this.name + " " + this.food);

   }

    public static void main(String[] args) {
        System.out.println("your name and what did you eat?"); //коты как бы английский знают
        Cat gav = new Cat();
        gav.giveNick("котенок Гав,");
        gav.eat("котлетку");
        gav.show();
        System.out.println("your name and what did you eat?");
        Cat black = new Cat();
        black.giveNick("Просто Черный кот,");
        black.eat("рыбку");
        black.show();
    }

}
