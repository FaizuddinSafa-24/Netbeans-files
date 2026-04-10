/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmidprep2;

/**
 *
 * @author safa
 */
public class HotelRoom {
    private String roomNumber;
    private double pricePerNight;
    private int numberOfBeds;
    
    public HotelRoom() {
        
    }
    public HotelRoom(String roomNumber,double pricePerNight, int numberOfBeds) {
        this.numberOfBeds= numberOfBeds;
        this.pricePerNight= pricePerNight;
        this.roomNumber= roomNumber;
    }
    public void setRoomNumber(String room) {
        this.roomNumber=room;
    }
    public String getRoomNumber() {
        return roomNumber;
    }
    public void setPricePerNight(double room) {
        this.pricePerNight=room;
    }
    public double getPricePerNight() {
        return pricePerNight; 
    }
    public void setnumberOfBeds(int beds) {
        this.numberOfBeds=beds;
    }
    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    
    public void displayInfo() {
        System.out.println("Room Number: "+this.getRoomNumber());
        System.out.println("Price Per Night: "+this.getPricePerNight());
        System.out.println("Number of Beds : "+this.getNumberOfBeds());
    }
    public double calculateTotalPrice(int days) {
        return (pricePerNight * numberOfBeds);
    }
}
