package Placment;

import java.util.Scanner;

public class ArrayTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row Number : ");
        int row = sc.nextInt();

        System.out.println("Enter col Number : ");
        int col = sc.nextInt();

        int number[][] = new int[row][col];

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                number[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
}
