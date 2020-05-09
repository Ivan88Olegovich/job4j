package ru.job4j.oop;

public class Battaey {
    private int load;

    public Battaey(int charge) {
        this.load = charge;
    }

    public void exchange(Battaey another) {
       another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battaey first = new Battaey(50);
        Battaey second = new Battaey(30);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);
    }
}
