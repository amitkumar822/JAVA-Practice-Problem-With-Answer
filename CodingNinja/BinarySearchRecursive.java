package CodingNinja;
import java.util.Scanner;
public class BinarySearchRecursive {
    public class solution {

        // element - number to be searched
        public static int binarySearch(int input[], int x) {
            // Write your code here
            int n=input.length;
            return binary(input,0,n-1,x);

        }
        public static int binary(int input[], int l, int r, int x){
            if(r>=l){
                int mid=l+(r-l)/2;
                if(input[mid] == x){
                    return mid;
                }else if(input[mid]>x){
                    return binary(input, l, mid-1,x);
                }else{
                    return binary(input,mid+1,r,x);
                }
            }
            return -1;
        }
    }


    static Scanner s = new Scanner(System.in);
    public static int[] takeInput() {
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int element = s.nextInt();
        System.out.println(solution.binarySearch(input, element));
    }
}
