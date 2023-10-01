package PwSkills_College_Wala.BinarySearchTree;

public class SearchElement1 {
    public static boolean binarysearch(int[] arr,int target){
        int len = arr.length;
        int start =0,end = len-1;
        while (start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return true;
            } else if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        System.out.println(binarysearch(arr,target));
    }
}
