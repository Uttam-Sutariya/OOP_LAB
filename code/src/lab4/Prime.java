package lab4;

import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        if(a==1){
            System.out.println("Not prime");
            return;
        }

        for(int i = 2 ; i<=Math.sqrt(a) ; i++){
            if(a%i == 0){
                System.out.println("Not Prime");
                return;
            }
        }

        System.out.println("Prime Number");
    }
}
