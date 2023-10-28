package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements CarDao {

    public void add(Car car){
        System.out.println("Eklendi! - Araç Hibernate teknolojisi ile veritabanına eklendi.");
    }

    public void delete(Car car){
        System.out.println("Silindi! - Araç Hibernate teknolojisi ile veritabanınızdan kaldırılmıştır.");
    }
}
