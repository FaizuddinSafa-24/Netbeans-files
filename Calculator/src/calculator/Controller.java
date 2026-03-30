/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author safa
 */
public class Controller {
    private CalculatorSurface view;
    private CalculationBrain logic;
    
    public Controller(CalculatorSurface view, CalculationBrain logic) {
        this.logic=logic;
        this.view = view;
    }
    public void clearPressed() {
        logic.clear();
        view.
    }
}
