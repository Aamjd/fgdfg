/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;
import java.util.ArrayList; // (إضافة جديدة)
import java.util.List;     // (إضافة جديدة)
/**
   Teacher – This class is the child class of Employee and contains the details
   of the teachers.
  
   Attributes:
   • (Inherited from Employee)
   • subject – The subject taught by the teacher.
 
   Methods:
   • EmployeeDetails() – (Overridden) Displays the details of the teacher.
 
   Relationship:
   • Inheritance: Teacher (Child) -> Employee (Parent)
 */
public class Teacher extends Employee {
    // Attributes
    private String subject; 
// A teacher is responsible for a list of students
    private List<Student> assignedStudents;
    // Constructor
 
    
     public Teacher(int EmployeeId, String EmployeeName, int Salary, int DepartmentId) {
        // Calling the parent class (Employee) constructor
        super(EmployeeId, EmployeeName, Salary, DepartmentId);
        this.assignedStudents = new ArrayList<>();
     }

    // Method to Displays the specific details for a Teacher, including designation and subject.
    @Override
    public void EmployeeDetails() {
        System.out.println("  --- Teacher Details ---");
        System.out.println("  ID: " + getEmployeeId()); 
        System.out.println("  Name: " + getEmployeeName());
        System.out.println("  Designation: Teacher"); 
        System.out.println("  Subject: " + this.subject);
        System.out.println("  Salary: $" + getSalary());
        System.out.println("  Department ID: " + getDepartmentId());
    }
    
    // --- Methods to manage students ---

    /**
     * Assigns a student to this teacher's roster.
     * @param student The student object to add.
     */
    public void assignStudent(Student student) {
        if (student != null && !this.assignedStudents.contains(student)) {
            this.assignedStudents.add(student);
            System.out.println("Student " + student.getStudentName() + " assigned to " + getEmployeeName());
        }
    }

    // --- Getters and Setters ---------------------------------------------
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    
    public List<Student> getAssignedStudents() {
        return assignedStudents;
    }
}
