/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

/**
 * Student – This class is the abstract base class of two child classes: PrimaryStudent and HigherSecondaryStudent[cite: 24, 25].
 *
 * Attributes:
 * • StudentId – Unique identifier for the student.
 * • StudentName – Name of the student.
 * • ClassId – The class the student belongs to.
 * • Section – The section within the class.
 * • BusId – The ID of the bus the student uses (Unidirectional Association with Bus).
 *••feesPaid is a boolean attribute used to determine whether the student has paid their tuition fees (true) or if they are still outstanding (false).
 
 * Methods:
 * • StudentDetails() – Displays the personal details and class information of the student[cite: 64].
 * • PayFees() – Shows fee details and allows the student to pay the fees[cite: 65].
 *
 * Relationship:
 * • Inheritance: Base class for PrimaryStudent and HigherSecondaryStudent.
 * • Unidirectional Association with Classroom, Bus, Playground, and NoticeBoard[cite: 113, 114, 115, 116].
 * • Aggregation with SchoolManagement and Teacher (Student can exist without them)[cite: 128, 131, 134].
 */
public abstract class Student {

    // Attributes
    private int studentId;
    private String studentName;
    private int classId;
    private String section;
    private int busId;
    private boolean feesPaid;

    // Constructor 
    public Student(int studentId, String studentName, int classId, String section, int busId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.classId = classId;
        this.section = section;
        this.busId = busId;
        this.feesPaid = false; 
    }
    
   

    
    // Method to display student details
    public void StudentDetails() {
        System.out.println("--- Student Details ---");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Class ID: " + classId);
        System.out.println("Section: " + section);
        System.out.println("Bus ID: " + busId );
        System.out.println("Fees Status: " + (feesPaid ? "Paid" : "Outstanding"));
        // Additional details specific to child classes will be added in their respective implementations.
    }

    // Method to handle fees payment
    public void PayFees(double amount) {
        System.out.println("\n--- Fee Payment for " + studentName + " ---");
        // In a real system, this would check the due amount. Here, we simulate payment.
        if (!feesPaid && amount > 0) {
            this.feesPaid = true;
            System.out.println("Received: " + amount + " SAR. Fees successfully paid.");
        } else if (feesPaid) {
            System.out.println("Fees have already been paid for this term.");
        } else {
            System.out.println("Payment amount must be greater than zero.");
        }
    }

    // --- Getters and Setters -------------------------------------------------

public int getStudentId() {
    return studentId;
}

public String getStudentName() {
    return studentName;
}

public int getClassId() {
    return classId;
}

public String getSection() {
    return section;
}

public int getBusId() {
    return busId;
}

public boolean isFeesPaid() {
    return feesPaid;
}

public void setStudentId(int studentId) {
    this.studentId = studentId;
}

public void setStudentName(String studentName) {
    this.studentName = studentName;
}

public void setClassId(int classId) {
    this.classId = classId;
}

public void setSection(String section) {
    this.section = section;
}

public void setBusId(int busId) {
    this.busId = busId;
}

public void setFeesPaid(boolean feesPaid) {
    this.feesPaid = feesPaid;
}
}