/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attack;

/**
 *
 * @author safa
 */
public class SuperSoldier extends Combatant{
    public SuperSoldier() {
        
    }
    public SuperSoldier(String name, int health) {
        super(name, health);
    }
    @Override
    public void performSpecialMove(Combatant k) {
        int damage = 8+(int) Math.random()*11;
        System.out.println(this.getName()+" has caused "+ damage+" points to "+k.getName()+"by Jawan Punch");
        k.healthDeplete(damage);
    }
}
