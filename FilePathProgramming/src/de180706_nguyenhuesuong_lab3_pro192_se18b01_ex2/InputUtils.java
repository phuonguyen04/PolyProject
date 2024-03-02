/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de180706_nguyenhuesuong_lab3_pro192_se18b01_ex2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class InputUtils {
    private static Scanner sc = new Scanner (System.in);
    public static String inputPath() {
        String name;
        while (true) {
            try {
                name = sc.nextLine();

                if (!name.matches("[a-zA-Z0-9 -./:]+")) {
                    throw new IllegalArgumentException("Invalid path. Please enter follow the format D:/forder/forder/file.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
        return name;
    }
}
