package Placment;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int n,r;
        n=s.nextInt();

        while (n>0){
            r = n%10;
            System.out.print(r);
            n=n/10;
        }
    }
}
