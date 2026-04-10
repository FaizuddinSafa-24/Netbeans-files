/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmidprep2;

/**
 *
 * @author safa
 */
public class RegularHotelRoom extends HotelRoom {

    private boolean hasWifi, hasAC;

    public RegularHotelRoom() {

    }

    public RegularHotelRoom(String roomNumber, double pricePerNight, int numberOfBeds, boolean hasWifi, boolean hasAC) {
        super(roomNumber, pricePerNight, numberOfBeds);
        this.hasAC = hasAC;
        this.hasWifi = hasWifi;
    }

    public boolean getHasWifi() {
        return hasWifi;
    }

    public boolean getHasAC() {
        return hasAC;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("HasAC: " + this.getHasAC());
        System.out.println("HasWifi: " + this.getHasWifi());
    }

    @Override
    public double calculateTotalPrice(int days) { 
        double extra =0;
        if (hasAC && hasWifi) {
            extra += 1000;
        
        } else if (hasWifi) {
            extra += 300;
        

        } else if (hasAC) {
            extra += 700;
        
        }
        else {
            extra =0;
        }
        System.out.println((super.getPricePerNight()+extra)* days);
        return ((getPricePerNight()+extra)* days);
    }
}
