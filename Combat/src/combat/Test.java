/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.14.IP114
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Combatant k2 = new MartialArtist("Sujon Majhi", 100);
        Combatant k1 = new SuperSoldier("Vikram Rathore", 100);
        while (true) {
            //System.out.println(k1.getHealth());
            //for debug
            int choice = (int) Math.ceil(Math.random() * 2);
            if (k1.getHealth() <= 0 || k2.getHealth() <= 0) {
                if (k1.getHealth() <= 0) {
                    k2.recover();
                    System.out.println(k2.getName() + " is winner.");
                    break;
                } else if (k2.getHealth() <= 0) {
                    k1.recover();
                    System.out.println(k1.getName() + " is winner.");
                    break;
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

        // another fight
        
            Combatant k3 = new SuperAgent("Tiger", 100);
            Combatant k4;
            int check = 0;
            if(k1.getHealth() > k2.getHealth()) {
                check =1;
            } else {
                check =2;
            }
               
            k1.getHealth();
            k2.getHealth();
        while (true) {
            //System.out.println(k1.getHealth());
            //for debug
            if (check ==1) {
                k4 = (Combatant) k1.clone();
            } else {
                k4 = (Combatant) k2.clone();
                
            }
            int choice = (int) Math.ceil(Math.random() * 2);
            if (k3.getHealth() <= 0 || k4.getHealth() <= 0) {
                if (k3.getHealth() <= 0) {
                    System.out.println(k4.getName() + " is winner.");
                    break;
                } else if (k4.getHealth() <= 0) {
                    System.out.println(k3.getName() + " is winner.");
                    break;
                }
            } else {

                switch (choice) {
                    case 1:
                        k3.displaydetails();
                        k3.performSpecialMove(k4);
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
