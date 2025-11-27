/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

/**
 * Class Equipment – This class is the child class of Equipment and it contains the details of
 * all the equipment needed for any classroom like fan, bench, light.
 *
 * Attributes:
 * • ClassId – The class ID this equipment is assigned to[cite: 55].
 * • BenchCount – Number of benches[cite: 55].
 * • FanCount – Number of fans[cite: 55].
 * • LightCount – Number of lights[cite: 55].
 *
 * Relationship:
 * • Inheritance: Inherits from the abstract class Equipments.
 */
public class ClassEquipments extends Equipments {

    // Class Equipment-specific attributes
    private int classId;       // ClassId [cite: 55]
    private int benchCount;      // BenchCount [cite: 55]
    private int fanCount;        // FanCount [cite: 55]
    private int lightCount;      // LightCount [cite: 55]

    // Constructor
    
    public ClassEquipments( int equipmentId ,int classId, int benchCount, int fanCount, int lightCount) {
        // Calls the constructor of the base class (Equipments)
        super(equipmentId);
        this.classId = classId;
        this.benchCount = benchCount;
        this.fanCount = fanCount;
        this.lightCount = lightCount;
    }
        
     public ClassEquipments( int equipmentId , int benchCount, int fanCount, int lightCount) {
        // Calls the constructor of the base class (Equipments)
        super(equipmentId);
        this.benchCount = benchCount;
        this.fanCount = fanCount;
        this.lightCount = lightCount;
    }
  

    /**
     * Overrides EquipmentDetails() to add Classroom-specific details.
     */
    @Override
    public void EquipmentDetails() {
        super.EquipmentDetails(); // Calls the Equipments base method
        System.out.println("Assigned Class ID: " + classId);
        System.out.println("Bench Count: " + benchCount);
        System.out.println("Fan Count: " + fanCount);
        System.out.println("Light Count: " + lightCount);
        System.out.println("Category: Class Equipment");
    }

    // --- Getters and Setters -------------------------------------------------
    public int getClassId() {
        return classId;
    }
    
    public int getBenchCount() {
        return benchCount;
    }

    public int getFanCount() {
        return fanCount;
    }

    public int getLightCount() {
        return lightCount;
    }

    public void setBenchCount(int benchCount) {
        this.benchCount = benchCount;
    }

    public void setFanCount(int fanCount) {
        this.fanCount = fanCount;
    }

    public void setLightCount(int lightCount) {
        this.lightCount = lightCount;
    }
}