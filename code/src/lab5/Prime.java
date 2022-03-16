package lab5;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter the number : ");
        num = sc.nextInt();

        int res = checkPrime(num);

        if (res == 1) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is non prime");
        }

    }

    static int checkPrime(int n){
        if(n==1) return 0;
        for(int i = 2 ; i<=Math.sqrt(n) ; i++) {
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
}
