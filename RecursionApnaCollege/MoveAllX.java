package RecursionApnaCollege;

public class MoveAllX {
    public static void PrintMoveAllX(String str, int idx, int count, String newString){
        if (idx == str.length()){
            for (int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x'){
            count++;
            PrintMoveAllX(str,idx+1,count,newString);
        }else {
            newString  += currChar;
            PrintMoveAllX(str,idx+1, count,newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbxcxxdef";
        System.out.println("Final All x Move is hear : ");
        PrintMoveAllX(str,0,0," ");
    }
}
