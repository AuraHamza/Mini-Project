package Student_Management_System;

import java.util.ArrayList;

public class StudentManager {
    public ArrayList<Student> students = new ArrayList<>();

    StudentManager() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void display(int rollNo) {
        for (Student student1 : students) {
            if (student1.getRollno() == rollNo) {
                student1.displayDetails();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void remove(int rollNo) {
        for (Student student1 : students) {
            if (student1.getRollno() == rollNo) {
                students.remove(student1);
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student with Roll No " + rollNo + " not found.");
    }

    public void update(int rollNo, String newName, String newCnic) {
        for (Student student1 : students) {
            if (student1.getRollno() == rollNo) {
                student1.setName(newName);
                student1.setCnic(newCnic);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student with Roll No " + rollNo + " not found.");
    }
}
