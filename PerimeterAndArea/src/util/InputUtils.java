/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class InputUtils {
    public static Scanner sc = new Scanner(System.in);
    public static double inputDouble() {
        double db;
        while (true) {
            try {
                db = Double.parseDouble(sc.nextLine());
                if (db <= 0) {
                    throw new ArithmeticException("Not valid. Enter a positive number.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid double number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return db;
    }
}
