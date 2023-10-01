package PreplnstaOnlineQuiestionAndCodeProvide;

public class ReverseDigit {
    public static void main(String[] args) {
        int num = 123456;
        int reverse =0;
        while (num != 0){
            int rd = num%10;
            reverse = reverse*10+rd;
            num /=10;
        }
        System.out.println("Reverse digits is here : "+reverse);
    }
}
