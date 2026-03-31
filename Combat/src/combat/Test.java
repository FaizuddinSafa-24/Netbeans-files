/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.14.IP114
 */
package combat;

public class Test {

    public static void main(String[] args)  {
        Combatant k2 = new MartialArtist("Sujon Majhi", 100);
        Combatant k1 = new SuperSoldier("Vikram Rathore", 100);
        Combatant kw= Combatant.winner(k1,k2);
        System.out.println();
        kw.recover();

        // another fight
        
            Combatant k3 = new SuperAgent("Tiger", 100);
            Combatant k5= Combatant.winner(k3,kw);
            System.out.println();
            
    }
}
