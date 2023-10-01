package CodingNinja;

import java.util.*;
public class SumOfDigits {

    public static int sumOfDigits(int input){
        // Write your code here

        if (input == 0){
            return 0;
        }
        int sum =0;
        for (int i = 0; i<input-1; i++){
            sum = sum +i;
            sum++;
        }
        return sum;

//        if(input==0)
//        {
//            return 0;
//        }
//        return input%10+sumOfDigits(input/10);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 12345;
        System.out.println(sumOfDigits(n));
    }
}
