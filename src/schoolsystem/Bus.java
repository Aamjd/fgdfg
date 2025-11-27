/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Bus – This class displays the details of the bus for each area.
 *
 * Attributes:
 * • BusId – ID of the bus
 * • DriverId – ID of the driver
 * • AreaList – List of areas the bus visits
 * • BusNumber – The number plate or identifying number of the bus
 * • Capacity – Total number of seats
 * • seatsOccupied – (Helper) Number of seats currently taken
 *
 * Methods:
 * • BusDetails() – Contains the details of the bus.
 * • ShowSeats() – Shows the seat details in a particular bus.
 */
public class Bus {
   // Attributes
    private int BusId;
    private int DriverId;
    private List<String> AreaList;
    private String BusNumber;
    private int Capacity;
    private int seatsOccupied; 

    // Constructor
    public Bus(int BusId, int DriverId, String BusNumber, int Capacity) {
        this.BusId = BusId;
        this.DriverId = DriverId;
        this.BusNumber = BusNumber;
        this.Capacity = Capacity;
        this.AreaList = new ArrayList<>(); 
        this.seatsOccupied = 0; 
    }

    // Displays all details for this bus.
    public void BusDetails() {
        System.out.println("  --- Bus Details ---");
        System.out.println("  Bus Number: " + this.BusNumber + " (ID: " + this.BusId + ")");
        System.out.println("  Driver ID: " + this.DriverId);
        System.out.println("  Areas: " + this.AreaList);
        // Call ShowSeats() internally to show seat info
        ShowSeats();
    }

    //Shows the seat details (total, occupied, available).
    public void ShowSeats() {
        int available = this.Capacity - this.seatsOccupied;
        System.out.println("  Seat Status: " + this.seatsOccupied + " Occupied, " + available + " Available (Total: " + this.Capacity + ")");
    }

    
    // Adds a new area/stop to the bus route.
    public void addArea(String areaName) {
        this.AreaList.add(areaName);
    }
    
    // Simulates assigning seats (for testing).
    public void assignSeats(int count) {
        if (this.seatsOccupied + count <= this.Capacity) {
            this.seatsOccupied += count;
        } else {
            System.out.println("  Error: Cannot assign " + count + " seats. Only " + (this.Capacity - this.seatsOccupied) + " left.");
        }
    }

    // --- Getters and Setters ---------------------------------------------
    
    public int getBusId() {
        return BusId;
    }

    public String getBusNumber() {
        return BusNumber;
    } 
}
