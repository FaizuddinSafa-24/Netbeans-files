/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package good;

/**
 *
 * @author safa
 */
public class Calc {
    
    double result;
    String input;
    
    public Calc(String input) {
        this.input = input;
    }
    
    public double output() {
        double num = 0;
        char operand = '+';
        String current = "";
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c) || c == '.') {
                current += c;
            } else {
                num = Double.parseDouble(current);
                result = getResult(result, num, operand);
                operand = c;
                current = "";
            }
        }
        if (input.charAt(input.length() - 1) == '%') {
            operand = input.charAt(input.length() - 1);
            String op = String.valueOf(operand);
            result = percent(result, op);
            return result;
        }
        num = Double.parseDouble(current);
        result = getResult(result, num, operand);
        current = "";
        return result;
        
    }
    
    public double getResult(double result, double num, char op) {
        switch (op) {
            case '+':
                result += num;
                return result;
            case '-':
                result -= num;
                return result;
            case '*':
                result *= num;
                return result;
            case '/':
                result /= num;
                return result;
            case '%':
                result *= (0.01 * num);
                return result;
            default:
                return 0;
        }
    }
    
    public double percent(double result, String operand) {
        
        return result * 0.01;
    }
}
