package ZZ_StartingTimePr;

import java.util.Scanner;

public class Functions4 {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i=n; i>=1; i--) {
            factorial= factorial*i;
        }
        System.out.println("ZZ_StartingTimePr.Factorial is here "+factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter factorial number ");
        int n= sc.nextInt();
        printFactorial(n);
    }
}
