package UnicMethode;

import java.util.Scanner;

public class StringEqualCheck_BestQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Consume the newline left after reading the integer T

        for (int t = 0; t < T; t++) {
            String[] input = sc.nextLine().split(" ");
            String S1 = input[0];
            String S2 = input[1];

            if (FindeEqual(S1, S2)) {
                System.out.println("ZZ_StartingTimePr.Strings are equal");
            } else {
                System.out.println("ZZ_StartingTimePr.Strings are not equal");
            }
        }
        sc.close();
    }

    private static boolean FindeEqual(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }
}
