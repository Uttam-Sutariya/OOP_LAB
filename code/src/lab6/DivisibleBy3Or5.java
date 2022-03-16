package lab6;

import java.util.Scanner;

public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length; i++){
            System.out.print("Enter number : ");
            a[i] = sc.nextInt();

            if(a[i] % 3 == 0 || a[i] % 5 == 0){
                sum += a[i];
            }
        }
        System.out.println("Sum is "+ sum);
    }
}
