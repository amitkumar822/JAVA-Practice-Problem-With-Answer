package PreplnstaOnlineQuiestionAndCodeProvide;

public class Factorial {
    static int factorialCal(int n){
        if(n==0) return 1;
        return n*factorialCal(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorialCal(n));
    }
}
