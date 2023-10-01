package PreplnstaOnlineQuiestionAndCodeProvide;

public class FactorsNumber2 {
    static void factorNum(int num){
        for (int i=1; i<=(num)/2; i++){
            if (num%i==0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        int num = 10;
        factorNum(num);
    }
}
