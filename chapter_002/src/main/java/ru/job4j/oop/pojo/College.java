package ru.job4j.oop.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudent("Ivanov Ivan ");
        student.setGroupNumber("wp1488 ");
        student.setDateOfReceipt(new Date());
        System.out.println(student.getStudent() + student.getGroupNumber() + student.getDateOfReceipt());
    }
}