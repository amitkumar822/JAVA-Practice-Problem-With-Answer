package CodingNinja;

public class Subsequence {
    public static void printSubsequence(String input, String outputSoF){
        if (input.length() == 0){
            System.out.println(outputSoF);
            return;
        }
        //we chose not to include the first character
        printSubsequence(input.substring(1), outputSoF);
        //we choose to include the first character
        printSubsequence(input.substring(1), outputSoF+input.charAt(0));
    }

    public static void printSubsequence(String input){

        printSubsequence(input,"");
    }
    public static void main(String[] args) {

        printSubsequence("xyz");
    }
}
