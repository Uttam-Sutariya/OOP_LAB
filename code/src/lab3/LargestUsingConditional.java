package lab3;

import java.util.Scanner;

public class LargestUsingConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();

        System.out.print("Enter number 3 : ");
        int c = sc.nextInt();

        int largest = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

        System.out.println(largest + " is largest");
    }
}

