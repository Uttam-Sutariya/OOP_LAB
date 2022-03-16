package lab2;

import java.util.Scanner;

public class Percentage {
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

        System.out.println("Percentage = " + percentage);
    }
}
