package UnicMethode;

import java.util.Scanner;

public class LeapYears2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Year : ");
        int year = sc.nextInt();

        boolean leap=false;
        if (year%400==0) {
            leap=true;
        } else if (year % 4 == 0 && year % 100 == 0) {
            leap=true;
        }else {
            leap=false;
        }

        // Final result check
        if (leap){
            System.out.println(year+" is leap year");
        }else {
            System.out.println(year+" is not leap year");
        }
    }
}
