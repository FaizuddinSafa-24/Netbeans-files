/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labmanual1;

import java.util.Scanner;

/**
 *
 * @author safa
 */
public class LabManual1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printtask1();
    }
    public static void printtask1() {
        int a,b,c,d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        a= scan.nextInt();
        System.out.println("Enter b:");
        b= scan.nextInt();
        System.out.println("Enter c:");
        c= scan.nextInt();
        System.out.println("Enter d:");
        d= scan.nextInt();
        int sum= a+b+c+d;
        System.out.println("The sum: "+sum);
    }
    
}
