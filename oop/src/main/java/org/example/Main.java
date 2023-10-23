package org.example;


public class Main {
    public static void main(String[] args) {

        String mesaj = "Vade oranı";

        Product product1 = new Product();
        //Product1 Set Value
        product1.name = "DeLonghi Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitInStock = 3;
        product1.imageUrl = "kahve-mak1.jpg";

        Product product2 = new Product();
        //Product2 Set Value
        product2.name = "Smeg Kahve Makinesi";
        product2.unitPrice = 6500;
        product2.discount = 8;
        product2.unitInStock = 2;
        product2.imageUrl = "kahve-mak2.jpg";

        Product product3 = new Product();
        //Product3 Value
        product3.name = "Kitchen Aid Kahve Makinesi";
        product3.unitPrice = 4500;
        product3.discount = 9;
        product3.unitInStock = 4;
        product3.imageUrl = "kahve-mak3.jpg";

        Product[] products = {product1, product2, product3};

        //Get Values with ForEach
        for (Product product : products) {
            System.out.println(product.name);
            System.out.println(product.unitPrice);
            System.out.println(product.discount);
            System.out.println(product.unitInStock);
            System.out.println(product.imageUrl);
        }


    }
}