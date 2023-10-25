package org.example.dataAccess;

import org.example.entities.Product;

public class HibernateProductDao implements ProductDao {

    public void add(Product product){
        //DB Erişim kodları
        System.out.println("Hibernate ile veritabanına eklendi.");
    }

}
