package CodingNinja.Milestone5.DynamicProgramming_DP_1;

public class BalancedBTs_CountHeight1 {
    /*---------------Normal Function-------------------*/
    public static int countBalancedBTs(int h){
        int mod = (int)Math.pow(10,9)+7;
        return countBalancedBTs(h,mod);
    }
    private static int countBalancedBTs(int h,int mod){
        if(h==0 || h==1) return 1;
        int x = countBalancedBTs(h-1);
        int y = countBalancedBTs(h-2);
        long res1 = (long)x*x;
        long res2 = (long) x*y*2;
        int value1 = (int)(res1%mod);
        int value2 = (int)(res2%mod);
        return (value1+value2)%mod;
    }
    /*---------------End Normal Function-------------------*/
    /*-------------------------Dynamic Programming Function--------------------------------------*/
    public static int countBalancedBTsDp(int n){
        if (n==0) return 0;
        int mod = (int) Math.pow(10,9)+7;
        int[] storage = new int[n+1];
        storage[0]=storage[1]=1;
        for (int i=2; i<=n; i++){
            long temp1 = (long) storage[i-1]*storage[i-1];
            temp1 = temp1%mod;

            long temp2 = (long) 2*storage[i-1]*storage[i-2];
            temp2 = temp2%mod;
            storage[i] = (int) (temp1+temp2)%mod;
        }
        return storage[n];
    }
    /*-------------------------End Dynamic Programming Function--------------------------------------*/
    public static void main(String[] args) {
        int n=44;
        System.out.println(countBalancedBTsDp(n));
        System.out.println(countBalancedBTs(n));
    }
}

/*
input 7
output 396813529
-----------------
input 4
output 315

 */