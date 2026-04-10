/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmidprep1;

/**
 *
 * @author safa
 */
public class Manager extends Employee{

    private String department;
    private int employeeCount;
    
    public Manager() {
        
    }
    public Manager(String name,double salary, String dept, int empCount) {
        super(name, salary);
        this.department = dept;
        this.employeeCount =empCount;
    }
    public void setDept(String dept) {
        this.department = dept;
    }
    public String getDept() {
        return department;
    }
    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
    public int getEmployeeCount() {
        return employeeCount;
    }
    @Override
    public void displayInfo() {
        System.out.println("Name: "+super.getName());
        System.out.println("Salary: "+super.getSalary());
        System.out.println("Department: "+this.getDept());
        System.out.println("EmployeeCount: "+this.getEmployeeCount());
    }
    @Override
    public double calculatewBonus(double bonus) {
        bonus = super.calculatewBonus(bonus)+ 500;
        return bonus;
    }
}
