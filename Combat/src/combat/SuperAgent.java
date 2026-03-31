



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author safa
 */
package combat;

public class SuperAgent extends Combatant {
    public SuperAgent() {
        
    }
    public SuperAgent(String name, int health) {
        super(name, health);
    } 
    
    
    @Override
    public void performSpecialMove(Combatant k) {
        int damage = (int)(9+8*Math.random());
        System.out.println(super.getName() + " has struck  "+ k.getName()+" with Tiger Drive Shot and caused "+damage +" points. ");
        k.healthDeplete(damage);
    }
}
