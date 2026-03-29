



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author safa
 */
public class SuperAgent extends Combatant {
    public SuperAgent() {
        
    }
    public SuperAgent(String name, int health) {
        super(name, health);
    } 
    @Override
    public void displaydetails() {
     System.out.println("Name:"+this.getName());
        System.out.println("Health: "+this.getHealth());
    }
    @Override
    public void performSpecialMove(Combatant k) {
        int damage = (int)(9+8*Math.random());
        System.out.println(this.getName() + " has struck  "+ k.getName()+" with Tiger Drive Shot and caused "+(k.getHealth()-damage) +" points. ");
        k.healthDeplete(damage);
    }
}
