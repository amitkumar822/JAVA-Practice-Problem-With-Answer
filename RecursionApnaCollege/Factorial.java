package RecursionApnaCollege;

public class Factorial {
    public static int printFact(int n){
        if (n==0 || n==1){
            return 1;
        }
        int fact = printFact(n-1);
        int ans = fact*n;
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int result = printFact(n);
        System.out.println("ZZ_StartingTimePr.Factorial of "+n+" is "+result);

    }
}
