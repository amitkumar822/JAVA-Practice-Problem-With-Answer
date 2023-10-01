package PreplnstaOnlineQuiestionAndCodeProvide;

import java.util.Scanner;

public class SumOfFirstNNumber1 {
    static int getSum(int n){
        if (n==0) return n;
        return n+getSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int n=sc.nextInt();

        //1st Method
        int ans = n*(n+1)/2;
        System.out.println("1st method "+ans);

        //2nd Recursion method
        System.out.println("2nd Method "+getSum(n));
    }
}
