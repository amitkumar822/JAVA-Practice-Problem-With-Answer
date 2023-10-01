package ZZ_StartingTimePr;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter ZZ_StartingTimePr.Array size ");
        int size = sc.nextInt();
        System.out.println("Enter ZZ_StartingTimePr.Array number ");
        int numbers[] = new int[size];

        //input
        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        //output
        for (int i=0; i<size; i++) {
            System.out.println("Out put ZZ_StartingTimePr.Array "+numbers[i]);
        }
    }
}
