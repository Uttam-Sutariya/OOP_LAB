package lab4;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        float sum = 0;

        for(int i = 1 ; i<=n ; i++){
            sum += 1 / (float)i;
        }

        System.out.println("Sum : " + sum);
    }
}
