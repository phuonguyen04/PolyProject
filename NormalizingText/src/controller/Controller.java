/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import common.Validator;
import java.io.IOException;
import model.Words;
import view.Menu;

public class Controller extends Menu {

    Words words;
    Validator v;

    public Controller() {
        super(new String[]{"Import and normalize file", "Output file", "Exit"}, "Normalize text");
        v = new Validator();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addFile();
                break;
            case 2:
                outputFile();
                break;
            case 3:
                System.out.println("See you next time");
                System.exit(0);
                break;
        }
    }

    public void addFile() {
//        Debug
        words = new Words("input.txt");
        String s = v.normalize(words);
        words.clear();
        words.add(s);
        System.out.println("After normalize");
        System.out.println(s);
    }

    public void outputFile() {
        try {
            words.doSave();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}