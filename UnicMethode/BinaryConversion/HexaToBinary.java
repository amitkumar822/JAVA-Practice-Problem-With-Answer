package UnicMethode.BinaryConversion;

import java.util.Scanner;

public class HexaToBinary {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String str = sc.nextLine();

        // Convert the hexadecimal string to binary
        String ans = hexToBinary(str.trim());

        System.out.println("Binary representation: " + ans);

        sc.close();
    }

    public static String hexToBinary(String hexString) {
        String Result = "";
        int len = hexString.length();

        // Iterate through each character in the hexadecimal string
        for (int i = 0; i < len; i++) {
            char hexChar = hexString.charAt(i);

            // Convert each hexadecimal character to binary
            String binaryChar = Integer.toBinaryString(Integer.parseInt(String.valueOf(hexChar), 16));

            // Pad the binary representation with leading zeros if necessary
            while (binaryChar.length() < 4) {
                binaryChar = "0" + binaryChar;
            }

            // Append the binary representation of the current character to the result string
            Result += binaryChar;
        }

        return Result;
    }
}

/*
Enter a hexadecimal number: 1AC5
Binary representation: 0001101011000101
 */
