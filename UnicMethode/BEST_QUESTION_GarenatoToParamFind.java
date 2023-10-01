package UnicMethode;

import java.util.Scanner;

public class BEST_QUESTION_GarenatoToParamFind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"Mohan","Kumar", "Gram","Teresa","Plum","Green","Kumar","Kishan","Teresa","Param","Green","Camaroon"};
        int len=str.length;
        String F = "Gram";

        //find Garena next
        String rs="";
        int idx =-1;
        for (int i=0; i<len; i++){
            String s=str[i];
            if (s==F){
                idx = i+1;
                rs = str[i+1];
            }
        }

        //find next taresa
        boolean isNot=true;
        for (int i=(idx+1); i<len; i++){
            String ans = str[i];
            if (ans == rs){
                isNot=false;
                String result = str[i+1];
                System.out.print(result+" ");
            }
        }
        if (isNot){
            System.out.println(idx);
        }
    }
}
