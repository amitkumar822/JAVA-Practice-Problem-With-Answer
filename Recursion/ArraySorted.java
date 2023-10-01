package Recursion;

public class ArraySorted {

    //First method arraySorted check
    public static boolean checkSorted(int input[]){
        if (input.length <= 1){
            return true;
        }
        int smallInput[] = new int[input.length-1];
        for (int i = 1; i< input.length; i++){
            smallInput[i-1] = input[i];
        }
        boolean smallAns = checkSorted(smallInput);
        if (!smallAns){
            return false;
        }if (input[0] <= input[1]){
            return true;
        }
        else {
            return false;
        }
    }


    //second method check ArraySorted
    public static boolean checkSorted(int input[], int startIndex){
        if (startIndex >= input.length-1){
            return true;
        }
        if (input[startIndex] >= input[startIndex+1]){
            return false;
        }
        boolean smallAns = checkSorted(input, startIndex+1);
        return smallAns;
    }

    public static void main(String[] args) {
        int input[] ={1,2,3,4};

        System.out.print("First method ArraySorted check => ");
        System.out.println(checkSorted(input));
        System.out.print("Second method ArraySorted => ");
        System.out.println(checkSorted(input,0));
    }
}
