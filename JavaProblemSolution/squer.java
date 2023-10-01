package ZZ_StartingTimePr;

import java.util.*;
public class squer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        int n=9;
        for(int i=1;i<=n;i++) {
            for (int j=1; j<=i-1; j++)  {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--) {
            for (int j=1; j<=i-1; j++)  {
                System.out.print(" B");
            }
            System.out.println();
        }
    }
}
