package UnicMethode.MostUnicCode;

import java.util.*;

public class Best_LowUpeCaseRemoveRep {
    //Lower case program
    public static String LowerPro(String input) {
        Set<Character> seenCharacters = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!seenCharacters.contains(currentChar)) {
                seenCharacters.add(currentChar);
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    // Upper case program
    static final int NO_OF_CHARS = 256;
    static void printUpper(String str)
    {
        int[] count = new int[NO_OF_CHARS];

        int i;
        for (i = 0; i < str.length(); i++)
            if(str.charAt(i)!=' ')
                count[(int)str.charAt(i)]++;
        int n = i;

        // Print characters having count more than 0
        for (i = 0; i < n; i++)
            if (count[(int)str.charAt(i)] == 1)
                System.out.print(str.charAt(i));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String input : ");
        String str = sc.nextLine();

        int len =str.length();
        int count=0;
        for(int i=0; i<len; i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        if (len == count){
            printUpper(str);
        }else {
            String res = LowerPro(str);
            System.out.println(res);
        }

    }
}

//input(lowerCase) semester ->(output) : semtr
//input ABADEAEC -> BDC
//ABCD -> ABDC
//THIS QUESTION COLLEGE TEST S2 LEVEL2 Q3