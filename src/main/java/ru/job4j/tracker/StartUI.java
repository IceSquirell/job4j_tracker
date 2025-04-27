package ru.job4j.tracker;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class StartUI {

    static Item item = new Item() {
        @Override
        public LocalDateTime getCreate() {
            return super.getCreate();
        }
    };

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(formatter.format(item.getCreate()));
    }
}