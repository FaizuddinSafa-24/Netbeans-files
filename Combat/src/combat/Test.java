/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.14.IP114
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Combatant k2 = new MartialArtist("Sujon Majhi", 100);
        Combatant k1 = new SuperSoldier("Vikram Rathore", 100);
        Combatant k4= Combatant.winner(k1,k2);

        // another fight
        
            Combatant k3 = new SuperAgent("Tiger", 100);
            Combatant k5= Combatant.winner(k3,k4);
            
    }
}
