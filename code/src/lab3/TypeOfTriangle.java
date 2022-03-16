package lab3;

import java.util.Scanner;

public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter side 2 : ");
        int b = sc.nextInt();

        System.out.print("Enter side 3 : ");
        int c = sc.nextInt();

        if(a == b && a == c)
            System.out.println("Triangle is equilateral");
        else if((a == b && a != c) || (b == c && b != a) || (a == c && a != b))
            System.out.println("Triangle is isosceles");
        else
            System.out.println("Triangle is scalene");
    }
}

