package Placment;

public class CheckArraySorted {
    public static boolean checkSorted(int arr[], int idx){
        if (idx == arr.length-1){
            return true;
        }
        if (arr[idx] < arr[idx+1]){
            return checkSorted(arr,idx+1);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,9,5,6};
        System.out.println(checkSorted(arr,0));
    }
}
