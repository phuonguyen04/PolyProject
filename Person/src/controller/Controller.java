/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.Person;
import model.PersonList;
import util.FormatString;
import util.InputUtils;

/**
 *
 * @author Admin
 */
public class Controller {

    public static void main(String[] args) {

        PersonList psl = new PersonList();
        System.out.println("=====Management Person programer=====");
        for (int i = 0; i < 3; i++) {
            addPerson(psl);
        }
        psl.sortArray();
        displayPerson(psl);
    }

    public static Person inputPerson() {
        System.out.println("Enter name: ");
        String name = InputUtils.inputName();
        name = FormatString.formatName(name);
        System.out.println("Enter address: ");
        String address = InputUtils.inputAddress();
        System.out.println("Enter salary: ");
        double salary = InputUtils.inputDouble();
        Person ps = new Person(name, address, salary);
        return ps;
    }

    public static void addPerson(PersonList psl) {
        if (psl.addPersonList(inputPerson())) {
            System.out.println("Added successfully!");
        } else {
            System.out.println("Failed to add.");
        }
    }

    public static void displayPerson(PersonList psl) {
        JFrame jf = new JFrame();
        jf.setTitle("Salary Information");
        jf.setSize(600, 400);

        JTextArea jta = new JTextArea();
        jta.setFont(new Font("Calibri", Font.PLAIN, 16));
        jta.setText(psl.displayList());

        jf.setLayout(new BorderLayout());
        jf.add(new JScrollPane(jta), BorderLayout.CENTER);

        // Thoat khoi chuong trinh khi dong cua so jframe
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
