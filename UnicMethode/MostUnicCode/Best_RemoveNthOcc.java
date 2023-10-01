package UnicMethode.MostUnicCode;

import java.util.Scanner;

public class Best_RemoveNthOcc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input string:");
        String str = sc.nextLine();

        System.out.println("Enter the target string to remove:");
        String target = sc.nextLine();

        System.out.println("Enter the occurrence (n) to remove:");
        int n = sc.nextInt();

        String result = removeNthOccurrence(str, target, n);
        System.out.println("Result: " + result);

        sc.close();
    }

    public static String removeNthOccurrence(String str, String target, int n) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            index = str.indexOf(target, index + 1);
            if (index == -1) {
                // The target substring doesn't exist or has fewer occurrences than n.
                return str;
            }
        }

        // Remove the nth occurrence of the target substring from the input string.
        String beforeOccurrence = str.substring(0, index);
        String afterOccurrence = str.substring(index + target.length());
        return beforeOccurrence + afterOccurrence;
    }
}


// String input = "Hello What do you think? Hello here we come";
//target = Hello;
//n=2
//output -> Hello What do you think?  here we come