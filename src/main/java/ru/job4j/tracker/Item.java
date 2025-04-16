package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {

    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printOf() {
        System.out.println(name + " " + id);
    }

    public static void main(String[] args) {
        Item item = new Item();
        Item item1 = new Item("Ivan");
        Item item2 = new Item("Ivan", 2);
        item.printOf();
        item1.printOf();
        item2.printOf();
    }
}