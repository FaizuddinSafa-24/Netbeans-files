/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labmidprep1;

/**
 *
 * @author safa
 */
public class LabMidPrep1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager m1 = new Manager("Safa",12000,"IT",12);
        m1.displayInfo();
        double bonusSalary =m1.calculatewBonus(20);
        System.out.println("Bonus + Salary :"+ bonusSalary);
    }
    
}
