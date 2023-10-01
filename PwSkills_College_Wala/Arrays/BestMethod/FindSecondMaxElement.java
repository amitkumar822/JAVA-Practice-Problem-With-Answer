package PwSkills_College_Wala.Arrays.BestMethod;

import java.util.Scanner;

public class FindSecondMaxElement {
    static int findMax(int[] arr){
        int len = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<len; i++){
            if (arr[i] > max){
                max =  arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int[] arr){
        int max = findMax(arr);
        int len = arr.length;
        for (int i=0; i<len; i++){
            if (arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter "+size+" element: ");
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Final Second Max Is "+findSecondMax(arr));
    }
}
