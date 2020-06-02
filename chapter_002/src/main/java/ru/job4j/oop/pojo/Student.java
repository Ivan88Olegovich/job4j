package ru.job4j.oop.pojo;

import java.util.Date;

public class Student {
    private String student;
    private String groupNumber;
    private Date dateOfReceipt;

    private String getGroupNumber() {
        return groupNumber;
    }

    private void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    private Date getDateOfReceipt() {
        return dateOfReceipt;
    }

    private void setDateOfReceipt(Date dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    private String getStudent() {
        return student;
    }

    private void setStudent(String student) {
        this.student = student;
    }
}
