package lab2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in punds : ");
        float weight = sc.nextFloat();

        System.out.print("Enter height in inches : ");
        float height = sc.nextFloat();

        float bmi = (0.45359237f * weight) / (0.0254f * 0.0254f * height * height);

        System.out.println("BMI = " + bmi);
    }
}
