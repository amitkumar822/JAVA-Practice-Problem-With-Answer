package PreplnstaOnlineQuiestionAndCodeProvide;

import java.util.Scanner;

public class PrimeMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Output:");

        for (int i = 0; i < size; i++) {
            int number = numbers[i];
            int largestPrime = findLargestPrimeLessThan(number);

            if (largestPrime == -1) {
                System.out.println("Invalid Input");
            } else {
                System.out.print(largestPrime + " ");
            }
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int findLargestPrimeLessThan(int number) {
        if (number <= 2) {
            return -1; // There is no prime number less than 2
        }

        for (int i = number - 1; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }

        return -1; // If no prime number is found
    }
}
