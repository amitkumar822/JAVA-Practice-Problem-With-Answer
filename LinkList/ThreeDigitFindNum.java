package LinkList;

import java.util.Scanner;

public class ThreeDigitFindNum {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter number : ");
        long num = s.nextLong();
        String str = String.valueOf(num);

        char chars[] = str.toCharArray();
        int len = chars.length;
        int size = len%3 ==0 ? len/3 : len/3+1;

        int a[] = new int[size];
        int index =0;

        for (int i=0; i<len-2; i+=3){
            int fd = chars[i]-'0';
            int sd = chars[i+1] -'0';
            int td = chars[i+2]-'0';

            if (fd != sd && fd != td){
                int pair = (fd*100)+(sd*10)+td;
                a[index++] = pair;
            }
        }
        int max =a[0];
        for (int i=0; i< index; i++){
            if (max < a[i]){
                max = a[i];
            }
        }

        System.out.println("Final three sorted number : ");
        System.out.println(max);



    }
}
