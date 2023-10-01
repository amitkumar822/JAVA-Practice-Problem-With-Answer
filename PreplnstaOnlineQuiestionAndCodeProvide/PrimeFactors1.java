package PreplnstaOnlineQuiestionAndCodeProvide;

public class PrimeFactors1 {
    public static int isPrime(int n){
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void primeFactors(int num){
        for(int i=2; i<=num; i++){
            if (isPrime(i)==1){
                int x=num;
                while (x%i==0){
                    System.out.print(i+" ");
                    x /=i;
                }
            }
        }
    }
    public static void main(String[] args) {
        int num=90;
        primeFactors(num);
    }
}
