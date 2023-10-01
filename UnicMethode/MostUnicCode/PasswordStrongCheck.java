package UnicMethode.MostUnicCode;

import java.util.Scanner;

public class PasswordStrongCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password");
        String str = sc.nextLine();
        int len = str.length();

        int count1=0,count2=0,count3=0,count4=0;
        for (int i=0; i<len; i++){
            char ch = str.charAt(i);
            if (ch >= 97 && ch<=122){
                count1++;
            } else if (ch >= 65 && ch <= 90) {
                count2++;
            } else if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64)) {
                count3++;
            } else if (ch >= 48 && ch <= 57) {
                count4++;
            }
        }
        if(len>=8) {
            if (count1 > 0 && count2 > 0 && count3 > 0 && count4 > 0) {
                System.out.println("Password strong");
            } else {
                System.out.println("Password is not strong");
            }
        }else {
            System.out.println("Password is not strong");
        }
    }
}

//Check password is strong or not
//password at lest ->8 (length password),one special char, one number ,one uppercase ,one lower case minimum

//Ex:-rakesh@1995kumar-> Password not strong
//Ex:-%ba7RNFm -> Password is strong

