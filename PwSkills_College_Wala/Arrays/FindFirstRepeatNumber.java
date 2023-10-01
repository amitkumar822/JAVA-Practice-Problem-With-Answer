package PwSkills_College_Wala.Arrays;

import java.util.Scanner;

public class FindFirstRepeatNumber {
    static int firstRepeat(int[] arr){
        int len = arr.length;
        for (int i=0; i<len; i++){
             for (int j=i+1; j<len; j++){
                 if (arr[i] == arr[j]){
                     return arr[i];
                 }
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First Repeat number "+firstRepeat(arr));
    }
}
