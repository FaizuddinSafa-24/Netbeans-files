/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 602.14.IP114
 */
public class Test {
    public static void main(String[] args) {
        Combatant combat = new Combatant("Jhantu Khan",100);
        combat.displaydetails();
        combat.performSpecialMove(combat);
        
        combat = new MartialArtist("Sujon Majhi",100);
        combat.performSpecialMove(combat);
        
    }
}
