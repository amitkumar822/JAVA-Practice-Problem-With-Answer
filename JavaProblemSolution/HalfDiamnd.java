package ZZ_StartingTimePr;

import java.util.Scanner;

class HelfDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println("*");
        for (int i=1; i<=N; i++){
            System.out.print("*");

            int val=1;

            for (int j=0; j<i; j++){
                System.out.print(val);
                val++;
            }
            val--;
            for (int j=1; j<i; j++){
                --val;
                System.out.print(val);
            }
            System.out.println("*");
        }
        for (int i=0; i<N; i++){
            System.out.print("*");
            int val=1;

            for (int j=0; j<(N-i-1); j++){
                System.out.print(val);
                val++;
            }
            val=val-2;
            for (int j=val; j>=1;j--){
                System.out.print(j);
            }
            if (i<N-1){
                System.out.println("*");
            }
            else {
                System.out.println(" ");
            }
        }
        if(N==0){
            System.out.println("*");
        }

    }
}