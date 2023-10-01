package UnicMethode;

import java.util.Scanner;

public class FirstAndLastAlternatively {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            System.out.print(arr[left++] + " ");
            if (left <= right) {
                System.out.print(arr[right--] + " ");
            }
        }

        System.out.println();
    }
}

