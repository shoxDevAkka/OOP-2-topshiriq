package com.ConstructorsAndMethodOverloading.Point;

import java.util.Scanner;

public class PointDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nechta point-larni kiritmoqchisiz :");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("X-ni kiriting : ");
            int x = scanner.nextInt();
            System.out.println("Y-ni kiriting : ");
            int y = scanner.nextInt();
            System.out.println("Z-ni kiriting : ");
            int z = scanner.nextInt();

            Point point = new Point(x,y,z);
            point.displayPoints();
        }
    }
}
