package LinkList;

import java.util.Scanner;

public class TwoDigHigFou {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        long num = s.nextLong();
        String str = String.valueOf(num);

        char chars[] = str.toCharArray();
        int len = chars.length;
        int size = len%2==0 ? len/2 : len/2+1;

        int ar[] = new int[size];
        int index =0;
        for (int i=0; i<len-1; i +=2){
            int fd = chars[i] - '0';
            int ls = chars[i+1] - '0';

            if (fd != ls){
                int pairs = (fd*10) + ls;
                ar[index++] = pairs;
            }
        }
        int mix = 0;
        for (int i=0; i<index; i++){
            if(mix < ar[i]){
                mix = ar[i];
            }
        }
        System.out.println("Final two digit height : ");
        System.out.println(mix);
    }
}
