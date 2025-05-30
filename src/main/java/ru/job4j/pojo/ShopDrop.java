package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        if (index + 1 < products.length) {
            for (int i = index; i < products.length - 1; i++) {
                products[i] = products[i + 1];
            }
            products[products.length - 1] = null;
        }
        return products;
    }
}