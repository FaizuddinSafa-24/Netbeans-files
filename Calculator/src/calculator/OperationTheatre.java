/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author safa
 */
public class OperationTheatre {
    public static Operation getOperation(String symbol) {
        switch(symbol) {
            case"+": return new AddOperation();
            case"-": return new SubtractOperation();
            case"*": return new MultiplyOperation();
            case"/": return new DivOperation();
            
            default:
                re throw new Calculationeception("Add, Subtract, Multiply, and Div Allowed");
        }
    }
}
