/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.14.IP114
 */
public class Combatant  {

    private String name; // data fields must be private
    private int health;

    public Combatant() {

    }

    public Combatant(String name, int health) {
        this.health = health;
        this.name = name;
    }

    //getter/setter methd must be public, otherwise failure in accees/mutate
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
        System.out.println("Name:" + name);
        System.out.println("Health: " + health);
    }

    public void performSpecialMove(Combatant k) {
        System.out.println("Run it from the instance of the Child Class");
    }

    public void healthDeplete(int damage) {
        this.health = this.getHealth() - damage;
    }
    public static Combatant winner(Combatant k1, Combatant k2) {
        while (true) {
            //System.out.println(k1.getHealth());
            //for debug
            int choice = (int) Math.ceil(Math.random() * 2);
            if (k1.getHealth() <= 0 || k2.getHealth() <= 0) {
                if (k1.getHealth() <= 0) {
                    k2.recover();
                    
                    System.out.println(k2.getName() + " is winner.");
                    return k2;
                } else if (k2.getHealth() <= 0) {
                    k1.recover();
                    System.out.println(k1.getName() + " is winner.");
                    return k1;
                }
            } else {

                switch (choice) {
                    case 1:
                        k1.displaydetails();
                        k1.performSpecialMove(k2);
                        break;
                    case 2:
                        k2.displaydetails();
                        k2.performSpecialMove(k1);
                        break;

                }
            }
        }
        
        
    }
}
    

