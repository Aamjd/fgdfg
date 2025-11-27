/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

/**
 * LabEquipment – This class is the child class of Equipment and it contains the details of
 * all the equipment needed for the lab like test tubes, microscope, computers, etc.
 *
 * Attributes:
 * • EquipmentName – The name of the specific equipment[cite: 54].
 * • EquipmentCount – The number of units of this equipment available[cite: 54].
 *
 * Relationship:
 * • Inheritance: Inherits from the abstract class Equipments.
 */
public class LabEquipments extends Equipments {

    // Lab Equipment-specific attributes
    private String equipmentName;  // EquipmentName [cite: 54]
    private int equipmentCount;    // EquipmentCount [cite: 54]

    // Constructor
  
    
    public LabEquipments(int equipmentId, String equipmentName, int equipmentCount) {
        // Calls the constructor of the base class (Equipments)
        super(equipmentId);
        this.equipmentName = equipmentName;
        this.equipmentCount = equipmentCount;
    }

    /**
     * Overrides EquipmentDetails() to add Lab-specific details.
     */
    @Override
    public void EquipmentDetails() {
        super.EquipmentDetails(); // Calls the Equipments base method
        System.out.println("Equipment Name: " + equipmentName);
        System.out.println("Available Count: " + equipmentCount);
        System.out.println("Category: Lab Equipment");
    }

    // --- Getters and Setters -------------------------------------------------
    public String getEquipmentName() {
        return equipmentName;
    }
     public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public int getEquipmentCount() {
        return equipmentCount;
    }

    public void setEquipmentCount(int equipmentCount) {
        this.equipmentCount = equipmentCount;
    }
}