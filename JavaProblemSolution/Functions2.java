package ZZ_StartingTimePr;

import java.util.Scanner;

public class Functions2 {
    public static int calculateSum(int a, int b) {
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value ");
        int a= sc.nextInt();
        System.out.println("Enter b value ");
        int b= sc.nextInt();

        int sum= calculateSum(a,b);
        System.out.println("a & b sum calculate is here  "+sum);
    }
}
