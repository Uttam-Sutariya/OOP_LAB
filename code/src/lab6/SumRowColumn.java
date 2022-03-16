package lab6;

import java.util.Scanner;

public class SumRowColumn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows of 2D array : ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns of 2D array : ");
        int column = sc.nextInt();
        int[][] a = new int[row][column];
        int[] rowSum = new int[row];
        int[] columnSum = new int[column];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print("Enter element at a["+(i+1)+"] ["+(j+1)+"] : ");
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++){
            rowSum[i] = columnSum[i] = 0;
            for(int j = 0; j < column; j++){
                rowSum[i] += a[i][j];
                columnSum[i] += a[j][i];
            }
        }


        for(int i = 0; i <= row ; i++){
            for(int j = 0; j < column; j++){
                if(i == row)
                    System.out.print(columnSum[j]+"\t");
                else
                    System.out.print(a[i][j]+"\t");
            }
            if(i != row)
                System.out.println(rowSum[i]);
        }

    }
}
