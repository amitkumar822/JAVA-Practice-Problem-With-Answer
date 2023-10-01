package RecursionApnaCollege;

import java.util.Scanner;

public class FibonacciSequence {
    public static void printFibonacci(int n,int a, int b){
        if (n==0) {
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        printFibonacci(n-1,b,c);

    }
    public static void main(String[] args) {
        int a=0, b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fibonacci Number : ");
        int n = sc.nextInt();

        System.out.println("Fibonacci is here : ");
        System.out.print(a+" ");
        System.out.print(b+" ");
        printFibonacci(n-2,a,b);
    }
}
