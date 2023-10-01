package UnicMethode;

public class SumWhenSingleUnitSUm {
    static int findSum(int n){
        int sum=0;
        while (n>0 || sum>9){
            if (n==0){
                n = sum;
                sum=0;
            }
            sum += n%10;
            n /=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=23425;
        System.out.println(findSum(n));
    }
}
