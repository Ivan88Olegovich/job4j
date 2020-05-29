package ru.job4j.oop;

public class Animal {

    public Animal() {
        super();
        System.out.println("Animal");
    }
    public Animal(String name) {

    }

    public static void main(String[] args) {
        Animal animal = new Animal("ANIMAL");
        Predator predator = new Predator("PREDATOR");
        Tiger tiger = new Tiger("TIGER");
    }
}
