package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int count = 0;
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product == null) {
                count = index;
                break;
            } else {
                count = -1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        System.out.println(indexOfNull(products));
    }
}