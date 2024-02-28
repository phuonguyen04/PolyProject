/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public abstract class Shape {
    protected double area;
    protected double peri;

    public Shape() {
    }

    public abstract double getArea();

    

    public abstract double getPeri();
    
    public abstract void printResult();
    
}
