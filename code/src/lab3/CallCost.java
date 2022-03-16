package lab3;

import java.util.Scanner;

public class CallCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cost;

        System.out.print("Enter the number of calls : ");
        int a = sc.nextInt();


        if(a > 200)
            cost = 200f + 0.6f + 0.5f + 0.4f;
        else if(a > 150)
            cost = 200f + 0.6f + 0.5f;
        else if(a > 100)
            cost = 200f + 0.6f;
        else
            cost = 200f;

        System.out.println("Total call cost : " + cost);
    }
}
