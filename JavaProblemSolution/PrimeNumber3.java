package ZZ_StartingTimePr;

import java.util.List;
import java.util.ArrayList;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int data[] = {2, 7, 15, 11, 4, 23, 19, 6, 13, 29};
        List<Integer> heightPrime = findeHeightPrime(data,3);
        System.out.println("Three height prime number "+heightPrime);

        List<Integer> smallePrime = findSmallPrime(data,3);
        System.out.println("Three small prime number : " +smallePrime);
    }

    public static List<Integer> findeHeightPrime (int[] data, int count){
        List<Integer> primes = new ArrayList<>();

        for (int num : data){
            if (isPrime(num)){
                primes.add(num);

                if (primes.size() > count){
                    primes.remove(primes.stream().min(Integer::compare).orElse(null));
                }
            }
        }
        return primes;
    }

    public static List<Integer> findSmallPrime(int[] data, int count){
        List<Integer> primes = new ArrayList<>();

        for (int num: data){
            if (isPrime(num)){
                primes.add(num);

                if (primes.size() > count){
                    primes.remove(primes.stream().max(Integer::compare).orElse(null));
                }
            }
        }
        return primes;
    }

    public static boolean isPrime(int num){
        if (num <=1){
            return false;
        }
        for (int i=2; i<Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
