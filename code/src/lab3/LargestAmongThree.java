package lab3;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();

        System.out.print("Enter number 3 : ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c)
                System.out.println(a + " is largest");
            else
                System.out.println(c + " is largest");
        } else {
            if(b>c)
                System.out.println(b +" is largest");
            else
                System.out.println(c + " is largest");
        }
    }
}
