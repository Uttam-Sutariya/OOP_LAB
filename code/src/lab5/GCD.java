package lab5;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("GCD of " + a  + " & " + b + " = " + gcd(a, b));
    }

    public static int gcd(int num1, int num2){
        if(num2 == 0)
            return num1;
        return gcd(num2, num1 % num2);
    }
}
