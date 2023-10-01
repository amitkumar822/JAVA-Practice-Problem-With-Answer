package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumber {

    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return sum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Natural Number : ");
        int n = sc.nextInt();
        System.out.println("Sum of "+n+" Natural Number = "+sum(n));
    }
}
