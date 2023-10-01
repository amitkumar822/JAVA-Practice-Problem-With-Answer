package SelfWork;

import java.util.Scanner;

public class ArmstrongCheck {
    static boolean isArmstrong(int number){
        int original = number;
        int len = String.valueOf(number).length();
        int result = 0;

        while(number != 0){
            int rd = number%10;
            result += Math.pow(rd,len);
            number /=10;
        }
        return original == result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Armstrong Number : ");
        int number = sc.nextInt();
        System.out.println("Final Result is here : ");
        if (isArmstrong(number))
            System.out.println(number+" is Armstrong ");
        else
            System.out.println(number+" is not Armstrong ");
    }
}
