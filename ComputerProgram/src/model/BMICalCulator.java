/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class BMICalCulator extends Calculator {

    private String status;

    public BMICalCulator() {
    }

    public BMICalCulator(double num1, double num2) {
        super(num1, num2);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public double calResult() throws ArithmeticException{
        rs = num1 / (num2 * num2);
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide for zero!");
        }
        return rs;
    }
    
    public String setStatus(){
        if (rs> 40){
            status = "Very fat - should lose weight immediately";
        }
        if (rs<= 40 && rs > 30){
            status = "Fat - should lose weight";
        }
        if (rs<= 30 && rs > 25){
            status = "Overweight";
        }
        if (rs<= 25 && rs >= 19){
            status = "Standard";
        }
        if (rs < 19){
            status = "Under-standard";
        
        }
        return status;
    }
}
