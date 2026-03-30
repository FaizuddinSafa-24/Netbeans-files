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
        this.logic.clear();
        this.view.updateDisplay("0");
    }
    public void digitPress(String digit) {
        this.logic.inputDigit(digit);
        this.view.updateDisplay(logic.getInputNow());
    }
    public void opPressed(String symbol) {
        Operation op =OperationTheatre.getOperation(symbol);
        this.logic.setOperation(op);
        this.view.updateDisplay(logic.getInputNow());
    }
    public void equalpressed() {
     try{
         this.view.updateDisplay(String.valueOf(logic.calculate()));
     } catch (CalculatorException e){
         this.view.showError(e.getMessage());
     }
    }
}
