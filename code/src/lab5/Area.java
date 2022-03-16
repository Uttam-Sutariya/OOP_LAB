package lab5;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        double r = sc.nextDouble();

        System.out.println("Enter base & height of triangles : ");
        int b = sc.nextInt();
        int h = sc.nextInt();

        System.out.print("Enter side of square : ");
        int l = sc.nextInt();

        System.out.println();
        System.out.println("Area");
        System.out.println("Circle : " + findArea(r));
        System.out.println("Triangle : " + findArea(b, h));
        System.out.println("Square : " + findArea(l));

    }

    // area of triangle
    static double findArea(int b, int h) {
        return 0.5 * b * h;
    }

    // area of circle
    static double findArea(double r) {
        return Math.PI * r * r;
    }

    // area of square
    static double findArea(int l) {
        return l * l;
    }
}
