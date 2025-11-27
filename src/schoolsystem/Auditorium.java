/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

/**
   Auditorium – This class contains the details of the auditorium of the school 
   and the details associated with it.
 
   Attributes:
   • TotalSeats – Total number of seats
   • SeatsOccupied – Number of seats occupied for the event
   • EventName – Name of the event
   • EventDate – Date of the event
   • EventTime – Time of the event
   • isBooked – (Helper) Tracks if the auditorium is currently booked
   • bookingDepartment – (Helper) Tracks which department booked it
 
   Methods:
   • BookAuditorium() – Books the auditorium for an event.
   • EventDetails() – Shows the details of the currently booked event.
   • DisplaySeats() – Displays available seats.
 */
public class Auditorium {
   // Attributes
    private int TotalSeats;
    private int SeatsOccupied;
    private String EventName;
    private String EventDate;
    private String EventTime;
    private boolean isBooked;
    private String bookingDepartment;

    // Constructor
    public Auditorium(int TotalSeats) {
        this.TotalSeats = TotalSeats;
        this.isBooked = false; 
        this.SeatsOccupied = 0;
        this.EventName = "Available"; 
        this.EventDate = "N/A";
        this.EventTime = "N/A";
        this.bookingDepartment = "N/A";
    }

    // --- Methods ---
    
    // Method to Book the auditorium for a department if it is not already booked.

    public void BookAuditorium(String eventName, String eventDate, String eventTime, int requiredSeats, String deptName){
        if (this.isBooked) {
            // Check if it's already booked
            System.out.println("Booking Failed: Auditorium is already booked for '" + this.EventName + "' on " + this.EventDate);
        } else if (requiredSeats > this.TotalSeats) {
            // Check if seats required are too many
            System.out.println("Booking Failed: Required seats (" + requiredSeats + ") exceeds total capacity (" + this.TotalSeats + ").");
        } else {
            // Process the booking
            this.EventName = eventName;
            this.EventDate = eventDate;
            this.EventTime = eventTime;
            this.SeatsOccupied = requiredSeats;
            this.bookingDepartment = deptName;
            this.isBooked = true;
            
            System.out.println("Booking Success: Auditorium booked for '" + this.EventName + "' on " + eventDate + ".");
        }
    }

    //Method to Display the details of the event currently booked in the auditorium.
     
    public void EventDetails() {
        System.out.println("  --- Auditorium Event Details ---");
        if (isBooked) {
            System.out.println("  Event: " + this.EventName);
            System.out.println("  Booked By: " + this.bookingDepartment);
            System.out.println("  Date: " + this.EventDate);
            System.out.println("  Time: " + this.EventTime);
        } else {
            System.out.println("  The auditorium is currently available.");
        }
    }

    //Method to Display the total, occupied, and available seats.
     
    public void DisplaySeats() {
        int availableSeats = this.TotalSeats - this.SeatsOccupied;
        
        System.out.println("  --- Auditorium Seat Details ---");
        System.out.println("  Total Seats: " + this.TotalSeats);
        System.out.println("  Occupied Seats: " + this.SeatsOccupied);
        System.out.println("  Available Seats: " + availableSeats);
    }
    
    // Method to Cancel the current booking and makes the auditorium available.
     
    public void cancelBooking() {
        if (isBooked) {
            System.out.println("Booking Canceled: '" + this.EventName + "' has been canceled.");
            this.isBooked = false;
            this.SeatsOccupied = 0;
            this.EventName = "Available";
            this.EventDate = "N/A";
            this.EventTime = "N/A";
            this.bookingDepartment = "N/A";
        } else {
            System.out.println("Auditorium is already available.");
        }
    }

    // --- Getters and Setters ---------------------------------------------
    public int getTotalSeats() {
        return TotalSeats;
    }

    public int getSeatsOccupied() {
        return SeatsOccupied;
    }

    public String getEventName() {
        return EventName;
    }

    public String getEventDate() {
        return EventDate;
    }

    public String getEventTime() {
        return EventTime;
    }

    public boolean isIsBooked() {
        return isBooked;
    } 
}
