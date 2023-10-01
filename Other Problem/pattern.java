import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter pattern number : ");
        int n=sc.nextInt();

        System.out.println("Digram pattern is here : ");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // inner pattern
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
