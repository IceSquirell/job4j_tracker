package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", 1225);
        Book book2 = new Book("Преступление и наказание", 672);
        Book book3 = new Book("Мастер и Маргарита", 480);
        Book book4 = new Book("Clean code", 560);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book book : books) {
            System.out.println("Книга - " + book.getName() + " / " + book.getPages() + " страниц");
        }
        System.out.println("Replace books one to three");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println("Книга - " + book.getName() + " / " + book.getPages() + " страниц");
        }
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println("Книга - " + book.getName() + " / " + book.getPages() + " страниц");
            }
        }
    }
}