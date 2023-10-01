package Placment;

import java.util.Scanner;

public class PowerCal {
    public static int printPower(int x, int n){
        if (n==0){
            return 1;
        }
        if (n == 0){
            return 0;
        }
        int pow = printPower(x,n-1);
        int powerS = x*pow;
        return powerS;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number : ");
        int x= sc.nextInt();
        System.out.println("Enter power number : ");
        int n= sc.nextInt();

        int ans = printPower(x,n);
        System.out.println("Result "+x+" power "+n+" is ");
        System.out.println(ans);
    }
}
