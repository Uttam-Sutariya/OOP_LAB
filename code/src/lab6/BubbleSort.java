package lab6;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        System.out.println("Enter array elements");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            a[i] = sc.nextInt();
        }

        bubble_sort(a);
    }

    static void bubble_sort(int[] a){
        int temp;
        for(int i = 1; i <= a.length; i++) {
            for(int j = 0; j < a.length-i; j++){
                if(a[j]>a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("\nSorted array");
        for (int elem : a) {
            System.out.print(elem + " ");
        }
    }
}
