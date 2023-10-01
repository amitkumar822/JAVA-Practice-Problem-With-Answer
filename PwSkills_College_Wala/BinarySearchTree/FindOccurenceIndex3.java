package PwSkills_College_Wala.BinarySearchTree;

public class FindOccurenceIndex3 {
    static int firstOccurence(int[] arr,int target){
        int len = arr.length;
        int st=0,end =len-1;
        int fo = -1;

        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==target){
                fo = mid;
                end = mid-1;
            } else if (target < arr[mid]) {
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,7,5,5,5,6,2,4};
        int target = 5;
        System.out.println(firstOccurence(arr,target));
    }
}
