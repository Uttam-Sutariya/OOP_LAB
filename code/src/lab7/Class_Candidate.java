package lab7;

import java.util.Scanner;

class Candidate {
    int candidate_id;
    String candidate_name;
    int candidate_age;
    float candidate_weight;
    float candidate_height;
    Scanner sc = new Scanner(System.in);

    public void getCandidateDetails(){
        System.out.print("Enter id : ");
        candidate_id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name : ");
        candidate_name = sc.nextLine();
        System.out.print("Enter age : ");
        candidate_age = sc.nextInt();
        System.out.print("Enter weight : ");
        candidate_weight = sc.nextFloat();
        System.out.print("Enter height : ");
        candidate_height = sc.nextFloat();
    }

    public void displayDetails(){
        System.out.println("\nCandidate Details");
        System.out.println("Id : " + candidate_id);
        System.out.println("Name : " + candidate_name);
        System.out.println("Age : " + candidate_age);
        System.out.println("Weight : " + candidate_weight);
        System.out.println("Height : " + candidate_height);
    }
}

public class Class_Candidate {
    public static void main(String[] args) {
        Candidate uttam = new Candidate();
        uttam.getCandidateDetails();
        uttam.displayDetails();
    }
}
