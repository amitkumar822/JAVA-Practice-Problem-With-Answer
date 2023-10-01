package ZZ_StartingTimePr;

class fact
{
    public void factor(int number)
    {
        int num=number;
        int i,fact=1;
        for (i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("ZZ_StartingTimePr.Factorial of"+num+"is:"+""+fact);
    }
}
public class Factorial {
    public static void main(String[] args) {
        int number=5;
        System.out.println("ZZ_StartingTimePr.Factorial Number");
        System.out.println("**************");
        fact objf1=new fact();
        objf1.factor(number);
    }
}
