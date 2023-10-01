public class MoveALLX {
    public static void mainallx(String str, int idx, int count, String newString){
        if (idx == str.length()){
            for (int i=0; i<count; i++){
                newString +='x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x'){
            count++;
            mainallx(str, idx+1, count,newString);

        }else {
            newString += currChar;
            mainallx(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        mainallx(str,0,0,"");
    }
}
