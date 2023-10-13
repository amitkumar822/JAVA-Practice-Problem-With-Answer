package CodingNinja.Milestone5.DynamicProgramming_DP_2;

public class Knapsack {
    /*---------------------Normal Function------------------------*/
    public static int knapsack(int[] weights,int[] values,int maxWeight){
        return knapsack(weights,values,maxWeight,0);
    }

    private static int knapsack(int[] weights, int[] values, int maxWeight, int i) {
        if(i==weights.length || maxWeight==0) return 0;
        if(weights[i] > maxWeight){
            return knapsack(weights,values,maxWeight,i+1);
        }else{
            //include this ith item
            int op1 = values[i]+knapsack(weights,values,maxWeight-weights[i],i+1);
            //don't include
            int op2 = knapsack(weights,values,maxWeight,i+1);
            return Math.max(op1,op2);
        }
    }
    /*---------------------Normal Function------------------------*/

    public static int knapsackI(int[] wt,int[] val,int W){
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
        for (int i=n-1; i>=0; i--){
            for (int j=0; j<=W; j++){
                int ans;
                if(wt[i] <= j){
                    int ans1 = val[i] + dp[i+1][j-wt[i]];
                    int ans2 = dp[i+1][j];
                    ans = Math.max(ans1,ans2);
                }else {
                    ans = dp[i+1][j];
                }
                dp[i][j] = ans;
            }
        }
        return dp[0][W];
    }

    public static void main(String[] args) {
//        int[] weights = {6,1,2,4,5};
//        int[] values = {10,5,4,8,6};
//        int maxWeight = 5;
        int[] weights = {4,5,1};
        int[] values = {1,2,3};
        int maxWeight = 4;
        System.out.println(knapsackI(weights,values,maxWeight));
        System.out.println(knapsack(weights,values,maxWeight));
    }
}
