/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

/**
   SupportStaff – This class is the child class of Employee and contains the
   details of the support staff.
 
   Attributes:
   • (Inherited from Employee)
   • role – The specific role of the support staff (e.g., Bus Driver, Admin).
 
   Methods:
   • EmployeeDetails() – (Overridden) Displays the details of the support staff.
  
   Relationship:
   • Inheritance: SupportStaff (Child) -> Employee (Parent)
 */
public class SupportStaff extends Employee{
    // Attributes
    private String role; // Additional attribute for SupportStaff

    // Constructor

    
    public SupportStaff(int EmployeeId, String EmployeeName, int Salary, int DepartmentId) {
        // Calling the parent class (Employee) constructor
        super(EmployeeId, EmployeeName, Salary, DepartmentId);
       
    }

    // --- Overridden Method ---
    /**
     * Displays the specific details for a Support Staff member,
     * including designation and role.
     */
    @Override
    public void EmployeeDetails() {
        System.out.println("  --- Support Staff Details ---");
        System.out.println("  ID: " + getEmployeeId()); 
        System.out.println("  Name: " + getEmployeeName());
        System.out.println("  Designation: Support Staff"); 
        System.out.println("  Role: " + this.role);
        System.out.println("  Salary: $" + getSalary());
        System.out.println("  Department ID: " + getDepartmentId());
    }

    // --- Getters and Setters ---------------------------------------------
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
