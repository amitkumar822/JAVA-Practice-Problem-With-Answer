package Placment;

import java.util.Scanner;

public class ArrayFindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size Number : ");
        int size = sc.nextInt();
        System.out.println("Enter array");
        int number[] = new int[size];
        for (int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        System.out.println("Enter finde index array : ");
        int x = sc.nextInt();
        for (int i=0; i<size; i++){
            if (number[i] == x){
                System.out.println("X found at index "+i);
            }
        }
    }
}
