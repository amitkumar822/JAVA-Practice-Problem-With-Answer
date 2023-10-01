package PwSkills_College_Wala.HashMap.HashMap_Problem;

import java.util.HashMap;

public class ValidAnagram_HashMap_Using {
    static HashMap<Character,Integer> Freq(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        return map;
    }
    static boolean isAnagram(String s,String t){
        HashMap<Character,Integer> mp1 = Freq(s);
        HashMap<Character,Integer> mp2 = Freq(t);
        return mp1.equals(mp2);
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        if(isAnagram(s,t)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
