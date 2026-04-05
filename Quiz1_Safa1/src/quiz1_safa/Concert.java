/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1_safa;

/**
 *
 * @author safa
 */
public class Concert extends Performer {

    private String name;
    private String concertCode;
    Performer performer;

    Concert() {
    }

    Concert(Performer performer) {
        this.performer = performer;
    }

    Concert(String name, String concertCode, Performer performer) {
        super(performer.getStageName(), performer.getEmail());
        this.name = name;
        this.concertCode = concertCode;
        this.performer = performer;
    }

    public String getName() {
        return name;
    }

    public String getConcertCode() {
        return concertCode;
    }

    public Performer getPerformer() {
        return performer;
    }

    public void displayConcertDetails() {
    }
}
