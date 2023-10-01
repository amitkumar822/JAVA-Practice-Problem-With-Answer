package PreplnstaOnlineQuiestionAndCodeProvide;

public class StrongNumber1 {
    //function to calculate factorial
    static int facto(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

    static boolean detectStrong(int num){
        int digit, sum=0;
        int temp = num;
        boolean flag = false;
        //calculate 1!+4!+5!
        while (temp != 0){
            digit = temp % 10;
            sum = sum + facto(digit);
            temp /=10;
        }

        // returns 1 if both equal else 0
        if (sum == num)
            flag = true;
        else
            flag=false;
        return flag;
    }
    public static void main(String[] args) {
        int num=145;
        if (detectStrong(num)){
            System.out.println(num+" is Strong number");
        }else {
            System.out.println(num+" is not a Strong number");
        }
    }
}


//        Input : 145
//        Output : Yes, it's a strong number
//        Explanation : Number = 145
//        145 = 1! + 4! + 5!
//        145 = 1 + 24 + 120
//        output number  = 145.