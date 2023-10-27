package org.example.dataAccess;

import org.example.entities.Car;

import java.io.Console;


public class JDBCCarDao implements CarDao {
    Console console = System.console();
    @Override
    public void add(Car car) {

    if (console == null){
        System.out.println("Lütfen bir değer giriniz!");
        return;
    }else
    {
        String plate = console.readLine("Plaka : ");
        String brand = console.readLine("Marka : ");
        String model = console.readLine("Model : ");
        String price = console.readLine("Fiyat : ");

        System.out.println(plate + "plakalı araç JDBC ile veritabanına kayıt edildi.");

    }

    }
}
