package RecursionApnaCollege;

import java.util.Scanner;

public class PowerCal {
    public static int printPow(int x, int n){
        if (n==0) return 1;
        if (x==0) return 0;

        int pow = printPow(x,n-1);
        int res = pow*x;
        return res;
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
