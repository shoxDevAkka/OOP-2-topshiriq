package com.ConstructorsAndMethodOverloading.Uchburchak;

import java.util.Scanner;

public class TriangleDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nechta uchburchak ma'lumotlarini kiritmoqchisiz :");
        int count = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < count; i++) {
            Triangle triangle = new Triangle();

            System.out.println("Uchburchak a-tomonini kiriting :");
            int a = scanner.nextInt();
            System.out.println("Uchburchak b-tomonini kiriting :");
            int b = scanner.nextInt();
            System.out.println("Uchburchak c-tomonini kiriting :");
            int c = scanner.nextInt();

            if (a+b>c && a+c>b && b+c>a){       // uchburchak bo'lish sharti
                triangle.setA(a);
                triangle.setB(b);
                triangle.setC(c);

                triangle.displayTomon(i);
                triangle.perimeter(a,b,c);
                triangle.area(a,b);
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Kiritilgan tomonlar uchburchak bo'lish shartini bajarmaydi!");
                System.out.println();
            }
        }
    }
}
