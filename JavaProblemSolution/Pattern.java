package ZZ_StartingTimePr;

import java.util.Scanner;

public class Pattern {
    public static void main(String args[]){
        int s=0,p=0;
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n = sc.nextInt();
        for(int i=1;i<m-1;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==n || (j==s || j==p) && i<=4/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            if(i==1){
                s=n-4;
                p=n;
            }
            s++;
            p--;
        }
    }
}