package ru.job4j.oop.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(item);
        System.out.println(tracker.findById(1));
    }
}
