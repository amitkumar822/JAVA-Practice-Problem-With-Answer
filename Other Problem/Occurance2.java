public class Occurance2 {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, char el, int idx){
        if (idx == str.length()){
            return;
        }

        if (str.charAt(idx) == el){
            if (first == -1){
                first = idx;
            }
            else {
                last = idx;
            }
        }
        findOccurance(str,el,idx+1);
    }
    public static void main(String[] args) {
        String str = "tabcdfghijakkk";
        char el ='a';
        findOccurance(str, el, 0);
        System.out.println("First occurence : "+first);
        System.out.println("Last occurence : "+last);
    }
}
