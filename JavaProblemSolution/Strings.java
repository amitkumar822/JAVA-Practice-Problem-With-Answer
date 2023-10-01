package ZZ_StartingTimePr;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name or Later : ");
        String first = sc.nextLine();

        System.out.println("Enter Last Name or Later : ");
        String last = sc.next();

        String FullName = first +" "+ last;


        System.out.println("Full Name or Addition Name : ");
        System.out.println(FullName);
//

        System.out.println("String Length : ");
        System.out.println(FullName.length());
//
//        for (int i=0; i<FullName.length(); i++) {
//            System.out.println(FullName.charAt(i));
//        }



        //if condition string
        //1 s1> s2: +ve value
        //1 s1 == s2: 0
        //1 s1 < s2: -ve value

//       if (first.compareTo(last) == 0) {
//           System.out.println("String are equal");
//       }else {
//           System.out.println("String are not equal");
//       }


//        String sentence = "AmitKumarSingh";
//        String name = sentence.substring(3);
//        System.out.println(name);
    }
}
