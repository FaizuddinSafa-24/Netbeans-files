/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.14.IP114
 */
public class SuperSoldier extends Combatant {
    public SuperSoldier() {
        
    }
    public SuperSoldier(String name, int health) {
        super(name, health);
    } 
    @Override
    public void displaydetails() {
     System.out.println("Name:"+this.getName());
        System.out.println("Health: "+this.getHealth());
    }
    @Override
    public void performSpecialMove(Combatant k) {
        int damage = (int)(k.getHealth()-8-10*Math.random());
        System.out.println(this.getName()+" has caused "+damage+" points to "+ k.getName()+" by Jawan Punch");
        k.healthDeplete(damage);
    }
}
