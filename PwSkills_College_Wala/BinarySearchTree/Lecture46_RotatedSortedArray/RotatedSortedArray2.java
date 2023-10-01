package PwSkills_College_Wala.BinarySearchTree.Lecture46_RotatedSortedArray;

public class RotatedSortedArray2 {
    static int search(int[] arr,int target){
        int st =0,end=arr.length-1;
        while (st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < arr[end]) {//mid to end sorted
                if(target>arr[mid] && target < arr[end]){
                    st=mid+1;
                }else {
                    end=mid-1;
                }
            }else{ // st to mid is sorted
                if(target >= arr[st] && target < arr[mid]){
                    end = mid-1;
                }else {
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={3,4,5,1,2};
        int target = 5;
        System.out.println(search(arr,target));
    }
}
