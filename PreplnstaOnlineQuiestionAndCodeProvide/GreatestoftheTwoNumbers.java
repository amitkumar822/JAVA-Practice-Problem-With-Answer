package PreplnstaOnlineQuiestionAndCodeProvide;

public class GreatestoftheTwoNumbers {
    public static void main(String[] args) {
        int a = 40, b=140;
        if (a==b){
            System.out.println("Bot are Equal");
        }else {
            int temp = a>b ? a : b;
            System.out.println(temp+" is largest");
        }
    }
}
