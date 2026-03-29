/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.14.IP114
 */
public class MartialArtist extends Combatant {
    int baseDamage=10;
    public  MartialArtist() {
        
    }
    public  MartialArtist(String name, int health) {
        super(name, health);
    }
//    public int baseDamage() {
//        this.health= health-baseDamage;
//    }
    @Override
    public void displaydetails() {
        System.out.println("Name:"+this.getName());
        System.out.println("Health: "+this.getHealth());
    }
    @Override
    public void performSpecialMove(Combatant k) {
        int damage = (int)(k.getHealth()-10-(Math.random()*5));
        
        System.out.println(this.getName() + " has performed the Majhi Smacker to  "+ k.getName()+" by "+damage +" points. ");
        // first bug in operator precedence: messed with String-getHealth()+int-10 
        // subtracting 10 cause complie error : needed to bring into parentheses
        //type-casting to int: (int) needed
        k.healthDeplete(damage);
    }
}
