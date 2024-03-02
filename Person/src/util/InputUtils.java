/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author nhs
 */
public class InputUtils {
    public static Scanner sc = new Scanner (System.in);
    
    
    public static String inputName() {
        String name;
        while (true) {
            try {
                name = sc.nextLine();

                if (!name.matches("[a-zA-Z0-9 -.]+")) {
                    throw new IllegalArgumentException("Invalid name. Please enter a valid name.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
        return name;
    }
    
    public static String inputAddress() {
        String address;
        while (true) {
            try {
                address = sc.nextLine();

                if (!address.matches("[a-zA-Z0-9 -./_,()&]+")) {
                    throw new IllegalArgumentException("Invalid address. Please enter a valid address.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
        return address;
    }

    public static double inputDouble() {
        double fl;
        while (true) {
            try {
                fl = Double.parseDouble(sc.nextLine());
                if (fl <= 0) {
                    throw new ArithmeticException("Not valid. Enter a positive number.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Pls input a valid double number.");
            } catch (ArithmeticException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return fl;
    }
    
    public static String inputString(){
        String str = sc.nextLine();
        return str;
    }
    
}
