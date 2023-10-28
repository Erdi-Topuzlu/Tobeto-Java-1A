package org.example.dataAccess;

import org.example.entities.Car;

public class JDBCCarDao implements CarDao {

    public void add(Car car){
        System.out.println("Başarılı! - Araç JDBC teknolojisi ile veritabanına eklendi.");
    }

    public void delete(Car car){
        System.out.println("Silindi! - Araç JDBC teknolojisi ile veritabanınızdan kaldırılmıştır.");
    }

}
