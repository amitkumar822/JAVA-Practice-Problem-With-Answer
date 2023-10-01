package UnicMethode;

public class UnicLatterFindDuplicate {
    public static void main(String[] args) {
        String str = "sample test case";  //sample test case->sae t(output)  //English word->None(output)
        int count=0;

        char string[] = str.toCharArray();

        System.out.println("Duplicate characters in a given string: ");

        int ct=0;
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j]) {
                    count++;
                    ct++;
                    string[j] = '0';
                }
            }
            if(count > 1 && string[i] != '0') {
                System.out.print(string[i]);
//                break;
            }
        }
        if (ct==0){
            System.out.println("None");
        }

    }
}
