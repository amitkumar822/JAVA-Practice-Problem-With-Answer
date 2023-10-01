package PreplnstaOnlineQuiestionAndCodeProvide;

import java.util.Scanner;

public class SumOfGivenRangeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Range number : ");
        int b = sc.nextInt();

        int sum = b*(b+1)/2 - a*(a+1)/2+a;
        System.out.println(sum);
    }
}
