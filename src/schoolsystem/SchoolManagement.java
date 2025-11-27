/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * SchoolManagement – This class contains the overall details of the school.
 *
 * Attributes: • schoolName – Name of the school • address – Location of the
 * school • contactNumber – Contact number of the school • mediumOfStudy –
 * Language or medium of instruction
 *
 * Methods: • isOpen() – Checks whether the school is open or not. •
 * schoolDetails() – Displays the details of the school such as its name,
 * region, and address.
 *
 * Relationship: • Composition between SchoolManagement and Department (School
 * Owns-a list of Departments) • Unidirectional Association between
 * SchoolManagement and Auditorium (SchoolManagement "uses" Auditorium). •
 * Aggregation between SchoolManagement and Buses ( School "has a" list of Buses)
 */
public class SchoolManagement {

    // Attributes
    private String schoolName;
    private String address;
    private int contactNumber;
    private String mediumOfStudy;
    private boolean isSchoolOpen;

    // --- Relationships ---
    private Auditorium auditorium; // Association (will be passed in)
    private List<Department> departments; // Composition
    private List<Bus> schoolBuses;        // Aggregation
    private Playground playground;        // Aggregation 
    private NoticeBoard noticeBoard;      // Association 
    private List<Student> students;       // Aggregation 
    private List<Classroom> classrooms;   // Aggregation 
    private List<Lab> labs;               // Aggregation 
    private List<Employee> employees;     // Aggregation 
    
    // Constructor
    public SchoolManagement(String schoolName, String address, int contactNumber, String mediumOfStudy) {
        this.schoolName = schoolName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.mediumOfStudy = mediumOfStudy;

        // Initialize state
        this.isSchoolOpen = true;

        // Initialize all lists
        this.departments = new ArrayList<>();
        this.schoolBuses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.classrooms = new ArrayList<>();
        this.labs = new ArrayList<>();
        this.employees = new ArrayList<>();

        // 'auditorium', 'playground', etc. will be set by initialize()
    }

    // Method to Initialize the school with externally created objects.
    public void initialize(Auditorium auditorium, Playground playground, NoticeBoard noticeBoard,
            List<Classroom> classrooms, List<Lab> labs, List<Employee> employees) {
        this.auditorium = auditorium;
        this.playground = playground;
        this.noticeBoard = noticeBoard;
        this.classrooms = classrooms;
        this.labs = labs;
        this.employees = employees;

        System.out.println("\n--- School Core Components Initialized ---");
        System.out.println("Auditorium, Playground, NoticeBoard, Classrooms, Labs, and Employees are linked.");
    }

    // Method to display school details
    public void schoolDetails() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Medium of Study: " + mediumOfStudy);
    }

    // Method to check if the school is open
    public boolean isOpen() {
        return this.isSchoolOpen;
    }

    // Method to Set the school status to closed.
    public void closeSchool() {
        this.isSchoolOpen = false;
        System.out.println(this.schoolName + " is now closed.");
    }

    // Method to Set the school status to open.
    public void openSchool() {
        this.isSchoolOpen = true;
        System.out.println(this.schoolName + " is now open.");
    }

    /**
     * Adds a new student to the school (Aggregation). (Based on source 128)
     */
    public void addStudent(Student student) {
        if (student != null) {
            this.students.add(student);
            System.out.println("Student " + student.getStudentName() + " has been enrolled.");
        }
    }
// --- Methods for Department (Composition) ---
    // Method to Add a new Department to the school

    public void addDepartment(Department department) {
        if (department != null) {
            this.departments.add(department);
        }
    }

    // Method to Print the details of all departments in the school.
    public void displayAllDepartments() {
        System.out.println("\n--- Departments for " + this.schoolName + " ---");
        if (departments.isEmpty()) {
            System.out.println("No departments listed for this school.");
        } else {
            for (Department dept : departments) {
                dept.DepartmentDetails();
                System.out.println();
            }
        }
    }
// --- Methods for Bus (Aggregation) ---
    // Method to Adds an existing Bus object to the school's fleet (Aggregation).

    public void addBus(Bus bus) {
        if (bus != null) {
            this.schoolBuses.add(bus);
            System.out.println("Bus " + bus.getBusNumber() + " added to the school fleet.");
        }
    }

    // Method to Displays details for all buses in the school's fleet.
    public void displayAllBuses() {
        System.out.println("\n--- School Bus Fleet Details ---");
        if (schoolBuses.isEmpty()) {
            System.out.println("  No buses in the fleet.");
        } else {
            for (Bus bus : schoolBuses) {
                bus.BusDetails();
                System.out.println();
            }
        }
    }

    // --- Getters and Setters -------------------------------------------------
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getMediumOfStudy() {
        return mediumOfStudy;
    }

    public void setMediumOfStudy(String mediumOfStudy) {
        this.mediumOfStudy = mediumOfStudy;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public Auditorium getAuditorium() {
        return this.auditorium;
    }

    public List<Bus> getSchoolBuses() {
        return schoolBuses;
    }

    public Playground getPlayground() {
        return this.playground;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public List<Classroom> getClassrooms() {
        return this.classrooms;
    }

    public List<Lab> getLabs() {
        return this.labs;
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public NoticeBoard getNoticeBoard() {
        return noticeBoard;
    }
}
