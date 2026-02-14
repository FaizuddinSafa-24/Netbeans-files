/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2d;

/**
 *
 * @author safa
 */
import java.util.Scanner;
public class Array2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[2][3];
//        arr[0][0] = scan.nextInt();
//        arr[0][1] = scan.nextInt();
//        arr[0][2] = scan.nextInt();
//        arr[1][0] = scan.nextInt();
//        arr[0][1] = 5;
//        arr[1][2] = 6;
        //System.out.println(arr[0][2]); // 3
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("arr [%d][%d]", i, j);
                arr[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(arr[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
    
}
