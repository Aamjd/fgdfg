/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * [cite_start]Classroom – This class contains the details of the classroom. [cite: 23]
 *
 * Attributes:
 * [cite_start]• ClassId – Unique identifier for the classroom. [cite: 49]
 * [cite_start]• ClassName – Name of the class (e.g., Grade 1A, Physics Lab). [cite: 49]
 * [cite_start]• TeacherId – ID of the teacher assigned to this classroom. [cite: 49]
 * [cite_start]• StudentCount – The current number of students in the class. [cite: 49]
 * [cite_start]• EquipmentId – ID linking to the ClassEquipments associated with this room. [cite: 49]
 *
 * Methods:
 * [cite_start]• ClassDetails() – Displays the details of the classroom. [cite: 63]
 *
 * Relationship:
 * [cite_start]• Unidirectional Association with Student (Student uses Classroom). [cite: 113]
 */
public class Classroom {

    // Attributes
    private int classId;
    private String className;
    private int teacherId;
    private int studentCount;
    // Holds ID equipment associated with the class.
    private int equipmentId;

    // Constructor to initialize classroom details


    public Classroom(int i, String className, int studentCount,int equipmentId) {
         this.classId = i;
         this.className = className;
         this.studentCount = studentCount;
         this.equipmentId = equipmentId;
    }  

    // Method to display the details of the classroom.
     
    public void ClassDetails() {
        System.out.println("\n--- Classroom Details ---");
        System.out.println("Class ID: " + classId);
        System.out.println("Class Name: " + className);
        System.out.println("Assigned Teacher ID: " +  teacherId);
        System.out.println("Current Student Count: " + studentCount);
        System.out.println("Equipment IDs: " + equipmentId);
        
         }
    
    // --- Getters and Setters -------------------------------------------------
 
public int getClassId() {
    return classId;
}


public String getClassName() {
    return className;
}


public int getTeacherId() {
    return teacherId;
}


public int getStudentCount() {
    return studentCount;
}

public int getEquipmentIds() { 
    return equipmentId;
}

public void setClassId(int classId) {
    this.classId = classId;
}


public void setClassName(String className) {
    this.className = className;
}


public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
}


public void setStudentCount(int studentCount) {
    this.studentCount = studentCount;
}

}