/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author safa
 */
public class CalculationBrain {

    private double currentValue, pastValue;
    private Operation pending;
    private String inputNow;

    public void inputDigit(String digit) {
        this.inputNow += digit;
    }

    public void setOperation(Operation operate) {
        this.pastValue = Double.parseDouble(inputNow);
        this.pending = operate;
        this.inputNow = "";

    }

    public double calculate() {
        this.currentValue = Double.parseDouble(inputNow);
        if (pending == null) {
            return Double.parseDouble(inputNow);
        } else {
            this.currentValue = pending.executing(pastValue, currentValue);
            return this.currentValue;
        }
    }

    public void clear() {
        this.currentValue = 0.0;
        this.pastValue = 0.0;
        this.inputNow = "";
        this.pending = null;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public String getInputNow() {
        return inputNow;
    }

    public boolean pendingOperation() {
        return pending !=null;
    }
}
