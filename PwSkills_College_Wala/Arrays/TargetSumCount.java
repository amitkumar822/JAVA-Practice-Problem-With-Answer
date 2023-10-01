package PwSkills_College_Wala.Arrays;

import java.util.Scanner;

public class TargetSumCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Size: ");
        int size = sc.nextInt();

        int[] num = new int[size];
        System.out.println("Enter "+size+" element: ");
        for(int i=0; i<size; i++){
            num[i]= sc.nextInt();
        }

        System.out.println("Enter target element: ");
        int count=0;
        int target = sc.nextInt();
        for (int i=0; i<size; i++){
            for (int j=i+1; j<size; j++){
                if (num[i]+num[j] == target){
                    count++;
                }
            }
        }
        System.out.println("Final result : ");
        System.out.println(count);
    }
}
