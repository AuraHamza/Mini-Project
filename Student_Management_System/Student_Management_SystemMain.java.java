package Student_Management_System;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        int choice = 0;
        do {

                System.out.println("\n--- Welcome to the Student Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Search Student by Roll Number");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();

                        if (name.isEmpty()) {
                            System.out.println("Name cannot be empty.");
                            break;
                        }

                        System.out.print("Enter CNIC: ");
                        String cnic = scanner.nextLine();

                        if (cnic.isEmpty()) {
                            System.out.println("CNIC cannot be empty.");
                            break;
                        }

                        System.out.print("Enter Roll No: ");
                        int rollno = scanner.nextInt();
                        scanner.nextLine();
                        Student student = new Student(name, cnic, rollno);
                        studentManager.add(student);
                        break;

                    case 2:
                        if (studentManager.students.isEmpty()) {
                            System.out.println("No students found.");
                        } else {
                            for (Student s : studentManager.students) {
                                s.displayDetails();
                                System.out.println("-------------------------");
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter Roll Number: ");
                        int searchRollNo = scanner.nextInt();
                        studentManager.display(searchRollNo);
                        break;

                    case 4:
                        System.out.print("Enter Roll Number: ");
                        int updateRollNo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter New CNIC: ");
                        String newCnic = scanner.nextLine();
                        studentManager.update(updateRollNo, newName, newCnic);
                        break;

                    case 5:
                        System.out.print("Enter Roll Number to delete: ");
                        int deleteRollNo = scanner.nextInt();
                        studentManager.remove(deleteRollNo);
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice, please try again.");
                }

        } while (choice != 6);
    }
}
