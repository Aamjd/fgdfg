/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schoolsystem;

import java.io.IOException;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SchoolSystem {

   

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // --------------------------------------------------------------
        // 1) Create School (FIRST TIME)
        // --------------------------------------------------------------
        System.out.println("=========== CREATE SCHOOL (FIRST TIME ONLY) ===========");

        System.out.print("Enter School Name: ");
        String schoolName = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        int contactNumber = sc.nextInt();
        sc.nextLine();
       
        System.out.print("Enter Medium of Study: ");
        String medium = sc.nextLine();
        
        SchoolManagement school = new SchoolManagement(schoolName, address, contactNumber, medium);

        

        System.out.println("\n--- Create Auditorium ---");
        System.out.print("Number of seats: ");
        int auditoriumSeats = sc.nextInt();
         Auditorium auditorium = new Auditorium(auditoriumSeats);

        System.out.println("\n--- Create Playground ---");
        System.out.print("Enter Playground Area/Size: ");
        double playgroundArea = sc.nextDouble();
        Playground playground = new Playground(playgroundArea);

        System.out.println("\n--- Create Classrooms ---");
        System.out.print("How many classrooms? ");
        int classCount = sc.nextInt();
        List<Classroom> classroomList = new ArrayList<>();

        for (int i = 1; i <= classCount; i++) {
             System.out.println("\nClassroom #" + i);

             System.out.print("Enter Class Name: ");
             String className = sc.next();

             System.out.print("Enter Student Count: ");
             int stuCount = sc.nextInt();

             System.out.println("Enter Class Equipment:");
             System.out.print("- Bench Count: ");
             int bench = sc.nextInt();
             System.out.print("- Fan Count: ");
             int fan = sc.nextInt();
             System.out.print("- Light Count: ");
             int light = sc.nextInt();
            
             ClassEquipments equipment = new ClassEquipments(i,i,bench, fan, light);
             Classroom classroom = new Classroom(i,className, stuCount, i);
             
             classroomList.add(classroom);
             System.out.println("Classroom and its Equipments created and added successfully."); 
                                                }

        System.out.println("\n--- Create Labs ---");
        System.out.print("How many labs? ");
        int labCount = sc.nextInt();
        List<Lab> LabList = new ArrayList<>();
          for (int i = 1; i <= labCount; i++) {
            System.out.println("\nLab #" + i);
            System.out.print("Enter Lab Name: ");
            String labName = sc.next();
            System.out.print("How many Lab Equipments? ");
            int eqCount = sc.nextInt();
            List<Equipments> labEquipmentList = new ArrayList<>();    
                for (int j = 1; j <= eqCount; j++) {
                  System.out.println("Equipment #" + j);
                  System.out.print("Equipment Name: ");
                  String eqName = sc.next();
                  System.out.print("Equipment Count: ");
                  int Ecount = sc.nextInt();
                  LabEquipments labEquipment = new LabEquipments(i, eqName, Ecount);
                  labEquipmentList.add(labEquipment);
                                                   }

            System.out.println("Enter Class Equipment for this lab:");
            System.out.print("- Bench Count: ");
            int bench = sc.nextInt();
            System.out.print("- Fan Count: ");
            int fan = sc.nextInt();
            System.out.print("- Light Count: ");
            int light = sc.nextInt();
            ClassEquipments labClassequipment = new ClassEquipments(i,bench, fan, light);
            labEquipmentList.add(labClassequipment);
            Lab lab = new Lab(i, labName, labEquipmentList);
            LabList.add(lab);
                                               }

        System.out.println("\n--- Employees ---");

        System.out.print("How many Teachers? ");
        int teacherCount = sc.nextInt();
        List<Employee> EmployeeList = new ArrayList<>();
           
        for (int i = 1; i <= teacherCount; i++) {
            System.out.println("Teacher #" + i);
            System.out.print("Name: ");
            String tname = sc.next();
            System.out.print("Salary: ");
            int sal = sc.nextInt();
            System.out.print("DepartmentID: ");
            int dep = sc.nextInt();
            Teacher teacher = new Teacher(i, tname, sal, dep);
            EmployeeList.add(teacher);
            System.out.println("Teacher created and added successfully."); 
            
            
                                               }

        System.out.print("How many Support Staff? ");
        int staffCount = sc.nextInt();
        for (int i = 1; i <= staffCount; i++) {
            System.out.println("Support Staff #" + i);
            System.out.print("Name: ");
            String sname = sc.next();
            System.out.print("Salary: ");
            int sal = sc.nextInt();
            System.out.print("DepartmentID: ");
            int dep = sc.nextInt();
             SupportStaff staff= new SupportStaff(i, sname, sal, dep);
             EmployeeList.add(staff);
                                              }
        NoticeBoard noticBoard = new NoticeBoard();
        System.out.println("\n--- NoticeBoard Created ---");
       
        school.initialize(auditorium, playground, noticBoard, classroomList, LabList, EmployeeList);
        System.out.println("your school created successfully."); 
      
        System.out.println("RUN SCHOOL");
        runSchool(school);

    }//END main 
    
    public static void runSchool (SchoolManagement school){
       
        // --------------------------------------------------------------
        // SCHOOL MANAGEMENT MENU
        // --------------------------------------------------------------
        
      Scanner sc = new Scanner(System.in);
      while (true) {
            System.out.println("\n=========== SCHOOL MANAGEMENT MENU ===========");
            System.out.println("A - Bus");
            System.out.println("B - Student");
            System.out.println("C - Employee");
            System.out.println("D - Class");
            System.out.println("E - NoticeBoard");
            System.out.println("F - Auditorium");
            System.out.println("G - ShowSchoolDetails");
            System.out.println("H - Exit");

            System.out.print("Choose option: ");
            String op = sc.next();

            // --------------------------------------------------------------
            // BUS MENU
            // --------------------------------------------------------------
            if (op.equalsIgnoreCase("A")) {  
                busmenu( school);
                                          }
               

            // --------------------------------------------------------------
            // STUDENT MENU
            // --------------------------------------------------------------
            if (op.equalsIgnoreCase("B")) {
               studentmenu( school);
                                          }
                

            // --------------------------------------------------------------
            // EMPLOYEE MENU
            // --------------------------------------------------------------
            if (op.equalsIgnoreCase("C")) {
                employeemenu( school);
               
                                          }

            // --------------------------------------------------------------
            // CLASS MENU
            // --------------------------------------------------------------
            if (op.equalsIgnoreCase("D")) {
               classmenu (school);
                                          }

            // --------------------------------------------------------------
            // NOTICEBOARD MENU
            // --------------------------------------------------------------
            if (op.equalsIgnoreCase("E")) {
              noticboardmenu(school);
                                          }

            // --------------------------------------------------------------
            // AUDITORIUM MENU
            // --------------------------------------------------------------
            if (op.equalsIgnoreCase("F")) {
               auditirium(school); 
                                          }

            // --------------------------------------------------------------
            // SHOW SCHOOL DETAILS
            // --------------------------------------------------------------
            if (op.equalsIgnoreCase("G")) {
                System.out.println("\n[SCHOOL DETAILS DISPLAY]");
                school.schoolDetails();
                                          }

            // EXIT
            if (op.equalsIgnoreCase("H")) {
                System.out.println("Stopping program...");
                 System.exit(0);
                break;
                                         }
        }//END While
    
    
    }//END runSchool method
    
    
   /*for simplfy the code the menu has been divide into small methods
    for easy reading and debuging
    each method get the school object from the schoolManagement class as an argument
    */
    public static void busmenu(SchoolManagement school){
        while (true) {
               Scanner sc = new Scanner(System.in);
                    System.out.println("\n--- BUS MENU ---");
                    System.out.println("1 - Add Bus");
                    System.out.println("2 - Show Bus Details");
                    System.out.println("3 - Show Seats");
                    System.out.println("4 - Go Back");
                    System.out.print("Choice: ");
                    int c = sc.nextInt();

                    if (c == 4) break;

                    if (c == 1) {
                        System.out.println("[Add Bus]");
                        System.out.println("Enter the bus ID");
                        int id = sc.nextInt(); 
                        System.out.print("Enter Driver ID: ");
                        int driver = sc.nextInt();
                        System.out.print("Enter Bus Number: ");
                        String busNum = sc.next();
                        System.out.println("Enter the bus capacity");
                        int capacity = sc.nextInt();
                      Bus bus = new Bus(id,driver,busNum,capacity);
                      school.addBus(bus);
                    System.out.println("Bus added successfully.");
                    break;
                        
                                }
                    
                     if (c == 2){
                       System.out.println("[Show Bus Details]");
                       System.out.print("Enter Bus ID: ");
                       int id = sc.nextInt();

                          Bus found = null;
                       for (Bus b : school.getSchoolBuses()) {
                         if (b.getBusId() == id) {
                             found = b;
                             break;
                            }
                                 }

                     if (found != null) {
                       found.BusDetails();
                                        } 
                     else {
                       System.out.println("Bus not found.");
                          }
                                }
         
                   if (c == 3) {
                     System.out.print("Enter Bus ID: ");
                     int id = sc.nextInt();

                     Bus found = null;
                  for (Bus b : school.getSchoolBuses()) {
                      if (b.getBusId() == id) {
                          found = b;
                          break;
                                               }
                                                         }

                  if (found != null) {
                      found.ShowSeats();
                                     } 
                  else {
                    System.out.println("Bus not found.");
                       }
                    
                               }
        }
    
    }// END OF bus menu method
    
    public static void studentmenu(SchoolManagement school){
        while (true) {
             Scanner sc = new Scanner(System.in);
                    System.out.println("\n--- STUDENT MENU ---");
                    System.out.println("1 - Add Student");
                    System.out.println("2 - Show Student Details");
                    System.out.println("3 - Pay Fee");
                    System.out.println("4 - Go Back");
                    System.out.print("Choice: ");
                    int c = sc.nextInt();

                    if (c == 4) break;

                    if (c == 1) {
                        System.out.println("[Add Student]");
                        System.out.println("Enter student ID");
                        int id = sc.nextInt();
                        System.out.print("Enter the Name: ");
                        String name = sc.next();
                        System.out.print("Enter ClassID: ");
                        int classId = sc.nextInt();
                        System.out.print("Section: ");
                        String section = sc.next();
                        System.out.print("BusID: ");
                        int busId = sc.nextInt();
                       
                      if (classId >= 1 && classId <= 10) {
            //  (Primary Student)
           PrimaryStudent newStudent = new PrimaryStudent(id,name, classId, section, busId);
            school.addStudent(newStudent);
            System.out.println("Primary Student added successfully.");  
                      break;
                      } 
                      else if (classId == 11 || classId == 12) {
            //  (Higher Secondary Student)
           HigherSecondaryStudent newStudent = new HigherSecondaryStudent( id,name, classId, section, busId);
            school.addStudent(newStudent);
            System.out.println("Higher Secondary Student added successfully.");
            break;
        } 
                      else {
            System.out.println("Invalid Class ID. Student not added.");
          break; 
        }
                        
                    }
                    
                    if (c == 2){
                     System.out.println("[SHOW STUDENT DETAILS]");
                     System.out.print("Enter Student ID: ");
                    int id1 = sc.nextInt();

                    Student found1 = null;
                    for (Student s : school.getStudents()) {
                        if (s.getStudentId() == id1) {
                            found1 = s;
                            break;
                        }
                    }

                    if (found1 == null) {
                        System.out.println("Student not found.");
                    } else {
                        found1.StudentDetails();
                    }
                    break;

                    }
                    if (c == 3){ 
                 System.out.println("[PAY FEE]");
                 System.out.print("Enter Student ID: ");
                    int id2 = sc.nextInt();

                    Student found2 = null;
                    for (Student s : school.getStudents()) {
                        if (s.getStudentId() == id2) {
                            found2 = s;
                            break;
                        }
                    }

                    if (found2 == null) {
                        System.out.println("Student not found.");
                    } else {
                        System.out.print("Enter Payment Amount: ");
                        double amt = sc.nextDouble();
                        found2.PayFees(amt);
                    }
                    break;

        }
        }
            }//END OF student menu method
    
    
    public static void employeemenu(SchoolManagement school){
     while (true) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("\n--- EMPLOYEE MENU ---");
                    System.out.println("1 - Teacher");
                    System.out.println("2 - Support Staff");
                    System.out.println("3 - Go Back");
                    System.out.print("Choice: ");
                    int c = sc.nextInt();

                    if (c == 3) break;

                    if (c == 1) {
                        System.out.println("--- Teacher Menu ---");
                        System.out.println("1 - Show Teacher Details");
                        System.out.println("2 - Receive Salary");
                        System.out.println("3 - Go Back");
                        int tChoice = sc.nextInt();
                       
                        if (tChoice == 3) break;

            switch (tChoice) {
                case 1:{
                    System.out.println("[Teacher Details]");
                    System.out.print("Enter Teacher ID: ");
                    int tid = sc.nextInt();
                      Employee foundT = null;
                    for (Employee e : school.getEmployees()) {
                        if (e instanceof Teacher && e.getEmployeeId() == tid) {
                            foundT = e;
                            break;
                        }
                    }
                    if (foundT != null) 
                        foundT.EmployeeDetails();
                    
                    else System.out.println("Teacher not found.");
                    break;
                }

                case 2:{
                    System.out.print(" [Receive Salary]");
                    System.out.print("Enter Teacher ID: ");
                    int tid = sc.nextInt();
                      Employee foundT = null;
                    for (Employee e : school.getEmployees()) {
                        if (e instanceof Teacher && e.getEmployeeId() == tid) {
                            foundT = e;
                      break;
                        }
                    }
                       if (foundT != null) 
                        foundT.ReceiveSalary();
                    
                    else System.out.println("Teacher not found.");
                    
                    break;  }

               

                default:
                    System.out.println("Invalid choice.");
            }
        } //END of Teatcher menu "case 1"
                    

                    if (c == 2) {
                        System.out.println("--- Support Staff Menu ---");
                        System.out.println("1 - Show Support Staff Details");
                        System.out.println("2 - Receive Salary");
                        System.out.println("3 - Go Back");
                        sc.nextInt();
                         int sChoice = sc.nextInt();
                         if (sChoice == 3)
                        break;

                     switch (sChoice) {

             case 1: {
                 System.out.println("[Support Staff Details]");
                 System.out.print("Enter Staff ID: ");
                 int sid = sc.nextInt();

                 Employee foundS = null;

                 for (Employee e : school.getEmployees()) {
                   if (e instanceof SupportStaff && e.getEmployeeId() == sid) {
                       foundS = e;
                       break;
                                                                              }
                                                          }

                if (foundS != null)
                  foundS.EmployeeDetails();
               else
                System.out.println("Support Staff not found.");

                       break;
                    }

            case 2: {
                System.out.println("[Receive Salary]");
                System.out.print("Enter Staff ID: ");
                int sid = sc.nextInt();

                Employee foundS = null;

                for (Employee e : school.getEmployees()) {
                  if (e instanceof SupportStaff && e.getEmployeeId() == sid) {
                     foundS = e;
                      break;
                                                                             }
                                                          }

               if (foundS != null)
                   foundS.ReceiveSalary();
              else
                System.out.println("Support Staff not found.");

                     break;
                    }

            default:
              System.out.println("Invalid choice.");
                                
                                 }//END inside switch 
                       
                    } //END outer switch 
                }//END loop
    } // END of Employee Menu method
    
    public static void classmenu (SchoolManagement school){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- CLASS MENU ---");
        System.out.println("1 - Add Students to Class");
        System.out.println("2 - Assign Teacher");
        System.out.println("3 - Show Class Details");
        System.out.println("4 - Go Back");
        System.out.print("Choice: ");
         int choice = sc.nextInt();

         switch (choice) {

    // 1  Add Student by StudentID
           case 1: {
               System.out.println("[Add Students to Class]");
               System.out.print("Enter Classroom ID: ");
               int cid = sc.nextInt();

               Classroom foundClass = null;
               for (Classroom c : school.getClassrooms()) {
                 if (c.getClassId() == cid) {
                foundClass = c;
                break;
                                            }
                                                          }

               if (foundClass == null) {
                 System.out.println("Class not found.");
                break;
                                       }

               System.out.print("Enter Student ID to add: ");
               int sid = sc.nextInt();

              Student foundS = null;
              for (Student s : school.getStudents()) {
                 if (s.getStudentId() == sid) {
                  foundS = s;
                   break;
                                              }
                                                     }

             if (foundS == null) {
               System.out.println("Student not found.");
                                 } 
             else { 
            //set the classID Attribute in student to match the ID of wanted class
                  foundS.setClassId(cid);  
                  System.out.println("Student added to class.");
            //apdate the counter of studentcount in the class as the student has been added
                  foundClass.setStudentCount(foundClass.getStudentCount()+1);
                  }
              break;
                }

    // 2  Assign Teacher by TeacherID
         case 2: {
            System.out.println("[Assign Teacher to Class]");
            System.out.print("Enter Classroom ID: ");
            int cid = sc.nextInt();
            Classroom foundClass = null;
            for (Classroom c : school.getClassrooms()) {
               if (c.getClassId() == cid)
                  foundClass = c;
                  break;
                                                       }

           if (foundClass == null) {
               System.out.println("Class not found.");
               break;
                                   }

            System.out.print("Enter Teacher ID: ");
            int tid = sc.nextInt();
            Teacher foundT = null;
              for (Employee e : school.getEmployees()) {
                  if (e instanceof Teacher && e.getEmployeeId() == tid) {
                     foundT = (Teacher) e;
                     break;
                                                                        }
                                                       }

           if (foundT == null) {
            System.out.println("Teacher not found.");
                               }
           else {
            //set the TeacherID Attribute in the class to match the ID of wanted Teatcher
            foundClass.setTeacherId(tid);
            System.out.println("Teacher assigned to class.");
                }

            break;
                }

    // 3 — Show Class Details 
       case 3: {
            System.out.println("Show class Details");
            System.out.print("Enter Classroom ID: ");
            int cid = sc.nextInt();

            Classroom foundClass = null;
            for (Classroom c : school.getClassrooms()) {
               if (c.getClassId() == cid) {
                  foundClass = c;
                  break;
                                          }
                                                       }

           if (foundClass == null) {
            System.out.println("Class not found.");
                break;
                                   }
        // Print class details
          foundClass.ClassDetails();
                break;
               }

    default:
        System.out.println("Invalid choice.");
                 
            }//END switch

    }//END of Class Menu method

    
    private static void noticboardmenu(SchoolManagement school) {
          while (true) {
                 Scanner sc = new Scanner(System.in);
                    System.out.println("\n--- NOTICE BOARD ---");
                    System.out.println("1 - Display");
                    System.out.println("2 - AddContent");
                    System.out.println("3 - Go Back");
                    System.out.print("Choice: ");
                    int c = sc.nextInt();

                    if (c == 3) break;
                    
             switch (c) {

        case 1: {
            System.out.println("[Display Notice Board]");
            school.getNoticeBoard().Display();
            break;
                }

        case 2: {
            System.out.println("[Add Content]");
            System.out.print("Enter new notice: ");
            String newContent = sc.nextLine()+sc.nextLine();
          
            school.getNoticeBoard().AddContent(newContent);
            break;
                }

        default:
            System.out.println("Invalid choice.");
                            
                               }//end switch
                     }//END loop
    }//END of NoticBoard menu method
   
  
    
    private static void auditirium (SchoolManagement school){
      while(true){
               Scanner sc = new Scanner(System.in);
                    System.out.println("\n--- AUDITORIUM MENU ---");
                    System.out.println("1 - Book Auditorium");
                    System.out.println("2 - Show Event Details");
                    System.out.println("3 - Show Seats");
                    System.out.println("4 - Go Back");
                    System.out.print("Choice: ");
                    int c = sc.nextInt();

                    if (c == 4)
                          break;
                    
                 switch (c) {
                   
                     case 1: {
                         System.out.println("[Book Auditorim]");
                         System.out.println("Event Name: ");
                         String eventName = sc.next();
                         System.out.println("Event Date: ");
                         String eventDate = sc.next();
                         System.out.println("Event Time: ");
                         String eventTime = sc.next();
                         System.out.println("Number of participants: ");
                         int participants = sc.nextInt();
                         System.out.println("Department Name: "); 
                         String deptName = sc.next();
                   school.getAuditorium().BookAuditorium(eventName, eventDate, eventTime, participants, deptName);
                         break;
                            }
                    
                    case 2:{  
                            System.out.println("[Event Details]");
                        school.getAuditorium().EventDetails();
                         break;
                           }
                     
                    case 3:{
                            System.out.println("[Show seats]");
                     school.getAuditorium().DisplaySeats();
                          break; 
                           }
   
                             }//end switch
                }//end loop
                                                          
    } //END of Auditorium menu method
    
  }// End of class
