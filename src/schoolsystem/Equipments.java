/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

/**
 * Equipments – This class is the abstract base class of two child classes: LabEquipment and ClassEquipments[cite: 37].
 *
 * Attributes:
 * • EquipmentId – Unique identifier for the equipment[cite: 53].
 * • Cost – The monetary cost of the equipment[cite: 53].
 *• • status - gives the state of the equipment to check whether its need to fix or not
 * Methods:
 * • EquipmentDetails() – Contains the details of equipment in the lab and also the equipment of class[cite: 90].
 * • PurchaseEquipment() – To purchase the equipment and contains the details of newly purchased equipment[cite: 91].
 * • Repair() – To repair any equipment[cite: 92].
 *
 * Relationship:
 * • Inheritance: Base class for LabEquipment and ClassEquipment.
 * • Composition with Lab (Equipment cannot exist without Lab)[cite: 139, 140].
 */
public abstract class Equipments {

    // Attributes
    private int equipmentId; // EquipmentId [cite: 53]
    private double cost;        // Cost [cite: 53]
    private String status = "Good";      // Status: Good, Under Repair, Disposed

    // Constructor (Used by child classes)
    
    public Equipments(int equipmentId) {
        this.equipmentId = equipmentId;
        this.status = "Good";
    }
    

    /**
     * Displays general details of the equipment (abstract for specific details).
     */
    public void EquipmentDetails() {
        System.out.println("--- General Equipment Details ---");
        System.out.println("Equipment ID: " + equipmentId);
        System.out.println("Cost: " + cost + " SAR");
        System.out.println("Status: " + status);
    }

    /**
     * Simulates the purchase of new equipment[cite: 91].
     */
    public void PurchaseEquipment(int newEquipmentId, double newCost) {
        System.out.println("\n--- Purchase Operation ---");
        System.out.println("New Equipment Purchased:");
        System.out.println("  ID: " + newEquipmentId + ", Cost: " + newCost + " SAR");
        // In a real system, this would create a new instance, or update inventory.
    }

    /**
     * Method to repair any equipment[cite: 92].
     */
    public void Repair() {
        if (this.status.equals("Under Repair")) {
            this.status = "Good";
            System.out.println("Equipment ID " + equipmentId + " repaired successfully. Status set to 'Good'.");
        } else if (this.status.equals("Good")) {
            System.out.println("Equipment ID " + equipmentId + " is already in good condition.");
        } else {
            this.status = "Under Repair";
            System.out.println("Equipment ID " + equipmentId + " is now marked 'Under Repair'.");
        }
    }
    
    // --- Getters and Setters -------------------------------------------------
   
public int getEquipmentId() {
    return equipmentId;
}


public double getCost() {
    return cost;
}
 

public String getStatus() {
    return status;
}


public void setEquipmentId(int equipmentId) {
    this.equipmentId = equipmentId;
}


public void setCost(double cost) {
    this.cost = cost;
}
 

public void setStatus(String status) {
    this.status = status;
}

}