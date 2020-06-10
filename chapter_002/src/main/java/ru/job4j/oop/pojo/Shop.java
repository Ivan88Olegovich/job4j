package ru.job4j.oop.pojo;



public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[7];
        Shop shop = new Shop();
        products[0] = new Product("bread", 100);
        products[1] = new Product("milk", 150);
        products[2] = new Product("eggs", 80);
        products[3] = new Product("tea", 70);
        products[4] = new Product("meat", 90);


        shop.delete(products, 4);

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getCount() + products[i].getName());
            } else {
                System.out.println("null");
            }
        }



    }
    public Product[] delete(Product[]products, int index) {

        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
            products[i + 1] = null;
        }
        return products;
    }
}