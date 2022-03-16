package lab6;

import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        int n, odd=0, even=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter number : ");
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }

        System.out.println("\nTotal odd: " + odd);
        System.out.println("\nTotal even: " + even);
    }

}
