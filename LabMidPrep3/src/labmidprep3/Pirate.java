/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmidprep3;

/**
 *
 * @author safa
 */
public class Pirate {
    private String pirateName, country;
    
    public Pirate() {
        
    }
    public Pirate(String name , String country) {
        this.pirateName= name;
        this.country = country;
    }
    public void setPirateName(String pirateName) {
        this.pirateName =pirateName;
    }
    public String getPirateName () {
        return pirateName;
    }
    public void setCountry(String country) {
        this.country =country;
    }
    public String getCountry () {
        return country;
    }
}
