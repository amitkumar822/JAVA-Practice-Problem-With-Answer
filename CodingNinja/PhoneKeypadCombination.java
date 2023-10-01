package CodingNinja;

import java.util.Scanner;

public class PhoneKeypadCombination {
    public static void phonekey(int input){
       helpers(input, "");
    }
    public static void helpers(int num, String output){
        if (num==0){
            System.out.println(output);
            return;
        }
        String pd = keypads(num%10);
        for (int i=0; i<pd.length(); i++){
            helpers(num/10,pd.charAt(i)+output);
        }
    }
    public static String keypads(int n){
        if (n==0 || n==1){
            return "";
        } else if (n == 2) {
            return "abc";
        } else if (n == 3) {
            return "def";
        } else if (n == 4) {
            return "ghi";
        } else if (n == 5) {
            return "jkl";
        } else if (n == 6) {
            return "mno";
        } else if (n == 7) {
            return "pqrs";
        } else if (n == 8) {
            return "tuv";
        }else {
            return "wxyz";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Keypad Number: ");
        int input = sc.nextInt();
        phonekey(input);
    }
}
