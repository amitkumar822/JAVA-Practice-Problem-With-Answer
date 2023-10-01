package PreplnstaOnlineQuiestionAndCodeProvide;

public class PalindromeRecursion {
    static int isPalindrome(int num, int result){
        if (num==0) return result;
        int rd = num%10;
        result = result*10+rd;
        return isPalindrome(num/10,result);
    }
    public static void main(String[] args) {
        int num = 123454321;
        int result =0;
        if (isPalindrome(num,result) == num) {
            System.out.println("This number "+num+" is Palindrome");
        }else System.out.println("This number "+num+" is not Palindrome");
    }
}
