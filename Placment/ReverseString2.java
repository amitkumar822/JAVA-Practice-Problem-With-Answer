package Placment;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "ABCDEF";
        String stor = "";
        int len = str.length();

        for (int i = len-1; i>=0; i--){
             stor = stor + str.charAt(i);
        }
        System.out.println(stor);
    }
}
