package PwSkills_College_Wala.Arrays;

import java.util.Scanner;

public class FindLastMax {
    static int firstMin(int[] arr){
        int len = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<len; i++){
            for (int j=i+1; j<len; j++){
                if (arr[j] < min){
                    min = arr[j];
                }
            }
        }
        return min;
    }
    static int LastMin(int[] arr){
        int min = firstMin(arr);
        int len = arr.length;
        for (int i=0; i<len; i++){
            for (int j=0; j<len; j++){
                if (arr[i] == min){
                    arr[i] = Integer.MAX_VALUE;
                }
            }
        }
        int result = firstMin(arr);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Min number is "+LastMin(arr));
    }
}
