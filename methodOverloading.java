package com.example.demo.AssignmentJava;


import java.util.*;

public class Program {
    static void area(float a) {
        System.out.println("area of square = "+ (a * a));
    }
    static void area(float l, float b) {
        System.out.println("area of rectangle = "+ (l * b));
    }
    static void area(double r) {
        System.out.println("area of circle = " + (3.14 * r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side value for square");
        area(sc.nextFloat());
        System.out.println("enter length & breadth of a rectangle");
        area(sc.nextFloat(), sc.nextFloat());
        System.out.println("enter the radiuss of a circle");
        area(sc.nextDouble());
    }
}

