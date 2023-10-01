package PreplnstaOnlineQuiestionAndCodeProvide;

public class FindGCDorHCF_2_UsingRecursive {
    //1st Method
    public static int getGCD(int num1, int num2){
        if (num1==0) return num2;
        if (num2==0) return num1;
        if (num1 == num2) return num1;
        if (num1 > num2) return getGCD(num1-num2,num2);
        return getGCD(num1,num2-num1);
    }

    //2nd Method
    public static int getHCF(int num1,int num2){
        return num2==0 ? num1 : getHCF(num2,num1%num2);
    }
    public static void main(String[] args) {
        int num1=36, num2=60;
        System.out.println("Final 1st Method GCD is here : ");
        System.out.println(getGCD(num1,num2));

        // 2nd method ans
        System.out.println("Final 2nd Method GCD or HCF is here : ");
        System.out.println(getHCF(num1,num2));
    }
}
