/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author safa
 */
public class GUI {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Wrong Password", "information",JOpt);
        JOptionPane.showMessageDialog(null, "Wrong Password", "information",1);
        JOptionPane.showMessageDialog(null, "Wrong Password", "information",2);
        ImageIcon icon = new ImageIcon("/home/safa/Documents/Netbeans/GUI/src/gui/images.png");
        //JOptionPane.showMessageDialog(null, "Wrong Password", "information",); // need claude for image show as icon
        
        // input add
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, name);
    }
    
}
