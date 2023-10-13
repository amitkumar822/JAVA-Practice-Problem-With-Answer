package CodingNinja.Milestone5.DynamicProgramming_DP_2;

public class LCS {
    /*---------------------Normal Function------------------------*/
    public static int lcs(String s,String t){
        if(s.length()==0 || t.length()==0){
            return 0;
        }
        if(s.charAt(0)==t.charAt(0)){
            return 1+lcs(s.substring(1),t.substring(1));
        }else {
            int op1 = lcs(s,t.substring(1));
            int op2 = lcs(s.substring(1),t);
            return Math.max(op1,op2);
        }
    }
    /*---------------------End Normal Function------------------------*/

    /*---------------------Memoization Function----------------------*/
    public static int lcmM(String s,String t){
        int m = s.length();
        int n = t.length();
        int[][] storage = new int[m+1][n+1];
        for (int i=0; i<=m; i++){
            for (int j=0; j<=n; j++){
                storage[i][j] = -1;
            }
        }
        return lcmM(s,t,storage);
    }

    private static int lcmM(String s, String t, int[][] storage) {
        int m = s.length();
        int n = t.length();
        if(storage[m][n] !=-1){
            return storage[m][n];
        }
        if(m==0 || n==0){
            storage[m][n]=0;
            return storage[m][n];
        }
        if(s.charAt(0) == t.charAt(0)){
            storage[m][n] = 1 + lcmM(s.substring(1),t.substring(1),storage);
        }else{
            int op1 = lcmM(s,t.substring(1),storage);
            int op2 = lcmM(s.substring(1),t,storage);
            storage[m][n] = Math.max(op1,op2);
        }
        return storage[m][n];
    }

    /*---------------------End Memoization Function----------------------*/
    /*---------------------Dynamic Function----------------------*/
    public static int lcmDP(String s,String t){
        int m = s.length();
        int n= t.length();
        int[][] storage = new int[m+1][n+1];
        for (int i=0; i<=m; i++){
            storage[i][0] =0;
        }
        for (int j=0; j<=n; j++){
            storage[0][j] = 0;
        }

        for(int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                if(s.charAt(m-i) ==  t.charAt(n-j)){
                    storage[i][j] = 1 + storage[i-1][j-1];
                }else{
                    storage[i][j] = Math.max(storage[i][j-1],storage[i-1][j]);
                }
            }
        }
        return storage[m][n];
    }
    /*---------------------End Dynamic Function----------------------*/
    public static void main(String[] args) {
//        String s = "dgeigeigeigeigeigeigeigeigeigeigeigeigeigeigeigeigeigei";
//        String t = "begiegiegiegiegiegiegiegiegiegiegiegiegiegiegiegiegiegiegiegiegiegiegiegi"; //2
        String s = "pqqrpt";
        String t = "qerepct";
        System.out.println(lcmDP(s,t));
        System.out.println(lcmM(s,t));
        System.out.println(lcs(s,t));
    }
}
