import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Fahrenheit value covert to Celsius : ");
        int f = sc.nextInt();

        System.out.println("Degree celsius value is here : ");
        float cel = (5*(f-32))/9f;

        System.out.println(cel);
    }
}
