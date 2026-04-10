/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labmidprep2;

/**
 *
 * @author safa
 */
public class LabMidPrep2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HotelRoom h1 = new HotelRoom("B1",7500, 12);
        h1.displayInfo();
        double fair =h1.calculateTotalPrice(12);
        System.out.println("The total fair is: "+fair);
        RegularHotelRoom r1 = new RegularHotelRoom("B1",7500, 12, true, false);
        r1.displayInfo();
        double fair1 =r1.calculateTotalPrice(12);
        System.out.println("The total fair is: "+fair);
    }
    
}
