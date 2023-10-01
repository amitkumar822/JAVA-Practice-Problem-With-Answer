import java.util.Scanner;

public class CelToFah {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter celsius value : ");
        int c = sc.nextInt();

        System.out.println("Fahrenheit value is here : ");
        float fah = (c*9)/5f+32;

        System.out.println(fah);
    }
}
