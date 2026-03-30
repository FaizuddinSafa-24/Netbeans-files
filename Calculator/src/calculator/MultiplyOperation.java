/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author safa
 */
public class MultiplyOperation implements Operation{
    @Override
    public double executing(double a, double b) {
        return a*b;
    }
    @Override
    public String getSymbol() {
        return "*";
    }
}
