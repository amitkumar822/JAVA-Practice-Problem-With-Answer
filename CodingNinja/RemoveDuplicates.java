package CodingNinja;
import java.util.Scanner;
public class RemoveDuplicates {


    public static String removeConsecutiveDuplicates(String s) {

        int i = 0;
        int j = 0;
        String newElements = "";

        // Iterate string using j pointer
        while (j < s.length()) {

            // If both elements are same then skip
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }

            // If both elements are not same then append new
            // element
            else if (s.charAt(j) != s.charAt(i)
                    || j == s.length() - 1) {
                newElements += s.charAt(i);

                // After appending, slide over the window
                i = j;
                j++;
            }
        }

        // Append the last string
        newElements += s.charAt(j - 1);
        return newElements;
    }
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.next();
        System.out.println(removeConsecutiveDuplicates(input));
    }

}
