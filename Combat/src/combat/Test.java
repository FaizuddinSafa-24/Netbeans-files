/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.14.IP114
 */
public class Test {
    public static void main(String[] args) {
        Combatant k2 = new MartialArtist("Sujon Majhi",100);
        Combatant k1 = new SuperSoldier("Vikram Rathore",100);
        
      
        k1.displaydetails();
        k1.performSpecialMove(k2);
        
        k2.displaydetails();
        k2.performSpecialMove(k1);
       
        
    }
}
