import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && c<a){
            System.out.println(a+" is largest");
        }else {
            if (b>a && c<b){
                System.out.println(b+" is largest ");
            }else {
                if (c>a && b<c){
                    System.out.println(c+" is largest");
                }else {
                    if (a==b || a==c || b == c){
                        System.out.println("All equal");
                    }
                }
            }
        }
    }
}
