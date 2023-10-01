package Recursion;
import java.util.Scanner;

public class Runner1 {

    public static boolean checkNumber(int input[], int x) {
        return checkNumber(input,x,0);
    }
    private static boolean checkNumber(int input[],int x,int startIndex){
        if(startIndex==input.length)
            return false;
        if(input[startIndex]==x)
            return true;
        return checkNumber(input,x,startIndex+1);
    }
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(checkNumber(input, x));
    }
}
