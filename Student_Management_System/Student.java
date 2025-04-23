package Student_Management_System;

public class Student extends Person{
    private int rollno;
    private static int totalStudents = 0;

    public Student(String name, String cnic, int rollno) {
        super(name, cnic);
        this.rollno = rollno;
        totalStudents++;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public static int getTotalStudents() {
        return totalStudents;
    }
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("CNIC: " + getCnic());
        System.out.println("Roll Number: "+rollno);
    }
}
