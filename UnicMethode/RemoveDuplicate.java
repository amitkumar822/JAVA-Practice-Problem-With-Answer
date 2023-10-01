package UnicMethode;

public class RemoveDuplicate {
    static void removeDuplicate(int[] num){
        int count=0;
        for(int i=1; i<num.length; i++){
            if(num[count] != num[i]){
                count++;
                num[count] = num[i];
                int res=num[count];
                System.out.print(res+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] num = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Final Sorted list : ");
        removeDuplicate(num);
    }
}
