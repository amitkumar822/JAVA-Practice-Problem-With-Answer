package CodingNinja.Milestone5.DynamicProgramming_DP_1;

public class MinSquaresCount {
    /*-------------------------Normal Function--------------------------------------*/
    public static int minSquareN(int n){
        if(n==0) return 0;
        int minAns = Integer.MAX_VALUE;
        for (int i=1; i*i<=n; i++){
            int curAns = minSquareN(n-(i*i));
            if (minAns > curAns){
                minAns = curAns;
            }
        }
        int myAns = 1 + minAns;
        return myAns;
    }
    /*-------------------------End Normal Function--------------------------------------*/


    /*-------------------------Dynamic Programming Function--------------------------------------*/
    //Time and space Complexity is O(n)
    //n>10^4 so Stack OverFlow
    public static int minSquaresDP(int n){
        int[] dp = new int[n+1];
        for (int i=0; i<dp.length; i++){
            dp[i] = -1;
        }
        return minSquaresDp(n,dp);
    }
    private static int minSquaresDp(int n,int[] dp){
        if(n==0) return 0;
        int minAns = Integer.MAX_VALUE;
        for(int i=1; i*i<=n; i++){
            int currAns;
            if(dp[n-(i*i)] == -1){
                currAns = minSquaresDp(n-(i*i),dp);
                dp[n-(i*i)] = currAns;
            }else {
                currAns = dp[n-(i*i)];
            }
            if(minAns > currAns){
                minAns = currAns;
            }
        }
        int myAns = 1 + minAns;
        return myAns;
    }
    /*-------------------------End Dynamic Programming Function--------------------------------------*/

    /*------------------------Iterative Programming Function-----------------------------------------*/
    //Time and space Complexity is O(n)
    //n>10^4 no Stack OverFlow
    //This is Better to Dynamic Programming
    public static int minSquareI(int n){
        int[] storage = new int[n+1];

        for (int i=1; i<=n; i++){
            int minAns = Integer.MAX_VALUE;
            for (int j=1; j*j<=i; j++){
                int curAns = storage[i-(j*j)];
                if(minAns > curAns){
                    minAns = curAns;
                }
            }
            storage[i] = 1 + minAns;
        }
        return storage[n];
    }

    /*------------------------End Iterative Programming Function-----------------------------------------*/

    public static void main(String[] args) {
        int n = 66655566; //3
       // System.out.println(minSquaresDP(n));
        System.out.println(minSquareI(n));
        //System.out.println(minSquareN(n));
    }
}
