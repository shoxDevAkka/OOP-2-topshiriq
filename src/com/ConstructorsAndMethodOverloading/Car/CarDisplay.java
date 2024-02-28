package com.ConstructorsAndMethodOverloading.Car;

import java.util.Scanner;

public class CarDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nechta moshina ma'lumotlarini kiritmoqchisiz :");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            Car car = new Car();
            System.out.println("Moshina rangini kiriting :");
            String color = scanner.next();
            System.out.println("Moshina modelini kiriting :");
            String model = scanner.next();
            System.out.println("Moshina narxini kiriting :");
            int price = scanner.nextInt();
            System.out.println("Moshina avtomat yoki mexanik tuzilmaga ekanligini kiriting : ");
            String carType = scanner.next();

            car.setModel(model);
            car.setColor(color);
            car.setPrice(price);
            car.setCarType(carType);

            car.displayCar(i);
        }
    }
}
