package CodingNinja;
import java.util.*;
public class RemoveX {

    public static String removex(String str){
        if (str.length() == 0){
            return str;
        }
        String ans = "";
        if (str.charAt(0) != 'x'){
            ans = ans + str.charAt(0);
        }
        String smallAns = removex(str.substring(1));
        return ans + smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        System.out.println("Final remove x is hear : ");
        System.out.println(removex(str));
    }
}
