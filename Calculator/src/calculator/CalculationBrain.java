/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author safa
 */
public class CalculationBrain{
    private  double currentValue,pastValue;
    private Operation pending;
    private String inputNow;
    
    public void inputDigit(String digit) {
        this.inputNow+= digit;
    }
    public void setOperation(Operation operate) {
        
    }
    public double calculate() {
        
    }
    public void clear() {
        this.currentValue= 0.0;
        this.pastValue= 0.0;
        this.inputNow= "";
        this.pending=null;
    }
    public double getCurrentValue() {
        
    }
    public String getInputNow() {
        
    }
    public boolean pendingOperation() {
        
    }
}
 