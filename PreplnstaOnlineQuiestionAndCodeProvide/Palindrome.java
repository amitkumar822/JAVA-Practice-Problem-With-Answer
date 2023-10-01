package PreplnstaOnlineQuiestionAndCodeProvide;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1234321;
        int org = num;
        int result =0;
        while (num != 0){
            int rem = num%10;
            result = result*10+rem;
            num /=10;
        }
        if (org == result) System.out.print("This number "+org+" is Palindrome");
        else System.out.print("This number "+org+" is not Palindrome");
    }
}
