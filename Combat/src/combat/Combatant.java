/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.14.IP114
 */
public class Combatant {
    String name;
    private int health;
    public Combatant() {
        
    }
    public Combatant(String name, int health) {
        this.health = health;
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void recover() {
        this.health = 100;
    }
    public void displaydetails() {
        System.out.println("Name:"+name);
        System.out.println("Health: "+health);
    }
    public void performSpecialMove(Combatant k) {
        System.out.println("Run it from the instance of the Child Class");
    }
} 
