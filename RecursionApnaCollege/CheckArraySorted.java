package RecursionApnaCollege;

public class CheckArraySorted {
    public static boolean SortedCheck(int arr[], int idx){
        if (idx == arr.length-1){
            return true;
        }
        if (arr[idx] < arr[idx+1]){
            return SortedCheck(arr,idx+1);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Sorted Result is here : ");
        boolean result = SortedCheck(arr,0);
        System.out.println(result);
    }
}
