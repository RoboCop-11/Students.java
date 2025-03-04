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

     // Method to search for a student by PRN
    public Student searchByPRN(int prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) return student;
        }
        return null;  // Return null if student not found
    }

    // Method to search for a student by name
    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) return student;
        }
        return null;  // Return null if student not found
    }

     // Method to search for a student by position (index in list)
    public Student searchByPosition(int position) {
        if (position >= 0 && position < students.size()) return students.get(position);
        return null;  // Return null if position is out of bounds
    }

    // Method to update student details based on PRN
    public boolean updateStudent(int prn, String name, String branch, String batch, float cgpa) {
        Student student = searchByPRN(prn);
        if (student != null) {
            student.setName(name);
            student.setBranch(branch);
            student.setBatch(batch);
            student.setCGPA(cgpa);
            return true;  // Update successful
        }
        return false;  // Student not found
    }

    
}
