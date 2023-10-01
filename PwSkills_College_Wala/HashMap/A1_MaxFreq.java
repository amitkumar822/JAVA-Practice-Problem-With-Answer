package PwSkills_College_Wala.HashMap;

import java.util.*;

public class A1_MaxFreq {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,1,2,3,6,4,4,1,2,3,5,4,6,4,4};
        Map<Integer,Integer> freq= new HashMap<>();
        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else{
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println("Frequency Map: ");
        System.out.println(freq.entrySet());

        int maxFreq=0, ansKey=-1;

//        //1st Method
//        for (var e : freq.entrySet()){
//            if (e.getValue() > maxFreq){
//                maxFreq = e.getValue();
//                ansKey = e.getKey();
//            }
//        }
//        System.out.printf("%d has max frequency and it occurs %d times",ansKey,maxFreq);
//        //1st method end

        //2nd method
        for (var Key : freq.keySet()){  //Time complexity = O(n)
            if (freq.get(Key) > maxFreq){
                maxFreq = freq.get(Key);
                ansKey = Key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times",ansKey,maxFreq);
    }
}
