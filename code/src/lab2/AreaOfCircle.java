package lab2;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        int radius = sc.nextInt();

        double area = Math.PI * radius * radius;

        System.out.printf("Area = %.2f", area);
    }
}
