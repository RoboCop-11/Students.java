// Importing required package
import java.util.*;

// Class handling student-related operations
class StudentOperations {
    private ArrayList<Student> students;  // List to store student records

    // Constructor to initialize the list
    public StudentOperations() { this.students = new ArrayList<>(); }

    // Method to add a new student to the list
    public void addStudent(Student student) { students.add(student); }

    // Method to display all students
    public void displayStudents() {
        for (Student student : students) { student.display(); }
    }

   
}
