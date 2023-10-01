package Placment;

import java.util.Scanner;

public class RomanNumber {
    public static int printRom(String s){
        int ans =0, num =0;
        for(int i=s.length()-1; i>=0; i--){
            switch (s.charAt(i)){
                case 'I' : num = 1; break;
                case 'V' : num = 5; break;
                case 'X' : num = 10; break;
                case 'L' : num = 50; break;
                case 'C' : num = 100; break;
                case 'D' : num = 500; break;
                case 'M' : num = 1000; break;
            }
            if(4*num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman alpha : ");
        String s = sc.nextLine();
        System.out.println(printRom(s));
    }
}
