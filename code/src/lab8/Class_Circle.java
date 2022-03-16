package lab8;

import java.util.Scanner;

class Circle {
    double radius;
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Class_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.print("Enter radius of circle : ");
        c1.radius = sc.nextDouble();
        System.out.println("Area : " + c1.getArea());
        System.out.println("Perimeter : " + c1.getPerimeter());
    }
}
