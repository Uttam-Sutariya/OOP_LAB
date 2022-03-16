package lab6;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows of 2D array : ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns of 2D array : ");
        int column = sc.nextInt();

        int[][] a = new int[row][column];
        int[][] b = new int[row][column];
        int[][] c = new int[row][column];

        getElements(a);
        getElements(b);


        // Multiplication
        for(int k = 0; k < row; k++){
            for(int i = 0; i < row; i++){
                c[k][i] = 0;
                for(int j = 0; j < column; j++){
                    c[k][i] = c[k][i] + (a[i][j] * b[j][i]);
                }
            }
        }

        System.out.println("\nMultiplication of two matrices");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

    }
    static void getElements(int[][] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("Enter element at ["+(i+1)+"] ["+(j+1)+"] : ");
                a[i][j] = sc.nextInt();
            }
        }
    }

}
