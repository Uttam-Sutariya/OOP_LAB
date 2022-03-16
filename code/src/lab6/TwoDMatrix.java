package lab6;

import java.util.Scanner;

public class TwoDMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        // Reading values
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter [" + i + "][" + j + "] element : ");
                mat[i][j] = sc.nextInt();
            }
        }

        // printing
        System.out.println("\nGiven matrix is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
