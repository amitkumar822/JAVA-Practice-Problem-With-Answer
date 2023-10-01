package ZZ_StartingTimePr;

import java.util.*;
public class StringBuildersAll {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Amit");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //char add index
        sb.insert(0,'S');
        System.out.println(sb);

        sb.delete(0,2);
        System.out.println(sb);
    }
}
