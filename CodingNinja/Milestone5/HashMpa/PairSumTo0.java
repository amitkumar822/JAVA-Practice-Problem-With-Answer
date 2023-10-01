package CodingNinja.Milestone5.HashMpa;

import java.util.HashMap;

public class PairSumTo0 {
    static int pairSumFound(int[] arr){
        int len = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int pairSum=0;
        for (int i=0; i<len; i++){
            int currElement = arr[i];
            int complement = -currElement;
            if(map.containsKey(complement)){
                pairSum += map.get(complement);
            }
            map.put(currElement,map.getOrDefault(currElement,0)+1);
        }
        return pairSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,-2,2,3};// 2
        int res = pairSumFound(arr);
        System.out.print(res);
    }
}
