package UnicMethode;
import java.util.Scanner;
public class MinValueGivenArray {
    //Given a sorted array decreasing order find min value
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter Your ZZ_StartingTimePr.Array element: ");
        for (int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        int min = num[0];
        for(int i=1; i<size; i++){
            if(num[i] == num[i-1]){
                if (num[i] < min){
                    min=num[i];
                }
            }
        }
        System.out.println("Final Min Value : ");
        System.out.println(min);
    }
}
