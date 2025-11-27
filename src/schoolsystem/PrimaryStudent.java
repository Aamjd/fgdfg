/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

/**
 * PrimaryStudent – This class is the child class of Student and contains the details of the standard between Class 1 to Class 10.
 *
 * Relationship:
 * • Inheritance: Inherits from the abstract class Student.
 */
public class PrimaryStudent extends Student {


    // Constructor
    public PrimaryStudent( int id ,String studentName, int classId, String section, int busId) {
        // Calls the constructor of the base class (Student)
        super( id,studentName, classId, section, busId);
       
    }

    /**
     * Overrides StudentDetails() to add a Primary Student specific detail.
     */
    @Override
    public void StudentDetails() {
        super.StudentDetails(); // Calls the Student base method
        System.out.println("Note: This student belongs to Class 1 to 10 standards.");
    }
}