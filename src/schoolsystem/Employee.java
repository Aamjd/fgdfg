/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

/**
   Employee – This class is the abstract base class of two child classes – Teacher and
   SupportStaff.
  
   Attributes:
   • EmployeeId – ID of the employee
   • EmployeeName – Name of the employee
   • Salary – Salary of the employee
   • DepartmentId – ID of the department the employee belongs to
  
   Methods:
   • EmployeeDetails() – (Abstract) This method displays the details of employees.
   • CheckIn() – This shows whether the particular employee is checked in.
   • ReceiveSalary() – This contains the salary details.
  
   Relationship:
   • Inheritance: Employee (Parent) -> Teacher (Child)
   • Inheritance: Employee (Parent) -> SupportStaff (Child)
 */
public abstract class Employee {
   // Attributes
    private int EmployeeId;
    private String EmployeeName;
    private int Salary; 
    private int DepartmentId;
    private boolean isCheckedIn;
    private boolean hasReceivedSalary;

    // Constructor
    public Employee(int EmployeeId, String EmployeeName, int Salary, int DepartmentId) {
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.Salary = Salary;
        this.DepartmentId = DepartmentId;
        this.isCheckedIn = false; 
        this.hasReceivedSalary = false; 
    }

    //(Abstract) Displays the details of the employee. Must be overridden by child classes (Teacher, SupportStaff) to provide specific designation.
    public abstract void EmployeeDetails();

    //Method to Mark the employee as checked in and prints a status message.
    public void CheckIn() {
        this.isCheckedIn = true;
        System.out.println("  Status: " + this.EmployeeName + " has checked in.");
    }

    //Method to Mark the employee as having received salary and prints details.
    public void ReceiveSalary() {
        this.hasReceivedSalary = true;
        System.out.println("  Salary Status: " + this.EmployeeName + " has received salary of $" + this.Salary);
    }
    
    // --- Getters and Setters ---------------------------------------------
    
    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(int DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    public boolean isIsCheckedIn() {
        return isCheckedIn;
    }

    public void setIsCheckedIn(boolean isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }

    public boolean isHasReceivedSalary() { 
        return hasReceivedSalary;
    }

    public void setHasReceivedSalary(boolean hasReceivedSalary) { 
        this.hasReceivedSalary = hasReceivedSalary;
    } 
}
