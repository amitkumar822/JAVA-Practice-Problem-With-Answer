public class PrimeNumber2 {
    public static void main(String[] args) {
        int[] array = {10, 4, 10, 8, 11, 2, 9, 5, 3, 7, 22, 6};
        int smallestPrimeIndex = findSmallestPrimeIndex(array);
        System.out.println("The smallest index of the prime number in the array is: " + smallestPrimeIndex);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int findSmallestPrimeIndex(int[] array) {
        int smallestPrimeIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                smallestPrimeIndex = i;
                break;
            }
        }

        return smallestPrimeIndex;
    }
}