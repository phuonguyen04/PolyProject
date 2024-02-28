/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author LENOVO
 */
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double getArea() {
        area = width * length;
        return area;
    }

    @Override
    public double getPeri() {
        peri = (width + length)*2;
        return peri;
    }

    @Override
    public void printResult() {
        System.out.println("Width : "+ width);
        System.out.println("Length: "+ length);
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter: "+ getPeri());
    }
    
}
