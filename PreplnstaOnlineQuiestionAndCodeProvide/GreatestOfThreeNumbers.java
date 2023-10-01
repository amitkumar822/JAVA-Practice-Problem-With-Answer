package PreplnstaOnlineQuiestionAndCodeProvide;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        int num1=10, num2=33, num3=22;
        int temp, result;

        temp = num1>num2 ? num1:num2;
        result = temp>num3 ? temp:num3;
        System.out.println(result);
    }
}
