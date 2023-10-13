package CodingNinja.Milestone5.DynamicProgramming_DP_1;

public class Fibonacci {
    /*-----------This Fibonacci function time complexity 2^n -------------------*/
    public static int fibonacci(int n){
        if(n==0 || n==1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    /*-----------This Fibonacci function End time complexity 2^n -------------------*/

    /*--------------------------Another(Memoization Function) FibonacciM Function-----------------------------------*/
    //Time complexity this Memoization function -> O(n)
    //This function use extra space
    public static int fibM(int n){
        int[] storage = new int[n+1];
        for (int i=0; i<=n; i++){
            storage[i] = -1;
        }
        return fibM(n,storage);
    }
    private static int fibM(int n,int[] storage){
        if(n==0 || n==1){
            storage[n]=n;
            return storage[n];
        }
        if(storage[n] != -1){
            return storage[n];
        }
        storage[n] = fibM(n-1,storage)+fibM(n-2,storage);
        return storage[n];
    }

    /*--------------------------End Another FibonacciM Function-----------------------------------*/

    /*-------------------------Dynamic Programming Function--------------------------------------*/

    public static int fibDP(int n){
        int[] storage = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        for (int i=2; i<=n; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }
    /*-------------------------End Dynamic Programming Function--------------------------------------*/
    public static void main(String[] args) {
        int n = 120;
        System.out.println(fibDP(n));
        System.out.println(fibM(n));
        System.out.println(fibonacci(n));
    }
}
