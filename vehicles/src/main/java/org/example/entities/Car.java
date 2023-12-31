package org.example.entities;

public class Car {
    private int id;
    private String brand;
    private String model;
    private double km;
    private double motorpower;
    private int year;
    private double price;


    public Car() {
    }

    public Car(int id, String brand, String model, double km, double motorpower, int year, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.km = km;
        this.motorpower = motorpower;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getMotorpower() {
        return motorpower;
    }

    public void setMotorpower(double motorpower) {
        this.motorpower = motorpower;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
