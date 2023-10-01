package PwSkills_College_Wala.Arrays;

import java.util.Scanner;

public class FindMinValue {
    static int findMin(int[] arr){
        int len = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<len; i++){
            for (int j=0; j<len; j++){
                if (arr[i] < min){
                    min = arr[i];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Min number is "+findMin(arr));
    }
}
