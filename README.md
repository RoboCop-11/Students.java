# Student Management System

## Overview
This is a simple **Student Management System** implemented in Java. It allows users to efficiently manage student records using a menu-driven console interface.

## Features
- **Add Students**: Enter a student's name, PRN, branch, batch, and CGPA to store their record.
- **Display Students**: View a list of all students along with their details.
- **Search Students**:
  - By **PRN**: Retrieve student details using a unique PRN.
  - By **Name**: Find students based on their names (case-insensitive search).
  - By **Position (Index)**: Search for a student based on their position in the list.
- **Update Student Details**: Modify an existing student’s information by providing their PRN.
- **Delete Student**: Remove a student’s record permanently using their PRN.
- **Exit**: Safely terminate the program when finished.

## How It Works
Once the program is launched, users are presented with an interactive menu:
```
Menu:
1. Add Student
2. Display Students
3. Search by PRN
4. Search by Name
5. Search by Position (Index)
6. Update Student
7. Delete Student
8. Exit
```
- **Adding a Student**: The user provides necessary details, and the student is added to the system.
- **Displaying Students**: Lists all stored student records.
- **Searching a Student**: The user selects a search method and inputs the required detail (PRN, Name, or Position). The system retrieves and displays matching records.
- **Updating a Student**: The user enters the PRN of the student they wish to update, followed by new details.
- **Deleting a Student**: The user inputs the PRN, and if found, the record is removed.
- **Exiting**: The user can exit anytime by selecting option 8.

## Example Interaction
```
Enter your choice: 1
Enter Name: Alice
Enter PRN: 101
Enter Branch: IT
Enter Batch: 2024
Enter CGPA: 8.9
Student added successfully!

Enter your choice: 2
Name: Alice | PRN: 101 | Branch: IT | Batch: 2024 | CGPA: 8.9
```
This system ensures easy management of student records with a clear and intuitive interface.

