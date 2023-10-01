package CodingNinja.Milestone5.PriorityQueues;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int min = 0,max = 0,temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= max) {
                max = arr[i];
            }
            }
        for(int i=1;i<arr.length;i++){
            if(arr[0] < arr[i]){
                
            }
        }
        System.out.println(min+" "+max);

    }
}
