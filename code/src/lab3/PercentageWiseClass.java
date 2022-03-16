package lab3;

import java.util.Scanner;

public class PercentageWiseClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] subjectMarks = new float[5];
        float total = 0f;

        System.out.println("Enter marks of 5 sbujects out of 100 : ");
        for(int i = 0 ; i<5 ; i++){
            subjectMarks[i] = sc.nextFloat();
            total += subjectMarks[i];
        }

        float percentage = total / 5f;

        String status;

        if(percentage < 35)
            status = "Fail";
        else if(percentage >= 35 && percentage < 45)
            status = "Pass";
        else if(percentage >= 45 && percentage <60)
            status = "Second Class";
        else if(percentage >= 60 && percentage < 70)
            status = "First Class";
        else
            status = "Distinction";

        System.out.println("Percentage : " + percentage);
        System.out.println("Status : " + status);
    }
}
