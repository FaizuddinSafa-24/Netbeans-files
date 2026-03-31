/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package attack;

/**
 *
 * @author safa
 */
public class Attack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Combatant k1 = new MartialArtist("Sujon Majhi",100);
        Combatant k2 = new SuperSoldier("Vikram Rathore",100);
        Combatant kw = Combatant.attack(k1, k2);
        
        
    }
    
}
