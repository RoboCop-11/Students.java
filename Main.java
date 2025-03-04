//Name-Manan Khanna
//PRN-23070126156
//BATCH - AIMLB3

// Importing required packages
import java.util.*;

// Main class to handle the execution of the student management system
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Scanner object for user input
        StudentOperations operations = new StudentOperations();  // Creating an object of StudentOperations
        int choice;

        // Loop for displaying menu options until the user chooses to exit
        do {
            System.out.println("\nMenu:\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Search by Name\n5. Search by Position (Index)\n6. Update Student\n7. Delete Student\n8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();  // Consume the leftover newline character

            switch (choice) {
                case 1:
                    // Adding a new student
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter PRN: ");
                    int prn = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = scan.nextLine();
                    System.out.print("Enter Batch: ");
                    String batch = scan.nextLine();
                    System.out.print("Enter CGPA: ");
                    float cgpa = scan.nextFloat();
                    scan.nextLine();
                    operations.addStudent(new Student(name, prn, branch, batch, cgpa));
                    break;
                case 2:
                    // Display all students
                    operations.displayStudents();
                    break;
                case 3:
                    // Search student by PRN
                    System.out.print("Enter PRN to search: ");
                    prn = scan.nextInt();
                    scan.nextLine();
                    Student student = operations.searchByPRN(prn);
                    if (student != null) student.display();
                    else System.out.println("Student not found.");
                    break;
                case 4:
                    // Search student by name
                    System.out.print("Enter Name to search: ");
                    name = scan.nextLine();
                    student = operations.searchByName(name);
                    if (student != null) student.display();
                    else System.out.println("Student not found.");
                    break;
                case 5:
                    // Search student by position (index in list)
                    System.out.print("Enter Position (Index) to search: ");
                    int position = scan.nextInt();
                    scan.nextLine();
                    student = operations.searchByPosition(position);
                    if (student != null) student.display();
                    else System.out.println("Invalid position.");
                    break;
                case 6:
                    // Update student details
                    System.out.print("Enter PRN of student to update: ");
                    prn = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter New Name: ");
                    name = scan.nextLine();
                    System.out.print("Enter New Branch: ");
                    branch = scan.nextLine();
                    System.out.print("Enter New Batch: ");
                    batch = scan.nextLine();
                    System.out.print("Enter New CGPA: ");
                    cgpa = scan.nextFloat();
                    scan.nextLine();
                    if (operations.updateStudent(prn, name, branch, batch, cgpa))
                        System.out.println("Student updated successfully.");
                    else
                        System.out.println("Student not found.");
                    break;
                case 7:
                    // Delete student by PRN
                    System.out.print("Enter PRN of student to delete: ");
                    prn = scan.nextInt();
                    scan.nextLine();
                    if (operations.deleteStudent(prn))
                        System.out.println("Student deleted successfully.");
                    else
                        System.out.println("Student not found.");
                    break;
                case 8:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8);  // Continue until user chooses to exit
    }
}
