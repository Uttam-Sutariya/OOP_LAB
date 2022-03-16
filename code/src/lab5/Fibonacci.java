package lab5;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms : ");
        int n = sc.nextInt();

        fibonacci(n);
    }

    static void fibonacci(int n){
        int prev1 = 1;
        int prev2 = 1;
        int next = prev1 + prev2;

        System.out.println("Fibonacci series of " + n + " elements");
        for(int i = 0 ; i<n ; i++) {
            System.out.print(prev1 + " ");
            prev1 = prev2;
            prev2 = next;
            next = prev1 + prev2;
        }
    }
}
