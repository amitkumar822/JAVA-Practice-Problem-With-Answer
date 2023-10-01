package CodingNinja;
import java.util.Scanner;
public class KeypadCombination {

    public static void printKeypad(int input){
        // Write your code here
        helper(input,"");

    }

    public static void helper(int num, String output){
        if (num == 0){
            System.out.println(output);
            return;
        }
        String ans = keypad(num%10);
        for (int i=0; i<ans.length(); i++){
            helper(num/10,ans.charAt(i)+output);
        }
    }

    public static String keypad(int n){
        if (n==0 || n==1){
            return "";
        } else if (n==2) {
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
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        printKeypad(input);
    }
}
