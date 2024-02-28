/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Triangle;
import util.InputUtils;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=====Calculator Shape Program=====");
        Shape rec = generateRectangle();
        Shape cir = generateCircle();
        Shape tri = generateTriangle();
        System.out.println("---------------------------------------");
        System.out.println("-----Rectangle-----");
        rec.printResult();
        System.out.println("-----Circle-----");
        cir.printResult();
        System.out.println("-----Triangle-----");
        tri.printResult();
    }
    public static Shape generateRectangle(){
        System.out.print("Please input side width of Rectangle: ");
        double a = InputUtils.inputDouble();
        System.out.print("Please input side length of Rectangle: ");
        double b = InputUtils.inputDouble();
        Shape rec = new Rectangle(a, b);
        return rec;
    }
    
    public static Shape generateCircle(){
        System.out.print("Please input radius of Circle:");
        double a = InputUtils.inputDouble();
        Shape cir = new Circle(a);
        return cir;
    }
    
    public static Shape generateTriangle(){
        System.out.print("Please input side A of Triangle: ");
        double a = InputUtils.inputDouble();
        System.out.print("Please input side B of Triangle: ");
        double b = InputUtils.inputDouble();
        System.out.print("Please input side C of Triangle: ");
        double c = InputUtils.inputDouble();
        Shape tri = new Triangle(a, b,c);
        return tri;
    }
}
