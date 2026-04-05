/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1_safa;

/**
 *
 * @author safa
 */
public class TestProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Performer performer1 = new Performer("DJ Nova", "nova@beats.com");
        Performer performer2 = new Performer("Luna Echo", "luna@music.com");
        Concert[] c = new Concert[2];
        c[0] = new Concert("Midnight Beats", "CN101", performer1);
        c[1] = new Concert("Echo Vibes", "CN102", performer2);
        Attendee[] a = new Attendee[2];
        a[0] = new Attendee("Ayaan", 4123, c[0]);
        a[1] = new Attendee("Zara", 4187, c[1]);
        for( int i= 0; i <a.length; i++) {
            a[i].displayAttendeeInfo();
            c[i].displayConcertDetails();
            System.out.println("");
        }
    }

}
