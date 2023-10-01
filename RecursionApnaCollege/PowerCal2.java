package RecursionApnaCollege;

import java.util.Scanner;

public class PowerCal2 {
    public static int printPow(int x,int n){
        if (n==0) return 1;
        if (x==0) return 0;

        if (n%2==0){
            return printPow(x,n/2)*printPow(x,n/2);
        }else {
            return printPow(x,n/2)*printPow(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Base Number X : ");
        int x = sc.nextInt();
        System.out.println("Enter Your Power Value n : ");
        int n= sc.nextInt();
        System.out.println("Result is here : ");
        int ans = printPow(x,n);
        System.out.println(ans);
    }
}
