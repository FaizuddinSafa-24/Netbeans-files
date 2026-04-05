/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1_safa;

/**
 *
 * @author safa
 */
public class Attendee  {

    private String attendeeName;
    private int ticketNumber;
    private Concert concert;

    Attendee() {
    }

    Attendee(String attendeeName, int ticketNumber, Concert concert) {
        this.concert = concert;
        this.attendeeName = attendeeName;
        this.ticketNumber = ticketNumber;
    }

    public void attendConcert(Concert concert) {
        this.concert = concert;
    }

    public void viewConcertDetails() {
        System.out.println("The concert name: ");
        this.concert.displayConcertDetails();
    }

    public void displayAttendeeInfo() {
        System.out.println("The attendee name: " + this.attendeeName);
    }
}
