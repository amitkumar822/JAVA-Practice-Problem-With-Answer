package CodingNinja;

import java.util.Scanner;

public class Staircase {
    public static int StaircaseN(int input){
        if (input==0){
            return 1;
        } else if (input < 0) {
            return 0;
        }else {
            return StaircaseN(input-3)+StaircaseN(input-2)+StaircaseN(input-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Staircase Number : ");
        int input = sc.nextInt();
        System.out.println("Staircase result is hear : ");
        System.out.println(StaircaseN(input));
    }
}
