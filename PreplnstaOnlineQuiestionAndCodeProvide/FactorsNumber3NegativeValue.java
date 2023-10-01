package PreplnstaOnlineQuiestionAndCodeProvide;

public class FactorsNumber3NegativeValue {
    public static void main(String[] args) {
        int num = -100;
        System.out.print("Factors of "+num+" are : ");

        for (int i=num; i<= Math.abs(num); ++i){
            if (i==0){
                continue;
            }else {
                if (num%i==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
