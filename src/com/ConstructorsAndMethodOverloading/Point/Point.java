package com.ConstructorsAndMethodOverloading.Point;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point() {
    }

    public Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void displayPoints(){
        System.out.println();
        System.out.println("Kiritilgan qiymatlat : ");
        System.out.println("x : " + this.x);
        System.out.println("y : " + this.y);
        System.out.println("z : " + this.z);
        System.out.println();
    }

}
