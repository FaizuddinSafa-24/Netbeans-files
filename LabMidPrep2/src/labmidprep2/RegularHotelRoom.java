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
        double baseFair = super.calculateTotalPrice(days);
        if (this.getHasAC() == true && this.getHasWifi() == true) {
            baseFair += 1000;
        return baseFair;
        } else if (this.getHasWifi() == true) {
            baseFair += 300;
        return baseFair;

        } else if (this.getHasAC() == true) {
            baseFair += 700;
        return baseFair;
        }
        else {
            
        return baseFair;
        }
    }
}
