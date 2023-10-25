package org.example;


public class Main {
    public static void main(String[] args) {

        String mesaj = "Vade oranı";

        Product product1 = new Product();
        //Product1 Set Value
        product1.setName("DeLonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitInStock(3);
        product1.setImageUrl("kahve-mak1.jpg");

        Product product2 = new Product();
        //Product2 Set Value
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitInStock(2);
        product2.setImageUrl("kahve-mak2.jpg");

        Product product3 = new Product();
        //Product3 Value
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitInStock(4);
        product3.setImageUrl("kahve-mak3.jpg");


        Product[] products = {product1, product2, product3};

        //Get Values with ForEach
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
            System.out.println("<li>" + product.getUnitPrice() + "</li>");
            System.out.println("<li>" + product.getDiscount() + "</li>");
            System.out.println("<li>" + product.getUnitInStock() + "</li>");
            System.out.println("<li>" + product.getImageUrl() + "</li>");

        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(001);
        individualCustomer.setCustomerNumber("123456");
        individualCustomer.setPhone("05305556677");
        individualCustomer.setFirstName("Erdi");
        individualCustomer.setLastName("Topuzlu");

        CorparateCustomer corparateCustomer = new CorparateCustomer();
        corparateCustomer.setId(000001);
        corparateCustomer.setTaxNumber("987654");
        corparateCustomer.setPhone("02123334455");
        corparateCustomer.setCompany("Tobeto Java-1A");
        corparateCustomer.setTaxNumber("0123456789");

        Customer[] customers = {individualCustomer, corparateCustomer};



    }
}