package SelfWork;

import java.util.Scanner;

public class ArmstrongGivenRange {
    static void isArmstrong(int num, int len){
        int result =0;
        int org=num;
        while (num !=0){
            int rd = num%10;
            result += Math.pow(rd,len);
            num /=10;
        }
        if (org == result){
            System.out.print(result+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int first = sc.nextInt();
        System.out.println("Enter Last Number : ");
        int last = sc.nextInt();

        System.out.println("Final Armstrong "+first+" to "+last+" is : ");
        for (int i=first; i<=last; i++){
            int len = String.valueOf(i).length();
            isArmstrong(i,len);
        }
    }
}
