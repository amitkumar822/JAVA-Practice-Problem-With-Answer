package CodingNinja.Milestone5.DynamicProgramming_DP_1;

public class balancedBTs_Long2 {
    public static long countBalancedHeight(long h){
        long mod = (long) Math.pow(10,9)+7;
        return countBalancedHeight(h,mod);
    }
    private static long countBalancedHeight(long h,long mod){
        if(h==0 || h==1) return 1;
        long x = countBalancedHeight(h-1);
        long y = countBalancedHeight(h-2);

        long res1 = x*x;
        long res2 = y*x*2;

        long value1 = (res1%mod);
        long value2 = (res2%mod);

        return (value1+value2)%mod;
    }

    public static void main(String[] args) {
        long h = 7;
        long result = countBalancedHeight(h);
        System.out.println(result);
    }
}


/*
Code: Number of Balanced BTs
Send Feedback
Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the count of possible binary trees which are balanced.
This number can be huge, so, return output modulus 10^9 + 7.
Write a simple recursive solution.
Input Format :
The first and only line of input contains an integer, that denotes the value of h. Here, h is the height of the tree.
Output Format :
The first and only line of output contains the count of balanced binary trees modulus 10^9 + 7.
Constraints :
1 <= h <= 24
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
15
Sample Input 2:
4
Sample Output 2:
315
 */