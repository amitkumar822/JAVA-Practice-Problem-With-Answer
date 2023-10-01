package PreplnstaOnlineQuiestionAndCodeProvide;

public class ReverseDigitRecursion {
    static int Reverse(int num, int rev){
        if (num == 0) return rev;
        int rd = num%10;
        rev = rev*10+rd;
        return Reverse(num/10,rev);
    }
    public static void main(String[] args) {
        int num = 12345678;
        int rev=0;
        System.out.println(Reverse(num,rev));
    }
}
