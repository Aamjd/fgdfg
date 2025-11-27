/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

/**
 * HigherSecondaryStudent – This class is the child class of Student and contains the details of the standard Class 11 and Class 12.
 *
 * Relationship:
 * • Inheritance: Inherits from the abstract class Student.
 */
public class HigherSecondaryStudent extends Student {


    // Constructor
    public HigherSecondaryStudent( int id ,String studentName, int classId, String section, int busId) {
        // Calls the constructor of the base class (Student)
        super( id ,studentName, classId, section, busId);
  
    }

    /**
     * Overrides StudentDetails() to add a Higher Secondary specific detail.
     */
    @Override
    public void StudentDetails() {
        super.StudentDetails(); // Calls the Student base method
        System.out.println("Note: This student belongs to Class 11 or 12 standards.");
    }

 
}