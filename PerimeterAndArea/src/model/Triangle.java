/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public static boolean isTriangleValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    @Override
    public double getArea() {
        if (isTriangleValid(a, b, c)) {
            double p = getPeri() / 2;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            area = -1;
        }
        return area;
    }

    @Override
    public double getPeri() {
        if (isTriangleValid(a, b, c)) {
            peri = a + b + c;
        } else {
            peri = -1;
        }
        return peri;
    }

    @Override
    public void printResult() {
        if (isTriangleValid(a, b, c)) {
        System.out.println("Side A : " + a);
        System.out.println("Side B : " + b);
        System.out.println("Side C : " + c);
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter: " + getPeri());
        }else{
            System.out.println("Can't calculate area and peri cause the triangle is not valid.");
        }
    }

}
