/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Playground – This class contains the details of the playground of any school,
 * and it also shows whether the playground is occupied or not. [cite: 47]
 *
 * Attributes:
 * • Area – The size or area description of the playground. [cite: 56]
 * • ClassId – Optionally indicates which class is currently occupying the playground. [cite: 56]
 *••isOccupied - boolean attribute thats give whether the playground is occupied or not
 * Methods:
 * • IsOccupied() – Checks whether the playground is currently occupied or not. [cite: 98]
 *
 * Relationship:
 * • Aggregation with SchoolManagement (Playground can exist without School). [cite: 129, 134]
 * • Unidirectional Association with Student (Student uses Playground). 
 */
public class Playground {

    // Attributes
    private double area;
    private int classId; // Can be null/empty if not occupied
    private boolean isOccupied;
    

    // Constructor to initialize playground details
      public Playground(double area) {
        this.area = area;
          
    }
   

    /**
     * Method to check whether the playground is occupied or not. [cite: 98]
     */
    
    public void isOccupied() {
        if (this.isOccupied) {
            System.out.println("Playground is currently occupied ");
        } else {
            System.out.println("Playground is avalible");
        }
    }
   

    // --- Getters and Setters -------------------------------------------------
    public double getArea() {
        return area;
    }
    
    public int getClassId() { 
        return classId; 
    }
   
    public boolean getisOccupied(){
        return isOccupied;
    }
     public void setClassId(int classId) { 
        this.classId = classId; 
    }
      public void setArea(double area) {
        this.area = area;
    }
    
     public void setisOccupied(boolean isOccupied){
         this.isOccupied = isOccupied;
    }
}
