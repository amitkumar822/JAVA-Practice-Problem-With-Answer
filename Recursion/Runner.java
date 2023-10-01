package Recursion;
import java.util.Scanner;

public class Runner {

        public static int count(int n) {
            //Write your code here
            int count = 0;
            while (n != 0) {
                n = n / 10;
                ++count;
            }
            return count;

        }

        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int n = 15456;
            System.out.println(count(n));
        }

    }