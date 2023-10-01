package Recursion;

public class PowerCal {

    public static int calcPower(int x, int n){
        if (n !=0 ){
            return (x*calcPower(x, n-1));
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        int x=2, n=5;
        int ans = calcPower(x,n);
        System.out.println("Power "+x+" of "+n+" is = "+ans);
    }
}
