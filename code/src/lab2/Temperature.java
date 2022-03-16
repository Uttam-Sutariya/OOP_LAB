package lab2;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenhit : ");
        float ftemp = sc.nextFloat();

        float c = (5f / 9f) * (ftemp-32);

        System.out.println("Temperature in celcious = " + c);

    }
}
