package UnicMethode;

import java.util.Scanner;

public class CalculateBasicSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic salary : ");
        double basic = sc.nextDouble();
        double hra,da;
        if(basic <=10000){
            hra = 0.8*basic;
            da = 0.2*basic;
        } else if (basic <= 20000) {
            hra = 0.25*basic;
            da = 0.9*basic;
        }else{
            hra = 0.3*basic;
            da = 0.95*basic;
        }
        double grossSalary = basic+hra+da;

        System.out.println("Final GrossSalary is here : ");
        System.out.printf("%.2f",grossSalary);
    }
}
