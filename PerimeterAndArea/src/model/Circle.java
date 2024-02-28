/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nhs
 */
public class Circle extends Shape {
    public static final double PI = 3.14159;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        area = radius * radius * PI;
        return area;
    }

    @Override
    public double getPeri() {
        peri = 2* radius * PI;
        return peri;
    }

    @Override
    public void printResult() {
        System.out.println("Radius : "+ radius);
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter: "+ getPeri());
    }
}
