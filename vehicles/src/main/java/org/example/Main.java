package org.example;

import org.example.business.VehicleManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JDBCCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car(1,"Audi","A6",150000,286,2020,5500000);
        Car car2 = new Car(2,"Mercedes-Benz","C200",80000,70,2014,1000000);
        Car car3 = new Car(3,"Opel","Opel",50000,120,2019,1000000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        VehicleManager vehicleManager = new VehicleManager(new HibernateCarDao(), loggers);
        vehicleManager.add(car1);

        VehicleManager vehicleManager1 = new VehicleManager(new JDBCCarDao(), loggers);
        vehicleManager1.add(car2);

        VehicleManager vehicleManager2 = new VehicleManager(new JDBCCarDao(), loggers);
        vehicleManager2.add(car3);




    }
}