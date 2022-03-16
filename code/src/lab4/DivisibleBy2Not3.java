package lab4;

import java.util.Scanner;

public class DivisibleBy2Not3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Numbers divisible by 2 but not by 3 : ");
        for(int i = a ; i<=b ; i++){
            if(i%2==0 && i%3!=0){
                System.out.print(i + " ");
            }
        }
    }
}