package lab6;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            a[i] = sc.nextInt();
        }

        selection_sort(a);
    }

    static void selection_sort(int[] a){
        int temp;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\nSorted array");
        for (int elem : a) {
            System.out.print(elem + " ");
        }
    }
}
