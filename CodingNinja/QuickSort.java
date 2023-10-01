package CodingNinja;
import java.util.Scanner;
public class QuickSort {


    public static void quickSort(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * No need to print or return the output.
         * Taking input and printing output is handled automatically.
         */
        quickSort(input,0,input.length-1);

    }
    public static void quickSort(int[] input,int sI,int eI){
        //base case
        if(sI>=eI)
            return;

        int pivotPos=partition(input,sI,eI);
        quickSort(input,sI,pivotPos-1);
        quickSort(input,pivotPos+1,eI);
    }
    public static int partition(int input[],int sI,int eI)
    {
        int pivot=input[sI];
        int count=0;
        for(int i=sI+1;i<=eI;i++)
        {
            if(input[i]<=pivot)
                count++;
        }
        int pivotPos=sI+count;
        int temp=input[sI];
        input[sI]=input[pivotPos];
        input[pivotPos]=temp;
        int i=sI;
        int j=eI;
        while(i<pivotPos && j>pivotPos)
        {
            if(input[i]<=input[pivotPos])
                i++;
            else if(input[j]>input[pivotPos])
                j--;
            else
            {
                int temp_=input[i];
                input[i]=input[j];
                input[j]=temp_;
                i++;j--;

            }
        }
        return pivotPos;
    }

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput(){
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        quickSort(input);
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
