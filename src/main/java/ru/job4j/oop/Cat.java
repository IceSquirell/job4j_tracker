package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public static void main(String[] args) {
        System.out.println("There is gav's food.");
        Cat gav = new Cat();
        gav.giveName("Gav");
        gav.eat("cutlet");
        gav.show();
        System.out.println("There is black's food.");
        Cat black = new Cat();
        black.giveName("Black");
        black.eat("fish");
        black.show();
    }

    public void show() {
        System.out.println(this.name + " will eat " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveName(String nick) {
        this.name = nick;
    }
}