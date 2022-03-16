package lab5;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        double principle, rate, no_of_year;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle amount : ");
        principle = sc.nextDouble();

        System.out.print("Enter rate of interest : ");
        rate = sc.nextDouble();

        System.out.print("Enter number of years : ");
        no_of_year = sc.nextDouble();

        double interest = findInterest(principle, rate, no_of_year);

        System.out.println("Interest = " + interest);
    }

    static double findInterest(double p, double r, double n) {
        return (p * r * n) / 100;
    }
}
