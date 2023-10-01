public class PowerCalculate {
    public static int calcPower(int x, int n){
        if (n == 0){  //base case 1
            return 1;
        }
        if (x == 0){  // base case 1
            return 0;
        }
        int xPower1 = calcPower(x, n-1); // kam
        int xPow = x * xPower1;
        return xPow;
    }
    public static void main(String[] args) {
       int x = 2, n= 5;
       int ans = calcPower(x,n);
        System.out.println("x Power n is = "+ans);
    }
}
