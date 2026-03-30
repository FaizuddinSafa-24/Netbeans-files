/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author safa
 */
public class Console implements CalculatorSurface {

    @Override
    public void updateDisplay(String update) {
        System.out.println("Display: "+update);
    }
    @Override
    public void showError(String error) {
        System.out.println("Bang!Error: "+);
    }
}
