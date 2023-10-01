package PwSkills_College_Wala.HashMap.HashMap_Problem;

import java.util.HashMap;

public class IsomorphicStrings {
    static boolean isIsomorphic(String s,String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);
            if(mp.containsKey(sCh)){
                if(mp.get(sCh) != tCh) return false;
            }else if(mp.containsValue(tCh)){
                return false;
            }else {
                mp.put(sCh,tCh);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg", t = "add";
        if(isIsomorphic(s,t)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
