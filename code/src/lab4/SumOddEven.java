package lab4;

import java.util.Scanner;

public class SumOddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        int num;

        System.out.println("*****NOTE: Enter 0 if you want to exit*****");
        System.out.println("Enter numbers : ");

        while(true){
            num = sc.nextInt();
            if(num > 0 && num%2==0)
                sumEven += num;
            if(num < 0 && num%2!=0)
                sumOdd += num;
            if(num == 0)
                break;
        }
        System.out.println();
        System.out.print("Sum of positive even number : " + sumEven);
        System.out.println();
        System.out.print("Sum of negative odd number : " + sumOdd);
    }
}
