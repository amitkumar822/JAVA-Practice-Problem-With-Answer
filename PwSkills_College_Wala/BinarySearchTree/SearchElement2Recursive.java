package PwSkills_College_Wala.BinarySearchTree;

public class SearchElement2Recursive {
    static boolean BST(int[] arr,int target,int start,int end){
        if(start > end) return false; // base case
        int mid = (start+end)/2;
        if(arr[mid] == target){
            return true;
        } else if (target < arr[mid]) {
            return BST(arr,target,start,end-1); // subproblems
        }else {
            return BST(arr,target,start+1,end);// subproblems
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        System.out.println(BST(arr,target,0,arr.length-1));
    }
}
