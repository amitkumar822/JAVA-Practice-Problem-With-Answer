package LinkList;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        // Given data
        int[] data = {2, 7, 15, 11, 4, 23, 19, 6, 13, 29};

        // Find the three largest prime numbers
        List<Integer> largestPrimes = findLargestPrimes(data, 3);
        System.out.println("Three largest prime numbers: " + largestPrimes);

        // Find the three smallest prime numbers
        List<Integer> smallestPrimes = findSmallestPrimes(data, 3);
        System.out.println("Three smallest prime numbers: " + smallestPrimes);
    }

    public static List<Integer> findLargestPrimes(int[] data, int count) {
        List<Integer> primes = new ArrayList<>();

        for (int num : data) {
            if (isPrime(num)) {
                primes.add(num);

                if (primes.size() > count) {
                    // Remove the smallest prime number from the list
                    primes.remove(primes.stream().min(Integer::compare).orElse(null));
                }
            }
        }

        return primes;
    }

    public static List<Integer> findSmallestPrimes(int[] data, int count) {
        List<Integer> primes = new ArrayList<>();

        for (int num : data) {
            if (isPrime(num)) {
                primes.add(num);

                if (primes.size() > count) {
                    // Remove the largest prime number from the list
                    primes.remove(primes.stream().max(Integer::compare).orElse(null));
                }
            }
        }

        return primes;
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

}

