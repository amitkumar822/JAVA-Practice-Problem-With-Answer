import java.util.Scanner;

public class SumOfAllNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int i=1;
        int sum = 0;
//        for (int i=1; i<=n; i++){
//            sum = sum +i;
//        }
//        System.out.println(sum);

        while (i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
