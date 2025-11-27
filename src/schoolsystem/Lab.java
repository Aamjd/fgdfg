/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab – This class contains the lab details of any school with its necessary information.
 *
 * Attributes:
 * • LabId – Unique identifier for the lab.
 * • InchargeId – ID of the employee responsible for the lab.
 * • LabName – Name of the lab (e.g., Chemistry Lab, Computer Lab).
 * • EquipmentId –  list of Equipments inside the lab.
 *
 * Methods:
 * • LabDetails() – Shows the details of the lab and its in charge name.
 * • IsOccupied() – Tells whether the lab is occupied or not.
 * • PayFine() – Shows the fine details of a particular student who breaks or damages any equipment in the lab.
 *
 * Relationship:
 * • Composition with Equipments (Equipment cannot exist without Lab).
 */
public class Lab {

    // Attributes
    private int labId;
    private int inchargeId;
    private String labName;
    private int equipmentId; // EquipmentId of the *collection* of equipment
    private boolean isOccupied;
    
    // --- Composition Relationship ---
    // Lab "owns" its equipment; they are essential parts of the Lab.
    private List<Equipments> EquipmentsList;

    // Constructor to initialize lab details
    public Lab(int labId, int inchargeId, String labName, int equipmentId, List<Equipments> EquipmentsLis) {
        this.labId = labId;
        this.inchargeId = inchargeId;
        this.labName = labName;
        this.equipmentId = equipmentId;
        this.isOccupied = false; 
        this.EquipmentsList = EquipmentsLis;    }
    
     public Lab(int labId, String labName, List<Equipments> EquipmentsLis) {
        this.labId = labId;
        this.labName = labName;
        this.EquipmentsList = EquipmentsLis;
     }

    
    /**
     * Method to display the details of the lab and its in charge name[cite: 69].
     */
    public void LabDetails() {
        System.out.println("\n--- Lab Details ---");
        System.out.println("Lab ID: " + labId);
        System.out.println("Lab Name: " + labName);
        System.out.println("In Charge ID:   :" + inchargeId);
        System.out.println("Status: " + isOccupied);
        System.out.println("Equipment Collection ID: " + equipmentId);
    }

    /**
     * Method that tells whether the lab is occupied or not[cite: 70].
     * @return true if occupied, false otherwise.
     */
    public void isOccupied() {
        if (this.isOccupied) {
            System.out.println(" currently occupied ");
        } else {
            System.out.println("is avalible");
        }
    }

    //Method to show the fine details of a particular student who breaks or damages any equipment in the lab[cite: 71].
   
    public void PayFine(String studentId, double fineAmount, String damageDescription) {
        System.out.println("\n--- Lab Damage Fine Details ---");
        System.out.println("Student ID: " + studentId);
        System.out.println("Damage Description: " + damageDescription);
        if (fineAmount > 0) {
            System.out.println("Fine Amount Due: " + fineAmount + " SAR.");
            // In a real system, payment processing or recording would occur here.
            System.out.println("Fine recorded and payment processed.");
        } else {
            System.out.println("No fine levied for this incident.");
        }
    }
    
  
    

    // --- Getters and Setters -------------------------------------------------
    public int getLabId() {
        return labId;
    }

    public int getInchargeId() {
        return inchargeId;
    }

    public void setInchargeId(int inchargeId) {
        this.inchargeId = inchargeId;
    }

    public String getLabName() {
        return labName;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public List<Equipments> getLabEquipmentsList() {
        return EquipmentsList;
    }
   
    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
}