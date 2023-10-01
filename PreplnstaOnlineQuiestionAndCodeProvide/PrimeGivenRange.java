package PreplnstaOnlineQuiestionAndCodeProvide;

import java.util.Scanner;

public class PrimeGivenRange {
    static boolean isPrime(int n){
        if (n<2) return false;
        for (int i=2; i<n; i++){
            if (n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num1 = 1, num2 = 18;
        for (int i=num1; i<num2; i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
