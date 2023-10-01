package Placment;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");

        String str = sc.nextLine();
        StringBuffer r = new StringBuffer(str);
        System.out.println(r.reverse());
    }
}
