package lab7;

import java.util.Scanner;

class Employee{
    //Declare Variables
    int EmployeeID;
    int Age;
    int Salary;
    String EmployeeName, Designation;
    Scanner sc = new Scanner(System.in);
    //Get Details method
    void getEmployeeDetails(){
        System.out.print("Enter Employee ID : ");
        EmployeeID = sc.nextInt();
        System.out.print("Enter Employee Name : ");
        EmployeeName = sc.next();
        System.out.print("Enter Designation : ");
        Designation = sc.next();
        System.out.print("Enter Age : ");
        Age = sc.nextInt();
        System.out.print("Enter Salary : ");
        Salary = sc.nextInt();
    }
    //Display Details method
    void displayEmployeeDetails(){
        System.out.println("\nEmployee Details:-");
        System.out.println("Employee ID : "+EmployeeID);
        System.out.println("Employee Name : "+EmployeeName);
        System.out.println("Designation : "+Designation);
        System.out.println("Age : "+Age);
        System.out.println("Salary : "+Salary);
    }
}


public class Class_Employee {
    public static void main(String[] args) {
        Employee uttam = new Employee();
        uttam.getEmployeeDetails();
        uttam.displayEmployeeDetails();
    }
}
