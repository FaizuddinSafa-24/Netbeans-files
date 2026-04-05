/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1_safa;

/**
 *
 * @author safa
 */
public class Performer {

    private String stageName;
    private String email;

    Performer() {
    }

    Performer(String stageName, String email) {
        this.stageName = stageName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getStageName() {
        return stageName;
    }

    public void showPerformerInfo() {
        System.out.println("Perfomer Name: "+getStageName());
        System.out.println("Email : "+getEmail());
    }
}
