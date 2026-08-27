# Student Result Management System
# using java
A simple **Java console-based Student Result Management System** that allows users to add students, store their subject marks, display student details, search for a student, and find the topper based on total marks.

## 📌 Features

* Add student details
* Store marks for multiple subjects
* Display all students and their marks
* Search for a student by name
* Calculate total marks
* Find the student with the highest total marks
* Menu-driven console interface
* Supports up to **10 students**
* Supports up to **10 subjects per student**

## 🛠️ Technologies Used

* **Java**
* `Scanner` for user input
* Arrays
* 2D Arrays
* Methods
* Loops
* Conditional statements
* `switch-case`

## 📂 Project Structure

```text
Student Result Management System
│
└── project.java
```

## ⚙️ How It Works

When the program starts, it displays a menu:

```text
Student Result Management System
______Menu drive_____

1. Add student
2. Display all students
3. Search student
4. Find topper
5. Exit
```

### 1. Add Student

The user enters:

* Student name
* Number of subjects
* Marks for each subject

The information is stored using arrays.

### 2. Display All Students

Displays the names and marks of all students currently stored in the system.

### 3. Search Student

The user enters a student's name. The program searches the stored student records and displays the student's marks if found.

### 4. Find Topper

The program calculates the total marks of every student and finds the student with the highest total.

### 5. Exit

Exits the menu-driven program.

## 🧠 Java Concepts Practiced

This project helped me practice the following Java fundamentals:

* Variables and data types
* `Scanner`
* `if-else`
* `switch-case`
* `for` loops
* Methods
* `static` variables and methods
* 1D arrays
* 2D arrays
* String comparison
* Boolean variables
* Basic problem-solving and program logic

## 🚀 How to Run

### Step 1: Install Java

Make sure Java JDK is installed on your system.

Check using:

```bash
java -version
```

### Step 2: Compile the program

```bash
javac project.java
```

### Step 3: Run the program

```bash
java project
```

## 📊 Example

```text
Student Result Management System
______Menu drive_____

1. Add student
2. Display all students
3. Search student
4. Find topper
5. Exit

Enter the choice: 1

Enter student name
Shreyas

Enter the number of subject
5

Enter marks of 5 subjects
marks[1]
85
marks[2]
78
marks[3]
91
marks[4]
88
marks[5]
90
```

## 🔮 Future Improvements

Possible improvements for the next version:

* Add student ID/roll number
* Calculate percentage
* Calculate grades
* Validate marks between 0 and 100
* Allow student names with spaces
* Add update student functionality
* Add delete student functionality
* Improve the menu system
* Store data permanently using files
* Replace arrays with `ArrayList`
* Create a GUI version
* Connect the application to a database

## 👨‍💻 Author

**Shreyas Patil**

This project was created to practice Java fundamentals, arrays, methods, and basic problem-solving.

## ⭐ Project Status

**Completed — Basic Java Console Project**

Future versions can extend this project using **OOP, ArrayList, File Handling, JDBC, MySQL, and Spring Boot**.
