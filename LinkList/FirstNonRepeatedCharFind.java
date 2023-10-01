package LinkList;

import java.util.Scanner;

public class FirstNonRepeatedCharFind {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String str = s.nextLine();

        System.out.println("First non repeated Character : ");

        for(int i=0; i<str.length(); i++){
            int count =0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(str.charAt(i));
                break;
            }

        }
    }
}
