package lab3;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int a = sc.nextInt();

        if(a>=0){
            System.out.println("Number is positive");
        } // consider 0 as positive
        else{
            System.out.println("Number is negative");
        }
    }
}
