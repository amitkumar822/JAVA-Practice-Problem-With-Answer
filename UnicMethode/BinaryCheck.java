package UnicMethode;

import java.util.Scanner;

public class BinaryCheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String num="10111"; //100201 //10111
        int len=num.length();
        boolean isBinary=true;
        for (int i=0; i<len; i++){
            int a=num.charAt(i)-'0';
            if (a ==2 || a==3|| a==4 ||a ==5 || a==6|| a==7||a==8||a==9){
                isBinary=false;
            }
        }
        if (isBinary){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
