package CodingNinja.Milestone5.PriorityQueues;

import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;

public class PriorityQueueUse2 {
    //This function is sorted function
    public static void sortKSorted(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(; i<k; i++){
            pq.add(arr[i]);
        }
        for (;i<arr.length; i++){
            arr[i-k] = pq.remove();
            pq.add(arr[i]);
        }

        for (int j=arr.length-k; j<arr.length; j++){
            arr[j] = pq.remove();
        }
    }

    /*----------------------PrintKLargest---------------------------------------------*/

    public static void printKLargest(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(; i<k; i++){
            pq.add(arr[i]);
        }

        for (; i<arr.length; i++){
            int min = pq.element();
            if(min < arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while (!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
    }


    public static ArrayList<Integer> kLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(; i<k; i++){
            pq.add(arr[i]);
        }

        for (; i<arr.length; i++){
            int min = pq.element();
            if(min < arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!pq.isEmpty()){
            int d = pq.remove();
            list.add(d);
//            System.out.print(pq.remove()+" ");
        }
        return list;
    }

    /*----------------------End PrintKLargest---------------------------------------------*/

    /*----------------------Print K Smallest Element---------------------------------------------*/

    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
        // Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        {
            pq.add(input[i]);
        }

        for(int i=k;i<input.length;i++)
        {
            int maxVal=pq.peek();
            if(maxVal>input[i])
                maxVal=input[i];
            if(maxVal!=pq.peek())
            {
                pq.poll();
                pq.add(maxVal);
            }
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(!pq.isEmpty())
            arr.add(pq.poll());
        return arr;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        int[] arr = {9,1,0,4,7,3};
//        for(int i=0; i<arr.length; i++){
//            pq.add(arr[i]);
//        }
//        //pq.element function find min value
//        System.out.println(pq.element()); // 0


//        find the sorted array
        //this function extra space use
//        while (!pq.isEmpty()){
//            System.out.print(pq.remove()+" "); //0 1 3 4 7 9
//        }

        /*----------------------sortKSorted Function---------------------------------*/

//        int[] arr = {2,4,1,9,6,8}; //1 2 4 6 8 9
//        int k=3;
//        sortKSorted(arr,k);
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }

        /*----------------------End sortKSorted Function---------------------------------*/

        /*----------------------PrintKLargest---------------------------------------------*/

//        int[] arr2 = {2,15,8,9,12,13,20};
//        int k2=3;
//        System.out.print("Final k "+k2 +" Max Element:- ");
//        printKLargest(arr2,k2);
//
//        /*-----------------Using ArrayList --------*/
//        System.out.println();
//        System.out.print("ArrayList Result:- ");
//        ArrayList<Integer> ans = kLargest(arr2,k2);
//        for (int i=0; i<ans.size(); i++){
//            System.out.print(ans.get(i)+" ");
//        }
        /*----------------------End PrintKLargest---------------------------------------------*/

        /*----------------------Print K Smallest---------------------------------------------*/

        int[] arr3 = {2,12,9,16,10,5,3,20,25,11,1,8,6};
        int k3=4;
        ArrayList<Integer> ans2 = kSmallest(arr3.length,arr3,k3);
        for (int i=ans2.size()-1; i>=0; i--){
            System.out.print(ans2.get(i)+" ");
        }

        /*----------------------End Print K Smallest---------------------------------------------*/

    }
}
