package CodingNinja.Milestone5.HashMpa;
import java.util.*;
public class RemoveDuplication_UniqueNumber {
    public static ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            map.put(arr[i],true);
        }
        return output;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,2,4,4,1,0,1,4,4,4,5,7,8};
        ArrayList<Integer> output = removeDuplicates(arr);
        for (int i=0; i<output.size(); i++){
            System.out.print(output.get(i)+" ");
        }
    }
}
