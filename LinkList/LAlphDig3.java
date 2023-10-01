package LinkList;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LAlphDig3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number and Digit : ");
        String str = s.nextLine();
        int num = tnum(str);

        System.out.println("Final Result : ");
        System.out.println(num);
    }

    public static int tnum(String str){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int num = Integer.MIN_VALUE;

        while (matcher.find()){
            int find = Integer.parseInt(matcher.group());
            if (find > num){
                num = find;
            }
        }
        return num;
    }
}
