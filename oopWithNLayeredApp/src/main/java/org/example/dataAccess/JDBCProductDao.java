package org.example.dataAccess;

import org.example.entities.Product;

public class JDBCProductDao implements ProductDao {

    public void add(Product product){
        //DB Erişim kodları
        System.out.println("JDBC ile veritabanına eklendi.");
    }


}
