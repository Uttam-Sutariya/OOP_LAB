package lab7;

import java.util.Scanner;

class Student{
    //Declare Variables
    String EnrollmentNo;
    int Semester;
    String Name;
    double CPI;
    double SPI;
    Scanner sc = new Scanner(System.in);
    //Get Details method
    void getStudentDetails(){
        System.out.print("Enter Enrollment No : ");
        EnrollmentNo = sc.nextLine();
        System.out.print("Enter Name : ");
        Name = sc.next();
        System.out.print("Enter Semester : ");
        Semester = sc.nextInt();
        System.out.print("Enter CPI : ");
        CPI = sc.nextDouble();
        System.out.print("Enter SPI : ");
        SPI = sc.nextDouble();
    }
    //Display Details method
    void displayStudentDetails(){
        System.out.println("\nStudent Details:-");
        System.out.println("Enrollment No : "+EnrollmentNo);
        System.out.println("Name : "+Name);
        System.out.println("Semester : "+Semester);
        System.out.println("CPI : "+CPI);
        System.out.println("SPI : "+SPI);
    }
}


public class Class_Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getStudentDetails();
        s1.displayStudentDetails();
    }
}
