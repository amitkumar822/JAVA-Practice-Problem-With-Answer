import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        boolean isEq = (i == j);
        boolean nEq = (i != j);
        boolean isGr = (i >j);
        boolean isGrEq = (i>=j);
        boolean isLess = (i<j);
        boolean isLessEq = (i<=j);

        System.out.println("Is equal "+isEq);
        System.out.println("Is Not Equal "+nEq);
        System.out.println("Is Greater "+isGr);
        System.out.println("Is Greater Equal "+isGrEq);
        System.out.println("Is Less "+ isLess);
        System.out.printf("Is Less Equal "+isLessEq);
    }
}
