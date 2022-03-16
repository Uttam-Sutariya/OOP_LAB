package lab6;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int n, x;
        StringBuffer message = new StringBuffer("not found");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number : ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter number to search : ");
        x = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                message = new StringBuffer("found at " + (i + 1));
                break;
            }
        }
        System.out.println("Element " + message);
    }
}
