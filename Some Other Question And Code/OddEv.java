import java.util.Scanner;

public class OddEv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter check even or odd number : ");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("Even");
            return;
        }
//        else {
//            System.out.println("Odd");
//        }
        System.out.println("Odd");
    }
}
