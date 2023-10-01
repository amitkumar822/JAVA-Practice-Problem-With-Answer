package RecursionApnaCollege;

public class SumNnaturalNumber {
    public static void printSum(int n, int sum, int i){
        if (n == i){
            sum += i;
            System.out.println("Total Sum All Natural Number : ");
            System.out.println(sum);
            return;
        }
        sum += i;

        printSum(n,sum,i+1);
    }
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        int i=1;
        printSum(n,sum,i);
    }
}
