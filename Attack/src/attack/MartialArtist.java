/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attack;

/**
 *
 * @author safa
 */
public class MartialArtist extends Combatant{
    public MartialArtist() {
        
    }
    public MartialArtist(String name, int health) {
        super(name, health);
    }
    @Override
    public void performSpecialMove(Combatant k) {
        int damage = 10+(int) Math.random()*6;
        System.out.println(this.getName()+" has performed the Majhi Smacker to "+k.getName()+ " by "+damage+" points.");
        k.healthDeplete(damage);
    }
}
