package PwSkills_College_Wala.BinarySearchTree.Lecture46_RotatedSortedArray;

public class findMin1 {
    public static int findMinRotateArrays(int[] arr){
        int len = arr.length;
        int start =0,end =len-1 , ans=-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<=arr[mid-1]){
                ans=mid;
                end = mid-1;
            }else {
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,2};
        System.out.println(findMinRotateArrays(arr));
    }
}
