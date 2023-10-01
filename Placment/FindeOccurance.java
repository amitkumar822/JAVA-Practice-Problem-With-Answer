package Placment;

public class FindeOccurance {
    public static int first = -1;
    public static int last = -1;
    public static void findOcc(String str, int ind, char element){
        if (ind == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currCha = str.charAt(ind);
        if (currCha == str.charAt(ind)){
            if (first == -1){
                first = ind;
            }else {
                last = ind;
            }
        }
        findOcc(str, ind+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOcc(str,0,'a');
    }
}
