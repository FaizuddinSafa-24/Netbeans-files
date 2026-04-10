/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmidprep1;

/**
 *
 * @author safa
 */
public class Employee {
    private String name;
    private double salary;
    
    public Employee() {
        
    }
    public Employee(String name, double salary) {
        this.name = name;
        this.salary= salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void displayInfo() {
        System.out.println("Name: "+this.getName());
        System.out.println("Salary: "+this.getSalary());
    }
    public double calculatewBonus(double bonus) {
        this.salary = this.getSalary()+(int) Math.ceil(Math.random()*bonus);
        return salary;
    }
    
}
