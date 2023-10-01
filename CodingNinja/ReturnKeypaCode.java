package CodingNinja;

import java.util.Scanner;
public class ReturnKeypaCode {

    public static String[] keypad(int n){
        if(n == 0){
            return new String[]{""};
        }

        String[] recu = keypad(n / 10);
        String[] help = helper(n % 10);
        String[] newAns = new String[recu.length * help.length];

        int index = 0;
        for(int i = 0; i < recu.length; i++){
            for(int j = 0; j < help.length; j++){
                newAns[index] = recu[i] + help[j];
                index++;
            }
        }

        return newAns;
    }

    private static String[] helper(int n) {
        String[] arr1 = new String[3];
        String[] arr2 = new String[4];
        if (n == 2) {
            arr1[0] = "a";
            arr1[1] = "b";
            arr1[2] = "c";
            return arr1;
        }
        if (n == 3) {
            arr1[0] = "d";
            arr1[1] = "e";
            arr1[2] = "f";
            return arr1;
        }
        if (n == 4) {
            arr1[0] = "g";
            arr1[1] = "h";
            arr1[2] = "i";
            return arr1;
        }
        if (n == 5) {
            arr1[0] = "j";
            arr1[1] = "k";
            arr1[2] = "l";
            return arr1;
        }
        if (n == 6) {
            arr1[0] = "m";
            arr1[1] = "n";
            arr1[2] = "o";
            return arr1;
        }
        if (n == 7) {
            arr2[0] = "p";
            arr2[1] = "q";
            arr2[2] = "r";
            arr2[3] = "s";
            return arr2;
        }
        if (n == 8) {
            arr1[0] = "t";
            arr1[1] = "u";
            arr1[2] = "v";
            return arr1;
        }
        if (n == 9) {
            arr2[0] = "w";
            arr2[1] = "x";
            arr2[2] = "y";
            arr2[3] = "z";
            return arr2;
        }
        return new String[0];
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        String output[] = keypad(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
