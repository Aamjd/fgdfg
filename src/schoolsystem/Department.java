/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

import java.util.ArrayList;
import java.util.List;

/**
   Department – This class contains the details of the department in the School.
  
   Attributes:
   • DepartmentId – ID of the department
   • DepartmentName – Name of the department
   • InchargeName – Name of the person in charge
   • MemberList – List of members in the department
 
   Methods:
   • DepartmentDetails() – Displays the details of this department.
 */
public class Department {
    // Attributes
    private int DepartmentId;
    private String DepartmentName;
    private String InchargeName;
    private List<String> MemberList; 

    // Constructor
    public Department(int DepartmentId, String DepartmentName, String InchargeName) {
        this.DepartmentId = DepartmentId;
        this.DepartmentName = DepartmentName;
        this.InchargeName = InchargeName;
        this.MemberList = new ArrayList<>(); 
    }

    // Method to display department details
    public void DepartmentDetails() {
        System.out.println("  --- Department Details ---");
        System.out.println("  Department ID: " + DepartmentId);
        System.out.println("  Department Name: " + DepartmentName);
        System.out.println("  In Charge: " + InchargeName);
        if (MemberList.isEmpty()) {
            System.out.println("  Members: No members listed.");
        } else {
            System.out.println("  Members: " + MemberList);
        }
    }
    
    // Helper method to add members
    public void addMember(String memberName) {
        this.MemberList.add(memberName);
    }

    // --- Getters and Setters ---------------------------------------------

    public int getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(int DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public String getInchargeName() {
        return InchargeName;
    }

    public void setInchargeName(String InchargeName) {
        this.InchargeName = InchargeName;
    }

    public List<String> getMemberList() {
        return MemberList;
    }

    public void setMemberList(List<String> MemberList) {
        this.MemberList = MemberList;
    }
}
