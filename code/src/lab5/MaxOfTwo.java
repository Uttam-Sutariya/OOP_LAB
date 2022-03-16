package lab5;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.println(findMax(a, b) + " is maximum");
    }

    static int findMax(int a, int b) {
        return a>b ? a : b;
    }
}
