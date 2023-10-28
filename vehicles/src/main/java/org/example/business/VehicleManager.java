package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.CarDao;
import org.example.entities.Car;

public class VehicleManager {

    private CarDao carDao;
    private final Logger[] loggers;

    public VehicleManager(CarDao carDao, Logger[] loggers){
        this.carDao = carDao;
        this.loggers = loggers;
    }

    public void add(Car car) throws Exception {

        //Rule-1
        if (car.getMotorpower() < 90){
            throw new Exception("Hata : Araç beygir gücü 90 ' dan küçük olamaz!");
        }else if(car.getYear() < 2015){
            throw new Exception("Hata : Araç yaşı 8 den büyük olmalıdır!");
        }else{
            carDao.add(car);
        }

        //Rule-2
        if (car.getBrand() == car.getModel()){
            throw new Exception("Hata : Model ismi araç markası ile aynı olamaz!");
        }else{
            carDao.add(car);
        }

        //Rule-3
        if (car.getKm() > 100000 && car.getPrice() > 100000){
            throw new Exception("Hata : İkinci el araç fiyatı 0 KM araçtan fazla olamaz!");
        }else {
            carDao.add(car);
        }



        for (Logger logger: loggers) {
            logger.log(car.getBrand());
        }

    }

}
