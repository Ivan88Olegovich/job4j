package ru.job4j.oop.pojo;

public class Library {
    public static void main(String[] args) {
        Book mainKampf = new Book("mainKampf", 1488);
        Book headFirst = new Book("headFirst", 713);
        Book pushkin = new Book("pushkin", 300);
        Book cleanCode = new Book("cleanCode", 400);

        Book[] book = new Book[4];

        book[0] = mainKampf;
        book[1] = headFirst;
        book[2] = pushkin;
        book[3] = cleanCode;


        for (int index = 0; index < book.length; index++) {

            System.out.println(book[index].getTitle() + "-" + book[index].getNaberOfPages());
        }

        System.out.println("Replace a books");

        book[0] = cleanCode;
        book[3] = mainKampf;

        for (int index = 0; index < book.length; index++) {

            System.out.println(book[index].getTitle() + "-" + book[index].getNaberOfPages());
        }

        for (int index = 0; index < book.length; index++) {
            if (book[index].getTitle().equals("cleanCode")) {
                System.out.println(book[index].getTitle() + "_" + book[index].getNaberOfPages());
            }
        }

    }
}
