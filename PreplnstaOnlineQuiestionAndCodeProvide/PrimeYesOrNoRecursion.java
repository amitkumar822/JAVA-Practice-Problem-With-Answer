package PreplnstaOnlineQuiestionAndCodeProvide;

import java.util.Scanner;

public class PrimeYesOrNoRecursion {
    static boolean isPrime(int n, int i){
        if (n<2) return false;
        if (i==n) return true;
        if (n%i==0) return false;
        i++;
        return isPrime(n,i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number ");
        int n = sc.nextInt();
        int i=2;
        boolean result = isPrime(n,i);
        if (result) System.out.println("This number "+n+" is Prime");
        else System.out.println("This number "+n+" is not Prime");
    }
}
