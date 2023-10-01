package PreplnstaOnlineQuiestionAndCodeProvide;

public class FindGCDorHCF_1 {
    public static void main(String[] args) {
        int num1 = 36, num2=60;
        int HCF=0;
        for(int i=1; i<num1 || i<num2; i++){
            if (num1%i==0 && num2%i==0){
                HCF = i;
            }
        }
        System.out.println("Method 1st : ");
        System.out.println(num1+" and "+num2+" HCF is :-> "+HCF);


        //2nd Method
        while (num1 != num2){
            if (num1 > num2){
                num1 -= num2;
            }else {
                num2 -= num1;
            }
        }
        System.out.println("2nd Method : ");
        System.out.println(" HFC :->"+num1);
    }
}
