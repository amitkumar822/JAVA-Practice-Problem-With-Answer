package PreplnstaOnlineQuiestionAndCodeProvide;

import CodingNinja.Sum;

import java.util.Scanner;

public class SumDigitGiven {
    static int SumOfString(String digit){
        int sum =0;
        for (int i=0; i<digit.length(); i++){
            sum += digit.charAt(i)-48;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Digits : ");
        String digit = sc.nextLine();
        System.out.println("Total sum is : "+ SumOfString(digit));
    }
}
