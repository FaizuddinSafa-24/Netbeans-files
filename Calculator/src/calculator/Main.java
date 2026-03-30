/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author safa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculationBrain brain = new CalculationBrain();
        Console console = new Console();
        Controller control = new Controller(console, brain);
        System.out.println("Display: ");
        control.digitPress("9");
        control.opPressed("*");
        control.digitPress("5");
        control.equalpressed();
    }
    
}
