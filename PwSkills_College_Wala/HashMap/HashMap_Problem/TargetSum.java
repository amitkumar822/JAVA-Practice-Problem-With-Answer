package PwSkills_College_Wala.HashMap.HashMap_Problem;

import java.util.HashMap;

public class TargetSum {
    static int[] findTargetSum(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(target-arr[i])){
                 return new int[]{map.get(target-arr[i]),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int idx[] = findTargetSum(nums,target);
        if(idx.length == 2){
            System.out.println(idx[0]+" "+idx[1]);
        }else {
            System.out.println(-1+" "+-1);
        }
    }
}
