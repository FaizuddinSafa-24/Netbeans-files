/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author safa
 */
public class DivOperation implements Operation{
    @Override
    public double executing(double a, double b) {
        if(b==0) {
            throw new CalculatorException("Cannot Divide by Zero!");
        }
        return a/b;
    }
    @Override
    public String getSymbol() {
        return "/";
    }
}
