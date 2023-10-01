package SelfWork;

public class AddStarAprev1 {
    public static void main(String[] args) {
        String str = "banana";
        char[] ch = str.toCharArray();

        System.out.print("Final Result is here : -> ");
        for(int i=0; i<str.length(); i++){
            if (ch[i] == 'a'){
                System.out.print("*a");
            }else {
                System.out.print(ch[i]);
            }
        }
    }
}
