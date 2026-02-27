/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author safa
 */
public class Challenge1 {

    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        
        System.out.println("Enter hexadecimal numbers:");
        String input = scan.nextLine().toUpperCase();
        //Input converting to uppercase to refrain from error
        int decimal = Integer.parseInt(input, 16);  // auto convert to decimal
        System.out.println(decimal);
        String binary = Integer.toBinaryString(decimal); // convert to binary method static
        System.out.println("Binary of the hexadecimal: "+ binary);
    }
}
