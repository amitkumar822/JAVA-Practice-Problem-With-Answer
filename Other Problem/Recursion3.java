import java.util.Scanner;

public class Recursion3 {
    public static void printSum(int i, int n, int sum){
        if (i == n){
          sum += i;

            System.out.println("Sum of "+n+ " Number = ");
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sum calculate number : ");
        int n = sc.nextInt();
        int i = 1, sum = 0;
      printSum(i, n, sum);
    }
}
