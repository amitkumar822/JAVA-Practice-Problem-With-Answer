package ZZ_StartingTimePr;

import java.util.Scanner;

public class Functions3 {
    public static int calculateProduct(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int a= sc.nextInt();
        System.out.println("Enter a value : ");
        int b= sc.nextInt();

        System.out.println("Product of 2 number is : "+calculateProduct(a,b));
    }
}
