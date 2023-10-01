package RecursionApnaCollege;

import Placment.FindeOccurance;

public class LastOccuranceFind {
    public static int first = -1;
    public static int last =-1;
    public static void FindOccurLast(String str, int ind, char element){
        if (ind == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(ind);
        if (currChar == element){
            if (first == -1){
                first = ind;
            }else {
                last = ind;
            }
        }
        FindOccurLast(str,ind+1,element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";

        System.out.println("Result is here : ");
        FindOccurLast(str,0,'a');
    }
}
