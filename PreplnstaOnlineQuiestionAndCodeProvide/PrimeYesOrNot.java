package PreplnstaOnlineQuiestionAndCodeProvide;

import java.util.Scanner;

public class PrimeYesOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        boolean isPrime= true;

        if (n<2){
            isPrime=false;
        }else {
            for(int i=2; i<n; i++){
                if (n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        // Final decision
        String result = isPrime ? "Prime" : " not Prime";
        System.out.println("This number "+n+" is "+result);
    }
}
