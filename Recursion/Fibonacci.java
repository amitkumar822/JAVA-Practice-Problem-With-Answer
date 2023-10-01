package Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n = sc.nextInt();
        int ans = fib(n);
        System.out.println("Fibonacci number is = "+ans);
    }
}
