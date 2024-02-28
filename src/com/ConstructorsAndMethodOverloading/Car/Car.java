package com.ConstructorsAndMethodOverloading.Car;

public class Car {

    private String color;
    private String model;
    private int price;
    private String carType;

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void displayCar(int i){
        System.out.println();
        System.out.println((i + 1) + "-Moshina umumiy ma'lumotlari :");

        System.out.println("Modeli : " + this.model);
        System.out.println("Rangi : " + this.color);
        System.out.println("Narxi : " + this.price);
        System.out.println("Moshina tuzilmasi : " + this.carType);
        System.out.println();
    }
}
