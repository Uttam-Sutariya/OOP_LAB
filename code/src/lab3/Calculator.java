package lab3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        float a = sc.nextFloat();

        System.out.print("Enter number 2 : ");
        float b = sc.nextFloat();

        System.out.print("Enter operation : ");
        char ope = sc.next().charAt(0);

        switch (ope){
            case '+':
                System.out.println(a + " + " +  b + " = " + (a+b));
                break;

            case '-':
                System.out.println(a + " - " +  b + " = " + (a-b));
                break;

            case '*':
                System.out.println(a + " * " +  b + " = " + (a*b));
                break;

            case '/':
                System.out.println(a + " / " +  b + " = " + (a/b));
                break;

            case '%':
                System.out.println(a + " % " +  b + " = " + (a%b));
                break;

            default:
                System.out.println("Please Enter valid Operation");
        }
    }
}
