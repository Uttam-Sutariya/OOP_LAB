package lab4;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int rem;

        while(n>0){
            rem = n%10;
            System.out.print(rem);
            n /= 10;
        }
    }
}
