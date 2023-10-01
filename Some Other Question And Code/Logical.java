import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        boolean isAlargest = (a>b) && (a>c);
        boolean isBlargest = (b>a) && (b>c);
        boolean isClargest = (c>a) && (c>b);
        System.out.println("A is greater tha all "+isAlargest);
        System.out.println("B is greater tha all "+isBlargest);
        System.out.println("C is greater tha all "+isClargest);
    }
}
