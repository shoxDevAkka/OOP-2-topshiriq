package com.ConstructorsAndMethodOverloading.Uchburchak;

public class Triangle {

    private double a;
    private double b;
    private double c;
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void displayTomon(int i){
        System.out.println();
        System.out.println((i + 1) + "-uchburchak ma'lumotlari :");
        System.out.println("a tomon : " + this.a);
        System.out.println("b tomon : " + this.b);
        System.out.println("c tomon : " + this.c);
    }

    public void perimeter(int a, int b, int c){
        System.out.println("Perimeter : " + (a + b + c));
    }

    public void perimeter(long a, long b, long c){
        System.out.println("Perimeter : " + (a + b + c));
    }

    public void perimeter(float a, float b, float c){
        System.out.println("Perimeter : " + (a + b + c));
    }

    public void perimeter(double a, double b, double c){
        System.out.println("Perimeter : " + (a + b + c));
    }

    public void area(int a, int b){
        System.out.println("Yuza : " + (a*b/2));
    }

    public void area(long a, long b){
        System.out.println("Yuza : " + (a*b/2));
    }

    public void area(float a, float b ){
        System.out.println("Yuza : " + (a*b/2));
    }

    public void area(double a, double b){
        System.out.println("Yuza : " + (a*b/2));
    }

}
