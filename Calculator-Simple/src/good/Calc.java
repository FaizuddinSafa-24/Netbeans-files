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
            if (Character.isDigit(c)) {
                current += c;
            } else {
                operand = c;
                num = Double.parseDouble(current);
                result = getResult(result, num, operand);
                current = "";
            }
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
                result %= num;
                return result;
            default:
                return 0;
        }
    }
}
