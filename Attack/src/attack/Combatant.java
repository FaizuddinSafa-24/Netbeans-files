/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package attack;

/**
 *
 * @author safa
 */
public class Combatant {

    private String name;
    private int health;

    public Combatant() {

    }

    public Combatant(String name, int health) {
        this.name = name;
        this.health = health;
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

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }

    public void recover() {
        this.health = 100;
    }

    public void performSpecialMove(Combatant k) {
        System.out.println("Run it from the instance of the Child Class!");
    }
    public void healthDeplete(int damage) {
        this.health= this.getHealth()-damage;
    }

    public static Combatant attack(Combatant k1, Combatant k2) {
        while (true) {
            int choice = (int) (Math.random() * 3);
            if (k1.getHealth() <= 0 || k2.getHealth() <= 0) {

                if (k1.getHealth() <= 0) {
                    System.out.println(k2.getName() + " is winner");
                    return k2;
                } else if (k2.getHealth() <= 0) {
                    System.out.println(k1.getName() + " is winner");
                    return k1;
                }
            } else {
                switch (choice) {
                    case 1:
                        k1.performSpecialMove(k2);
                        k1.displayDetails();
                        k2.displayDetails();
                        break;
                    case 2:
                        k2.performSpecialMove(k1);
                        k2.displayDetails();
                        k1.displayDetails();
                        break;
                }
            }
        }
    }
}
