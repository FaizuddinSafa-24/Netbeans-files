/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1_safa;

/**
 *
 * @author safa
 */
public class Attendee extends Concert {

    private String attendeeName;
    private int ticketNumber;
    private Concert concert;

    Attendee() {
    }

    Attendee(String attendeeName, int ticketNumber, Performer perfomer) {
        super(perfomer);
        this.attendeeName = attendeeName;
        this.ticketNumber = ticketNumber;
    }

    public void attendConcert(Concert concert) {
        this.concert = concert;
    }

    public void viewConcertDetails() {
    }

    public void displayAttendeeInfo() {
        System.out.println("The attendee name: " + this.attendeeName);
        System.out.println("The concert name: " + this.attendeeName);
    }
}
