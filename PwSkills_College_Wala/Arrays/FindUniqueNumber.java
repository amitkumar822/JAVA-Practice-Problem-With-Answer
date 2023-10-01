package PwSkills_College_Wala.Arrays;

import java.util.Scanner;

public class FindUniqueNumber {
    static int findUni(int[] num){
        int len = num.length;
        for (int i=0; i<len; i++){
            for (int j=i+1; j<len; j++){
                if (num[i] == num[j]){
                    num[i]=-1;
                    num[j]=-1;
                }
            }
        }

        int result =-1;
        for(int i=0; i<len; i++){
            if (num[i]>0){
                result=num[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter "+size+" element :");
        for (int i=0; i<size; i++){
            num[i]= sc.nextInt();
        }
        System.out.println("Final Unique element is "+findUni(num));
    }
}
