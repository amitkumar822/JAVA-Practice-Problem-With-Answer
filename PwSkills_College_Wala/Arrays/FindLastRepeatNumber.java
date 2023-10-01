package PwSkills_College_Wala.Arrays;

import java.util.Scanner;

public class FindLastRepeatNumber {
    static int lastRepeat(int[] arr){
        int len = arr.length;
        int LastRp = -1;
        for (int i=0; i<len; i++){
            for (int j=i+1; j<len; j++){
                if (arr[i] == arr[j]){
                    LastRp = arr[i];
                }
            }
        }
        return LastRp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Last Repeat element: "+lastRepeat(arr));
    }
}
