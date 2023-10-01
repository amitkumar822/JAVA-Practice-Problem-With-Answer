package CodingNinja.Milestone5.HashMpa;

import java.util.HashMap;

public class ExtractUniqueCharacters {
    static String UniqueChar(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        int len =str.length();
        String result = "";
        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                result += ch;
                map.put(ch,1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "ababacd";
        String result = UniqueChar(str);
        System.out.print(result);
    }
}
